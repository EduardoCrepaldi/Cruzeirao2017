package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import org.eclipse.persistence.internal.libraries.asm.commons.SerialVersionUIDAdder;

@Entity
public class Campeonato implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCampeonato;
	
	private String nome;
	
	@OneToMany
	private ArrayList<Local> locais = new ArrayList<Local>();
	
	@OneToMany
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	
	@OneToMany(mappedBy="campeonato")
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
	
	private String dataInicioInscricao;
	
	private String dataFimInscricao;
	
	private String dataInicioCampeonato;
	
	private String dataFimCampeonato;
	
	private double valorTaxa;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataInicioInscricao() {
		return dataInicioInscricao;
	}
	public void setDataInicioInscricao(String dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}
	public String getDataFimInscricao() {
		return dataFimInscricao;
	}
	public void setDataFimInscricao(String dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}
	public String getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(String dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	public String getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(String dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	public ArrayList<Local> getLocais() {
		return locais;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	
	
	
}
