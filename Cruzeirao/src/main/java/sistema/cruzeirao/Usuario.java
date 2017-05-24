package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import enums.Sexo;
import enums.TipoUsuario;

@Entity
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto incremento para codUsuario
	private int idUsuario;
	
	private String email;
	private String nome;
	@Temporal(TemporalType.DATE)//tipo data no BD
	private Date dataNascimento;
	
	@ManyToMany(mappedBy = "diretores")
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	
	@OneToMany(mappedBy="usuario")
	private ArrayList<Inscrito> inscricoes = new ArrayList<Inscrito>();
	
	@OneToMany
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	
	private TipoUsuario tipo;
	private String  telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String rg;
	private String cpf;
	private String cref;
	private Sexo sexo;
	private String foto;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
	public ArrayList<Inscrito> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public TipoUsuario getTipo() {
		return tipo;
	}
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneMovel() {
		return telefoneMovel;
	}
	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCref() {
		return cref;
	}
	public void setCref(String cref) {
		this.cref = cref;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	
}
