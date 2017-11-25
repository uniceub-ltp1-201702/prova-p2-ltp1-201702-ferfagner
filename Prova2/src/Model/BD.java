package Model;

import java.util.ArrayList;

import Util.DocumentReader;
import Util.DocumentWriter;

public class BD {
	private ArrayList<Esportes> esporte;
	private ArrayList<Medalhas> medalha;
	private String Filename = "esportes.txt";
	private String Filenamem = "medalahas.txt";
	
	
	
	public ArrayList<Esportes> getEsportes(){
		return esporte;
	}
	
	public ArrayList<Medalhas> getMedalhas(){
		return medalha;
	}
	
	
	public BD(){
	//ler esportes
		this.esporte = new ArrayList<Esportes>();
		
		DocumentReader dr = new DocumentReader();
		
		ArrayList<String> Linhas = dr.read(Filename);
		
		for (int i = 0; i < Linhas.size(); i++) {
			String [] linhaEsporte = Linhas.get(i).split(";");
			
			Esportes e = new Esportes(linhaEsporte[0], linhaEsporte[1]);
			
			this.esporte.add(e);
		}
		//ler medalhas
		this.medalha = new ArrayList<Medalhas>();
		
		DocumentReader drm = new DocumentReader();
		
		ArrayList<String> Linhasm = drm.read(Filenamem);
		
		for (int i = 0; i < Linhasm.size(); i++) {
			String [] linhaMedalhas = Linhasm.get(i).split(";");
			
			Medalhas m = new Medalhas(linhaMedalhas[0], Integer.parseInt(linhaMedalhas[1]), Integer.parseInt(linhaMedalhas[2]), Integer.parseInt(linhaMedalhas[3]));
			
			this.medalha.add(m);
		}
		
	}
	//gravar esportes
	public void gravarEsportes (Esportes e){
		this.esporte.add(e);
		
		String esporte = e.getEsporte() + ";" + e.getModalidade() ;
		
		DocumentWriter dw = new DocumentWriter();
		
		dw.write(Filename, esporte);
	}
	
	//gravar medalhas
	public void gravarMedalhas (Medalhas m){
		this.medalha.add(m);
		String medalhas = m.getPais() + ";" + m.getMedalhaOuro() + ";" + m.getMedalhaPrata() + ";" + m.getMedalhaBronze();
		
		DocumentWriter dwm = new DocumentWriter();
		
		dwm.write(Filenamem, medalhas);
	}
	//percorrer esporte por nome
	public Esportes getEsporteNome(String nome){
		Esportes retorno = null;
	for (int i = 0; i < this.esporte.size(); i++) {
		if (this.esporte.get(i).getEsporte().equals(nome)) {
			retorno = this.esporte.get(i);
		}
	}
	return retorno;
	}
	
}
