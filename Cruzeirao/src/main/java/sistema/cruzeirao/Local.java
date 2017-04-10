package sistema.cruzeirao;

import java.awt.Image;
import java.util.ArrayList;

public class Local {

	private String nome;
	private String endereco;
	private int capacidade;
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	private Image imagem;
	
	
	public void addPartidas(Partida partida){
		partidas.add(partida);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public Image getImagem() {
		return imagem;
	}
	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}
	
	
	
}
