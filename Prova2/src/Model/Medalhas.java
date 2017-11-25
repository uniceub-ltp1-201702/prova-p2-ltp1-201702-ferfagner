package Model;

public class Medalhas {
	private String pais;
	private int medalhaOuro;
	private int medalhaPrata;
	private int medalhaBronze;
	
	
	
	public Medalhas(String pais, int medalhaOuro, int medalhaPrata, int medalhaBronze) {
		super();
		this.pais = pais;
		this.medalhaOuro = medalhaOuro;
		this.medalhaPrata = medalhaPrata;
		this.medalhaBronze = medalhaBronze;
	}
	@Override
	public String toString() {
		return "Medalhas [pais=" + pais + ", medalhaOuro=" + medalhaOuro + ", medalhaPrata=" + medalhaPrata
				+ ", medalhaBronze=" + medalhaBronze + "]";
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getMedalhaOuro() {
		return medalhaOuro;
	}
	public void setMedalhaOuro(int medalhaOuro) {
		this.medalhaOuro = medalhaOuro;
	}
	public int getMedalhaPrata() {
		return medalhaPrata;
	}
	public void setMedalhaPrata(int medalhaPrata) {
		this.medalhaPrata = medalhaPrata;
	}
	public int getMedalhaBronze() {
		return medalhaBronze;
	}
	public void setMedalhaBronze(int medalhaBronze) {
		this.medalhaBronze = medalhaBronze;
	}
	
	
}
