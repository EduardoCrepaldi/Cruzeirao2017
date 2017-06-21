package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Equipe implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto incremento para codUsuario
	private int idEquipe;
	
	private String nome;
	
	private String dataFundacao;
	
	private String cidade;
	
	
	private Usuario diretor = new Usuario();
	
	private ArrayList<Usuario> jogadores = new ArrayList<Usuario>();
	
	public void addJogadores(Usuario jogador){
		jogadores.add(jogador);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Usuario getDiretor() {
		return diretor;
	}
	public void setDiretor(Usuario diretor) {
		this.diretor = diretor;
	}
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	public ArrayList<Usuario> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Usuario> jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
}
