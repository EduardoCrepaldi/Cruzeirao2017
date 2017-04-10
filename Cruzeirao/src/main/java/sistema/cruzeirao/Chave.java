package sistema.cruzeirao;

import java.util.ArrayList;

public class Chave {

	private Categoria categoria;
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	private int maxPartidaIniciais;
	
	public void addPartidas(Partida partida){
		partidas.add(partida);
	}
	public Chave(Categoria categoria){
		setCategoria(categoria);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}


	public int getMaxPartidaIniciais() {
		return maxPartidaIniciais;
	}
	public void setMaxPartidaIniciais(int maxPartidaIniciais) {
		this.maxPartidaIniciais = maxPartidaIniciais;
	}
	
	
		
	
}
