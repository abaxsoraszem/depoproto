package depoproto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Depot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String kundennummer;
	private String wkn;
	private Integer stueckzahl;
	private Double kaufpreiss;
	private Double wertentwicklung;
	private LocalDate kaufdatum;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}
	public String getWkn() {
		return wkn;
	}
	public void setWkn(String wkn) {
		this.wkn = wkn;
	}
	public Double getKaufpreiss() {
		return kaufpreiss;
	}
	public void setKaufpreiss(Double kaufPreis) {
		this.kaufpreiss = kaufPreis;
	}
	public Double getWertentwicklung() {
		return wertentwicklung;
	}
	public void setWertentwicklung(Double wertEntwicklung) {
		this.wertentwicklung = wertEntwicklung;
	}
	public LocalDate getKaufdatum() {
		return kaufdatum;
	}
	public void setKaufdatum(LocalDate kaufDatum) {
		this.kaufdatum = kaufDatum;
	}
	public Integer getStueckzahl() {
		return stueckzahl;
	}
	public void setStueckzahl(Integer stueckzahl) {
		this.stueckzahl = stueckzahl;
	}
	
	
	
}

