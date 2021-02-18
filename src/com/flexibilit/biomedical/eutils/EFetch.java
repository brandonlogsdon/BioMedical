package com.flexibilit.biomedical.eutils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class EFetch {
	// Example URI: https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?db=pubmed&id=31697873&retmode=xml
	private static HttpClient client = null;
	private String baseAddress = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi";
	
	public EFetch() throws Exception {
		if(client == null)
			client = getHttpClient();
	}
	
	private HttpClient getHttpClient() {
		return HttpClient.newBuilder()
				.version(Version.HTTP_2)
				.followRedirects(Redirect.NEVER)
				.connectTimeout(Duration.ofSeconds(20))
				//.proxy(ProxySelector.getDefault())
				//.authenticator(Authenticator.getDefault())
				.build();
	}
	
	public String FetchXMLWithIdFromDatabase(String id, String database) throws IOException, InterruptedException {
		var uri = getURI(database,id);
		var response = responseToString(getAbstractFrom(uri));
		return response;
	}

	private URI getURI(String database, String id) {
		return URI.create(String.format("%s?%s", getBaseAddress(baseAddress), getQueryString(database,id)));
	}
	
	private String getBaseAddress(String address) {
		return String.format("%s", baseAddress);
	}
	
	private String getQueryString(String database, String id) {
		var queryString = buildQueryString("",getDatabaseQueryString(database));
		queryString = buildQueryString(queryString,getIdQueryString(id));
		queryString = buildQueryString(queryString,getReturnModeQueryString());
		return queryString;
	}
	
	private String buildQueryString(String queryString, String queryStringToAppend) {
		if(queryString.length() > 0)
			return String.format("%s&%s",queryString,queryStringToAppend);
		return queryStringToAppend;
	}
	
	private String getDatabaseQueryString(String database) {
		if(database.isEmpty()) return "";
		return String.format("db=%s",database);
	}
	
	private String getIdQueryString(String id) {
		if(id.isEmpty()) return "";
		return String.format("id=%s",id);
	}
	
	private String getReturnModeQueryString() {
		return "retmode=xml";
	}
	
	private HttpResponse<String> getAbstractFrom(URI address) throws IOException, InterruptedException {
		HttpRequest request = getHttpRequest(address);
		var result = client.send(request, BodyHandlers.ofString());
		return result;
	}
	
	private HttpRequest getHttpRequest(URI address) {
		return HttpRequest.newBuilder()
				.uri(address)
				.timeout(Duration.ofSeconds(2))
				.header("Content-Type", "application/xml")
				.GET()
				.build();
	}
	
	private String responseToString(HttpResponse<String> response) {
		if(response.statusCode() >= 200 && response.statusCode() <= 299) {
			return response.body();
		}
		return "";
	}
	
}
