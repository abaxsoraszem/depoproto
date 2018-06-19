package depoproto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kunde {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
	@Id
	private String kundennummer;
	
	private String vorname;
	private String name;
	private String stadt;
	private String strasse;
	private LocalDate geburtsdatum;
	private Double kontoumsatz;
	
	
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String stasse) {
		this.strasse = stasse;
	}
	public String getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public Double getKontoumsatz() {
		return kontoumsatz;
	}
	public void setKontoumsatz(Double kontoumsatz) {
		this.kontoumsatz = kontoumsatz;
	}
	
	
	

}


