package View;

import javax.swing.JOptionPane;

public class ViewMenu {
		private String menu;
		
		
		public String getMenu() {
			this.menu = JOptionPane.showInputDialog(
					"Escolha uma upção" + "\n" + 
			"1 - Pesquisar Modalidades de um Esporte"+ "\n"+
			"2 - Comparar Medalhas com EUA"+ "\n"+
			"3- Comparar Medalha ente Paises" + "\n" +
							"4- Sair");
		return this.menu;
		}
	}


