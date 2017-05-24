package sistema.cruzeirao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Juiz implements Serializable{

	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJuiz;
	//TODO private enum Tipo
	
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getIdJuiz() {
		return idJuiz;
	}

	public void setIdJuiz(int idJuiz) {
		this.idJuiz = idJuiz;
	}
	
	
}
