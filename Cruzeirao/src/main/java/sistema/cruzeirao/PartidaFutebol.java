package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class PartidaFutebol extends Partida implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Gol> golsMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsVisitantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesVisitantes = new ArrayList<Gol>();
	private ArrayList<Cartao> cartoesMandante = new ArrayList<Cartao>();
	private ArrayList<Cartao> cartoesVisitante = new ArrayList<Cartao>();
	public ArrayList<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	public void setGolsMandantes(ArrayList<Gol> golsMandantes) {
		this.golsMandantes = golsMandantes;
	}
	public ArrayList<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void setGolsVisitantes(ArrayList<Gol> golsVisitantes) {
		this.golsVisitantes = golsVisitantes;
	}
	public ArrayList<Gol> getGolsPenaltesMandantes() {
		return golsPenaltesMandantes;
	}
	public void setGolsPenaltesMandantes(ArrayList<Gol> golsPenaltesMandantes) {
		this.golsPenaltesMandantes = golsPenaltesMandantes;
	}
	public ArrayList<Gol> getGolsPenaltesVisitantes() {
		return golsPenaltesVisitantes;
	}
	public void setGolsPenaltesVisitantes(ArrayList<Gol> golsPenaltesVisitantes) {
		this.golsPenaltesVisitantes = golsPenaltesVisitantes;
	}
	public ArrayList<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public ArrayList<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(ArrayList<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}
	
	
}
