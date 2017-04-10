package sistema.cruzeirao;

import java.util.ArrayList;
import java.util.Timer;

public class Partida {

	private Partida proxPartida;
	private Time timeVisitante;
	private Time timeMandante;
	private Timer tempo;
	private Juiz juiz;
	private Placar placar;
	private ArrayList<Cartao> cartoes = new ArrayList<Cartao>();
	private Chave chave;
	private Local local;
	
	public Partida(Local local){
		setLocal(local);
	}
	
	
	public void addCartoes(Cartao cartao){
		cartoes.add(cartao);
	}
	public Partida getProxPartida() {
		return proxPartida;
	}
	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}
	public Time getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public Time getTimeMandante() {
		return timeMandante;
	}
	public void setTimeMandante(Time timeMandante) {
		this.timeMandante = timeMandante;
	}
	public Timer getTempo() {
		return tempo;
	}
	public void setTempo(Timer tempo) {
		this.tempo = tempo;
	}
	public Juiz getJuiz() {
		return juiz;
	}
	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	public Placar getPlacar() {
		return placar;
	}
	public void setPlacar(Placar placar) {
		this.placar = placar;
	}
	public ArrayList<Cartao> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	public Chave getChave() {
		return chave;
	}
	public void setChave(Chave chave) {
		this.chave = chave;
	}


	public Local getLocal() {
		return local;
	}


	public void setLocal(Local local) {
		this.local = local;
	}
	
	
	
}
