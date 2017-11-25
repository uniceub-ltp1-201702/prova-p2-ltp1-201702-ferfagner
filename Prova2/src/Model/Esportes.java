package Model;

public class Esportes {
	private String esporte;
	private String modalidade;
	
	
	
	
	public Esportes(String esporte, String modalidade) {
		super();
		this.esporte = esporte;
		this.modalidade = modalidade;
	}
	@Override
	public String toString() {
		return  "Modalidade: " +  modalidade + "\n" ;
	}
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	
	
}
