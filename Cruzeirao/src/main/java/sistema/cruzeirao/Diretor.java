package sistema.cruzeirao;

import java.util.ArrayList;

public class Diretor extends Membro{

	private ArrayList<Time> times = new ArrayList<Time>();
	private int anoCargo;
	
	public void addTimes(Time time){
		times.add(time);
	}
	
	public ArrayList<Time> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}
	public int getAnoCargo() {
		return anoCargo;
	}
	public void setAnoCargo(int anoCargo) {
		this.anoCargo = anoCargo;
	}

	
}
