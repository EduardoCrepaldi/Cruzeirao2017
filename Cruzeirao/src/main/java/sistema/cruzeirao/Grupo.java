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
public class Grupo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGrupo;
	
	private String nome;
	
	@ManyToOne
	private Fase fase;
	
	@OneToMany(mappedBy="grupo")
	private ArrayList<Rodada> rodadas = new ArrayList<Rodada>();
	
	private int numero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public ArrayList<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(ArrayList<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	
}
