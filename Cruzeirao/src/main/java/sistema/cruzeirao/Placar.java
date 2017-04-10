package sistema.cruzeirao;

public class Placar {

	private Time timeGanhador;
	private Time timePerdedor;
	private int golVisitante;
	private int golMandante;
	private Partida partida;
	
	public Placar(Partida partida){
		setPartida(partida);
	}
	
	
	public Time getTimeGanhador() {
		return timeGanhador;
	}
	public void setTimeGanhador(Time timeGanhador) {
		this.timeGanhador = timeGanhador;
	}
	public Time getTimePerdedor() {
		return timePerdedor;
	}
	public void setTimePerdedor(Time timePerdedor) {
		this.timePerdedor = timePerdedor;
	}
	public int getGolVisitante() {
		return golVisitante;
	}
	public void setGolVisitante(int golVisitante) {
		this.golVisitante = golVisitante;
	}
	public int getGolMandante() {
		return golMandante;
	}
	public void setGolMandante(int golMandante) {
		this.golMandante = golMandante;
	}


	public Partida getPartida() {
		return partida;
	}


	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	
	
	
}
