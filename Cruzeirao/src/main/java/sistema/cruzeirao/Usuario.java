package sistema.cruzeirao;

import java.io.Serializable;
import java.util.ArrayList;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import enums.Sexo;
import enums.Roles;

@Entity
@NamedQueries({
@NamedQuery(name = "Usuario.pesquisarPorUserName", query = "select u from Usuario u where u.username = :username"),
@NamedQuery(name = "Usuario.pesquisarJogador", query = "select u from Usuario u where u.role = enums.Roles.JOGADOR")
})
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 6360850095345609468L;
	public static final String PESQUISAR_POR_USERNAME = "Usuario.pesquisarPorUserName";
	public static final String PESQUISAR_JOGADOR = "Usuario.pesquisarJogador";
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto incremento para codUsuario
	private int id;
	private String username;
	private String email;
	
	private String password;
	private String dataNascimento;
	
	
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	
	@OneToMany(mappedBy="usuario")
	private ArrayList<Inscrito> inscricoes = new ArrayList<Inscrito>();
	
	@OneToMany
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	@Enumerated(EnumType.ORDINAL)
	private Roles role;
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
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	public Sexo[] getSexos(){
		return Sexo.values();
	}
	
	public Roles[] getRoles(){
		return Roles.values();
	}
	
	public void addEquipes(Equipe e){
		equipes.add(e);
	}
}
