package sistema.cruzeirao;

import java.util.ArrayList;
import java.util.Date;

public class Campeonato {

	private String nome;
	private Date anoAtual;
	private Date mesInicial;
	private Date mesFinal;
	private Date inscricaoInicial;
	private Date inscricaoFinal;
	private double taxaInscricao;
	private int min_Jogador;
	private int max_Jogador;
	private int min_Time;
	private int max_Time;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private Organizador organizador;
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	
	
	public Campeonato(Organizador org){
		setOrganizador(org);
	}
	
	
	public void addCategorias(Categoria cat){
		categorias.add(cat);
	}
	
	public void addJuizes(Juiz juiz){
		juizes.add(juiz);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getAnoAtual() {
		return anoAtual;
	}
	public void setAnoAtual(Date anoAtual) {
		this.anoAtual = anoAtual;
	}
	public Date getMesInicial() {
		return mesInicial;
	}
	public void setMesInicial(Date mesInicial) {
		this.mesInicial = mesInicial;
	}
	public Date getMesFinal() {
		return mesFinal;
	}
	public void setMesFinal(Date mesFinal) {
		this.mesFinal = mesFinal;
	}
	public Date getInscricaoInicial() {
		return inscricaoInicial;
	}
	public void setInscricaoInicial(Date inscricaoInicial) {
		this.inscricaoInicial = inscricaoInicial;
	}
	public Date getInscricaoFinal() {
		return inscricaoFinal;
	}
	public void setInscricaoFinal(Date inscricaoFinal) {
		this.inscricaoFinal = inscricaoFinal;
	}
	public double getTaxaInscricao() {
		return taxaInscricao;
	}
	public void setTaxaInscricao(double taxaInscricao) {
		this.taxaInscricao = taxaInscricao;
	}
	public int getMin_Jogador() {
		return min_Jogador;
	}
	public void setMin_Jogador(int min_Jogador) {
		this.min_Jogador = min_Jogador;
	}
	public int getMax_Jogador() {
		return max_Jogador;
	}
	public void setMax_Jogador(int max_Jogador) {
		this.max_Jogador = max_Jogador;
	}
	public int getMin_Time() {
		return min_Time;
	}
	public void setMin_Time(int min_Time) {
		this.min_Time = min_Time;
	}
	public int getMax_Time() {
		return max_Time;
	}
	public void setMax_Time(int max_Time) {
		this.max_Time = max_Time;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Organizador getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	
	
	
	
}
