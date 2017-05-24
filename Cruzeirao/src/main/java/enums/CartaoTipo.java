package enums;

public enum CartaoTipo {

	VERMELHO("Vermelho"), Amarelo("Amarelo");
	
	private String tipo;
	
	CartaoTipo(String tipo){
		setTipo(tipo);
	}

	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
