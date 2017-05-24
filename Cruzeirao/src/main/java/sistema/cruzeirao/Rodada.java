package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rodada implements Serializable{
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRodada;
	
	private int numero;
	
	@ManyToOne
	private Grupo grupo;
	
	@OneToMany
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	public int getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(int idRodada) {
		this.idRodada = idRodada;
	}
	
	
}
