package hr.vvg.java.web.klase;

public class Zadatak {
	
	// ATRIBUTI
	
	private Korisnik korisnik;
	private Projekt projekt;
	private String opisZadatka;
	private int trajanjeZadatka;
	
	// KONSTRUKTOR
	
	public Zadatak(Korisnik korisnik, Projekt projekt, String opisZadatka, int trajanjeZadatka) {
		super();
		this.korisnik = korisnik;
		this.projekt = projekt;
		this.opisZadatka = opisZadatka;
		this.trajanjeZadatka = trajanjeZadatka;
	}
	
	// GET METODE
	
	public Korisnik getKorisnik() {
		return korisnik;
	}

	public Projekt getProjekt() {
		return projekt;
	}

	public String getOpisZadatka() {
		return opisZadatka;
	}

	public int getTrajanjeZadatka() {
		return trajanjeZadatka;
	}

	// SET METODE
	
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public void setProjekt(Projekt projekt) {
		this.projekt = projekt;
	}

	public void setOpisZadatka(String opisZadatka) {
		this.opisZadatka = opisZadatka;
	}

	public void setTrajanjeZadatka(int trajanjeZadatka) {
		this.trajanjeZadatka = trajanjeZadatka;
	}
	
	
	

}
