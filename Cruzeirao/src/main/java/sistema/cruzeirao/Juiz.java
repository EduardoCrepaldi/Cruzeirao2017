package sistema.cruzeirao;

public class Juiz extends Usuario{

	private String rg;
	private int cpf;
	private Campeonato campeonato;
	
	public Juiz(Campeonato campeonato){
		setCampeonato(campeonato);
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	
	
}
