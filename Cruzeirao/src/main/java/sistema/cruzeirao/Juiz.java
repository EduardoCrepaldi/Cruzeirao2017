package sistema.cruzeirao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Juiz implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJuiz;
	//TODO private enum Tipo
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdJuiz() {
		return idJuiz;
	}

	public void setIdJuiz(int idJuiz) {
		this.idJuiz = idJuiz;
	}
	
	
}
