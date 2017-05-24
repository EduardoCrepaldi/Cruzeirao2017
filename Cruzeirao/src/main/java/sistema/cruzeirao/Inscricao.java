package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.eclipse.persistence.internal.libraries.asm.commons.SerialVersionUIDAdder;

@Entity
public class Inscricao implements Serializable{

	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idInscricao;
	
	private long numero;
	private boolean pagamento;
	private boolean validada;
	
	@OneToMany(mappedBy="inscricao")
	private ArrayList<Inscrito> inscritos = new ArrayList<Inscrito>();
	
	@ManyToOne
	private Categoria categoria;
	
	@OneToMany
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	
	@ManyToOne
	private Equipe equipe;
	
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public boolean isValidada() {
		return validada;
	}
	public void setValidada(boolean validada) {
		this.validada = validada;
	}
	public ArrayList<Inscrito> getInscritos() {
		return inscritos;
	}
	public void setInscritos(ArrayList<Inscrito> inscritos) {
		this.inscritos = inscritos;
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
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public int getIdInscricao() {
		return idInscricao;
	}
	public void setIdInscricao(int idInscricao) {
		this.idInscricao = idInscricao;
	}
	
	
	
}
