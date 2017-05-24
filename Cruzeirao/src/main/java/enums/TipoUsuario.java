package enums;

public enum TipoUsuario {

	ORGANIZADOR("Organizador"),JOGADOR("Jogador"),DIRETOR("Diretor"),
	PREPARADOR_FISICO("Preparador Fisico"),MASSAGISTA("Massagista"),
	TECNICO("Tecnico");
	
	private String tipo;
	private TipoUsuario(String tipo) {
		setTipo(tipo);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
