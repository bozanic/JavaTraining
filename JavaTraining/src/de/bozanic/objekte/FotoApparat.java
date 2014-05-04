package de.bozanic.objekte;

public class FotoApparat {

	//Klassenvariablen
	public static final int MIN_BRENNWEITE=10;
	public static final int MAX_BRENNWEITE=270;
	
	
	//Objectvariablen 
	int megaPixel;
	double displayGroesse;
	boolean bildStabilisiert;
	String marke;
	String herstellungsland;
	int brennweiteMax;
	int brennweiteMin;
	
	
	
	//Konstruktoren
	public FotoApparat(){
		
	}
	
	
	//Objektmethoden
	public void machFoto(){
		System.out.println("Klick");
	}


	public int getMegaPixel() {
		return megaPixel;
	}


	public void setMegaPixel(int megaPixel) {
		this.megaPixel = megaPixel;
	}


	public double getDisplayGroesse() {
		return displayGroesse;
	}


	public void setDisplayGroesse(double displayGroesse) {
		this.displayGroesse = displayGroesse;
	}


	public String getMarke() {
		return marke;
	}


	public void setMarke(String marke) {
		this.marke = marke;
	}


	public int getBrennweiteMax() {
		return brennweiteMax;
	}

	public void setBrennweiten(int brennweiteMin, int brennweiteMax){
		if(brennweiteMin<=brennweiteMax){
			this.brennweiteMin=brennweiteMin;
			this.brennweiteMax=brennweiteMax;
		}else{
			System.out.println("Ihre Brennweitenangabe ist ungueltig");
		}
	}
		
	public int getBrennweiteMin() {
		return brennweiteMin;
	}


	public void setBildStabilisiert(boolean bildStabilisiert) {
		this.bildStabilisiert = bildStabilisiert;
	}


	public String getHerstellungsland() {
		return herstellungsland;
	}


	public void setHerstellungsland(String herstellungsland) {
		this.herstellungsland = herstellungsland;
	}
	
	
}
