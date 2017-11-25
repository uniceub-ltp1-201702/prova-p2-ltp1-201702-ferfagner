package Control;

import java.util.ArrayList;

import Model.BD;
import Model.Medalhas;
import View.ViewDifencaEUA;
import View.ViewSolicitaPais;

public class ControleDiferencaEntrePais {
	private BD bds;
	
		public ControleDiferencaEntrePais(BD bds) {
		this.bds = bds;
		}
		public void diferancaEntrePaises(){
			int difOuro1 = 0;
			int difPrata1 = 0;
			int difBronze1 = 0;
			
			int difOuro2 = 0;
			int difPrata2 = 0;
			int difBronze2 = 0;
			ViewSolicitaPais pais1 = new ViewSolicitaPais();
			String pais = pais1.getPais();
			ViewSolicitaPais pais2 = new ViewSolicitaPais();
			String pais02 = pais2.getPais();
			ArrayList<Medalhas> medalhas = bds.getMedalhas();
			
			String m = "";
			for (int i = 0; i < medalhas.size(); i++) {
				if (medalhas.get(i).getPais().equals(pais)) {
					difOuro1 = medalhas.get(i).getMedalhaOuro();
					difPrata1 = medalhas.get(i).getMedalhaPrata();
					difBronze1 = medalhas.get(i).getMedalhaBronze();
				}
				if (medalhas.get(i).getPais().equals(pais1)) {
					difOuro2 = medalhas.get(i).getMedalhaOuro();
					difPrata2 = medalhas.get(i).getMedalhaPrata();
					difBronze2 = medalhas.get(i).getMedalhaBronze();
				}
				difOuro2 = difOuro1 - difOuro2;
				difPrata2 = difOuro2 - difOuro1;
				m += "A diferença de Medalha entre " + pais1 + " e " + pais02 + "\n As Medalhas de Ouro: "
						+ difOuro2 + "\n As Medalhas de Prata: " + difPrata2
						+ "\n As Medalhas de Bronze: " + difBronze2;
			}
			ViewDifencaEUA vd = new ViewDifencaEUA(m);
		}
		
}
