package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Fase implements Serializable{

	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFase;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	
	@ManyToOne
	private Categoria categoria;
	
	@OneToMany(mappedBy="fase")
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	
	private int numero;
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getIdFase() {
		return idFase;
	}
	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}
	
	
}
