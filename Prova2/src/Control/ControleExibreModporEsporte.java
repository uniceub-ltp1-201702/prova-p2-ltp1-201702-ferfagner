package Control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.BD;
import Model.Esportes;
import View.ViewExibeEsporte;
import View.ViewSolicitaEsporte;

public class ControleExibreModporEsporte {
	private BD bds;
	
	
	public ControleExibreModporEsporte(BD bds){
		this.bds = bds;
		
	}
	public void modalidadePorEsporte(){
		ArrayList<Esportes> esporte = this.bds.getEsportes();
		ViewSolicitaEsporte vse = new ViewSolicitaEsporte();
		String nome = vse.getEsporte();
		String e = "";
		
		for (int i = 0; i < esporte.size(); i++) {
			if (esporte.get(i).getEsporte().equals(nome)) {
				e = e + esporte.get(i);
			}
		}
		ViewExibeEsporte vee = new ViewExibeEsporte(e);
	}
	
	}
