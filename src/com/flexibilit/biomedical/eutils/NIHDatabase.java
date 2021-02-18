package com.flexibilit.biomedical.eutils;

public class NIHDatabase {
	private String _entrezDatabase = "";
	private String _uidCommonName = "";
	private String _eutilityDatabaseName = "";
	
	public NIHDatabase(String entrezDatabase, String uidCommonName, String eutilityDatabaseName) {
		_entrezDatabase = entrezDatabase;
		_uidCommonName = uidCommonName;
		_eutilityDatabaseName = eutilityDatabaseName;
	}
	
	public String getEntrezDatabase() {
		return _entrezDatabase;
	}
	
	public void setEntrezDatabase(String entrezDatabase) {
		_entrezDatabase = entrezDatabase;
	}
	
	public String getUIDCommonName() {
		return _uidCommonName;
	}
	
	public void setUIDCommonName(String uidCommonName) {
		_uidCommonName = uidCommonName;
	}
	
	public String getEUtilityDatabaseName() {
		return _eutilityDatabaseName;
	}
	
	public void setEUtilityDatabaseName(String eutilityDatabaseName) {
		_eutilityDatabaseName = eutilityDatabaseName;
	}
}
