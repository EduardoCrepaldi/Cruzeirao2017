package sistema.cruzeirao;

import java.util.ArrayList;

public class Time {

	private String nome;
	private Diretor diretor;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	private ArrayList<PreparadorFisico> prepFisicos = new ArrayList<PreparadorFisico>();
	private ArrayList<Massagista> massagistas = new ArrayList<Massagista>();
	private ArrayList<AuxiliarTecnico> auxTecnico = new ArrayList<AuxiliarTecnico>();
	private Tecnico tecnico;
	private Categoria categoria;
	
	public Time(Diretor diretor){
		setDiretor(diretor);
	}
	
	public void addJogadores(Jogador jogador){
		jogadores.add(jogador);
	}
	public void addPrepFisicos(PreparadorFisico prep){
		prepFisicos.add(prep);
	}
	public void addMassagistas(Massagista massagista){
		massagistas.add(massagista);
	}
	public void addAuxTecnico(AuxiliarTecnico auxTecnico){
		this.auxTecnico.add(auxTecnico); 
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public ArrayList<PreparadorFisico> getPrepFisicos() {
		return prepFisicos;
	}
	public void setPrepFisicos(ArrayList<PreparadorFisico> prepFisicos) {
		this.prepFisicos = prepFisicos;
	}
	public ArrayList<Massagista> getMassagistas() {
		return massagistas;
	}
	public void setMassagistas(ArrayList<Massagista> massagistas) {
		this.massagistas = massagistas;
	}
	public ArrayList<AuxiliarTecnico> getAuxTecnico() {
		return auxTecnico;
	}
	public void setAuxTecnico(ArrayList<AuxiliarTecnico> auxTecnico) {
		this.auxTecnico = auxTecnico;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
