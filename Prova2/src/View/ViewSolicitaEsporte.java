package View;

import javax.swing.JOptionPane;

public class ViewSolicitaEsporte {
	private String esporte;

	public String getEsporte() {
		return esporte;
	}
	
	public ViewSolicitaEsporte(){
		this.esporte = JOptionPane.showInputDialog("Insira o nome do esporte");
	}
}
