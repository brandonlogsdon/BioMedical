package com.flexibilit.biomedical.eutils;

public class NIHDatabaseMap {
	public static NIHDatabase BioProject = new NIHDatabase("BioProject", "BioProject ID", "bioproject");
	public static NIHDatabase BioSample = new NIHDatabase("BioSample", "BioSample ID", "biosample");
	public static NIHDatabase BioSystems = new NIHDatabase("Biosystems", "BSID", "biosystems");
	public static NIHDatabase Books = new NIHDatabase("Books", "Book ID", "books");
	public static NIHDatabase ConservedDomains = new NIHDatabase("Conserved Domains", "PSSM-ID", "cdd");
	public static NIHDatabase dbGaP = new NIHDatabase("dbGaP", "dbGaP ID", "gap");
	public static NIHDatabase dbVar = new NIHDatabase("dbVar", "dbVar ID", "dbvar");
	public static NIHDatabase Epigenomics = new NIHDatabase("Epigenomics", "Epigenomics ID", "epigenomics");
	public static NIHDatabase EST = new NIHDatabase("EST", "GI number", "nucset");
	public static NIHDatabase Gene = new NIHDatabase("Gene", "Gene ID", "gene");
	public static NIHDatabase Genome = new NIHDatabase("Genome", "Genome ID", "genome");
	public static NIHDatabase GEODatasets = new NIHDatabase("GEO Datasets", "GDS ID", "gds");
	public static NIHDatabase GEOProfiles = new NIHDatabase("GEO Profiles", "GEO ID", "geoprofiles");
	public static NIHDatabase GSS = new NIHDatabase("GSS", "GI number", "nucgss");
	public static NIHDatabase HomoloGene = new NIHDatabase("HomoloGene", "HomoloGene ID", "homologene");
	public static NIHDatabase MeSH = new NIHDatabase("MeSH", "MeSH ID", "mesh");
	public static NIHDatabase NCBICppToolKit = new NIHDatabase("NCBI C++ Toolkit", "Toolkit ID", "toolkit");
	public static NIHDatabase NCBIWebSite = new NIHDatabase("NCBI Web Site", "Web Site ID", "ncbisearch");
	public static NIHDatabase NLMCatalog = new NIHDatabase("NLMC atalog", "NLM Catalog ID", "nlmcatalog");
	public static NIHDatabase Nucleotide = new NIHDatabase("Nucleotide", "GI number", "nuccore");
	public static NIHDatabase OMIA = new NIHDatabase("OMIA", "OMIA ID", "omia");
	public static NIHDatabase PopSet = new NIHDatabase("PopSet", "PopSet ID", "popset");
	public static NIHDatabase Probe = new NIHDatabase("Probe", "Probe ID", "probe");
	public static NIHDatabase Protein = new NIHDatabase("Protein", "GI number", "protein");
	public static NIHDatabase ProteinClusters = new NIHDatabase("Protein Clusters", "Protein Cluster ID", "proteinclusters");
	public static NIHDatabase PubChemBioAssay = new NIHDatabase("PubChem BioAssay", "AID", "pcassay");
	public static NIHDatabase PubChemCompound = new NIHDatabase("PubChem Compound", "CID", "pccompound");
	public static NIHDatabase PubChemSubstance = new NIHDatabase("PubChem Substance", "SID", "pcsubstance");
	public static NIHDatabase PubMed = new NIHDatabase("PubMed", "PMID", "pubmed");
	public static NIHDatabase PubMedCentral = new NIHDatabase("PubMed Central", "PMCID", "pmc");
	public static NIHDatabase SNP = new NIHDatabase("SNP", "rs number", "snp");
	public static NIHDatabase SRA = new NIHDatabase("SRA", "SRA ID", "sra");
	public static NIHDatabase Structure = new NIHDatabase("Structure", "MMDB-ID", "structure");
	public static NIHDatabase Taxonomy = new NIHDatabase("Taxonomy", "TaxID", "taxonomy");
	public static NIHDatabase UniGene = new NIHDatabase("UniGene", "UniGene Cluster ID", "unigene");
	public static NIHDatabase UniSTS = new NIHDatabase("UniSTS", "STS ID", "unists");
}