package View;

import javax.swing.JOptionPane;

public class ViewSolicitaPais {
	private String pais;

	public ViewSolicitaPais(){
		this.pais = JOptionPane.showInputDialog("Insira o nome do pais");
	}
	
	public String getPais() {
		return pais;
	}
	
}
