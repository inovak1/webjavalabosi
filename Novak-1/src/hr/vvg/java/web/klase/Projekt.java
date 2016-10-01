package hr.vvg.java.web.klase;

public class Projekt {
	
	// ATRIBUTI
	
	private int idProjekt;
	private String nazivProjekta, nazivTvrtke;
	
	public Projekt (int idProjekt, String nazivProjekta, String nazivTvrtke) {
		this.idProjekt = idProjekt;
		this.nazivProjekta = nazivProjekta;
		this.nazivTvrtke = nazivTvrtke;
	}
	
	// GET METODE
	
	public int getIdProjekt () {
		return idProjekt;
	}
	
	public String getNazivProjekta () {
		return nazivProjekta;
	}
	
	public String getNazivTvrtke () {
		return nazivTvrtke;
	}
	
	// SET METODE
	
	public void setIdProjekt (int idProjekt) {
		this.idProjekt = idProjekt;
	}
	
	public void setNazivProjekta (String nazivProjekta) {
		this.nazivProjekta = nazivProjekta;
	}
	
	public void setNazivTvrtke (String nazivTvrtke) {
		this.nazivTvrtke = nazivTvrtke;
	}
}
