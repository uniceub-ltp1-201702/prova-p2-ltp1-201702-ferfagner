package Control;

import javax.swing.JOptionPane;

import Model.BD;
import View.ViewMenu;

public class ControleMenu {
	private BD bds;
	private ViewMenu vm;
	private ControleExibreModporEsporte ceme;
	
	
	public ControleMenu (BD bds){
		this.bds = bds;
		
		this.vm = new ViewMenu();
		this.ceme = new ControleExibreModporEsporte(this.bds);
		
		
		tratarMenu(this.vm.getMenu());
	}
	private void tratarMenu (String menu){
		while (true) {
			switch (menu) {
			case "1": this.ceme.modalidadePorEsporte();
			break;
			//case "2": this.ccm.cadastraMusica();
			//break;
			//case "3": this.cbmn.musicaNome();
			//break;
			case "4": JOptionPane.showMessageDialog(null, "Sair"); 
			return;
				
			default: JOptionPane.showMessageDialog(null, "Opção Invalida");
				break;
			}
			menu = this.vm.getMenu();
	}
	}
}
