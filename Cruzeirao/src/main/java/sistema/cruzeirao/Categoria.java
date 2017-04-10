package sistema.cruzeirao;

import java.util.ArrayList;

public class Categoria {

	private Organizador organizador;
	private String nome;
	private int idadeMin;
	private char Sexo;
	private boolean habilitarJogadores;
	private boolean habilitarTime;
	private Campeonato campeonato;
	private ArrayList<Time> times = new ArrayList<Time>();
	private Chave chave;
	
	public Categoria(Chave chave){
		setChave(chave);
	}
	
	
	public void addTimes(Time time){
		times.add(time);
	}
	
	public void alteracaoTime(){
		
	}

	public void alteracaoJogadores(){
			
	}
	public ArrayList<Time> getTimes() {
		return times;
	}


	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}


	public Categoria(Campeonato campeonato){
		setCampeonato(campeonato);
	}
	
	
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Organizador getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdadeMin() {
		return idadeMin;
	}
	public void setIdadeMin(int idadeMin) {
		this.idadeMin = idadeMin;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public boolean isHabilitarJogadores() {
		return habilitarJogadores;
	}
	public void setHabilitarJogadores(boolean habilitarJogadores) {
		this.habilitarJogadores = habilitarJogadores;
	}
	public boolean isHabilitarTime() {
		return habilitarTime;
	}
	public void setHabilitarTime(boolean habilitarTime) {
		this.habilitarTime = habilitarTime;
	}


	public Chave getChave() {
		return chave;
	}


	public void setChave(Chave chave) {
		this.chave = chave;
	}
	
	
	
}
