package Control;

import java.util.ArrayList;
import Model.BD;

import Model.Medalhas;
import View.ViewDifencaEUA;
import View.ViewSolicitaPais;

public class ControleComparaEUA {
	private BD bds;
	
	public ControleComparaEUA(BD bds) {
		this.bds = bds;
	}
	public void diferencaEUA() {
		
		int difOuro= 0;
		int difPrata= 0;
		int difBronze=0;
		ArrayList<Medalhas> medalhas = this.bds.getMedalhas();
		ViewSolicitaPais vsp = new ViewSolicitaPais();
		String pais = vsp.getPais();
		
		String n = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equalsIgnoreCase(pais)) {
				difOuro = medalhas.get(i).getMedalhaOuro() - medalhas.get(i).getMedalhaOuro() ;
				difPrata = medalhas.get(i).getMedalhaPrata() - medalhas.get(i).getMedalhaPrata();
				difBronze = medalhas.get(i).getMedalhaBronze() - medalhas.get(i).getMedalhaBronze();
				
				n += "A diferença de Medalhas Entre " + pais + " e  os " + medalhas.get(0).getPais()
						+ "\n AS Medalhas de Ouro: " + difOuro + "\n AS Medalhas de Prata: "
						+ difPrata + "AS Medalhas de Bronze: " + difBronze; 
			}
			
			}
		ViewDifencaEUA vde = new ViewDifencaEUA(n);
	}
		
}		
			
		
	
		
	

