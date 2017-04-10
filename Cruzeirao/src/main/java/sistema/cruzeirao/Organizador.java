package sistema.cruzeirao;

import java.util.ArrayList;

public class Organizador extends Usuario{

	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();

	
	public void addCampeonato(Campeonato campeonato){
		campeonatos.add(campeonato);
	}
	
	public ArrayList<Campeonato> getCampeonato() {
		return campeonatos;
	}

	public void setCampeonato(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
	
}
