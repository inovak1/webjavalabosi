package hr.vvg.java.web.klase;

public class Korisnik {
	
	//ATRIBUTI
	
	private int idKorisnik;
	private String korisnickoIme, ime, prezime;
	
	
	//KONSTRUKTOR
	
	public Korisnik(int idKorisnik, String korisnickoIme, String ime, String prezime) {
		super();
		this.idKorisnik = idKorisnik;
		this.korisnickoIme = korisnickoIme;
		this.ime = ime;
		this.prezime = prezime;
	}

	// GET METODE
	
	public int getIdKorisnik() {
		return idKorisnik;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	//SET METODE
	
	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}
	
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	
	
}
