package sistema.util;


import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * Classe auxíliar para exibir mensagens
 * 
 */

public class AlertaUtil{

	/**
	 * A mensagem será exibida somente no p:growl global
	 */
	protected static final String ID_GROWL = "mensagemGrowl";

	/**
	 * A mensagem será exibida em qualquer componente de mensagem
	 */
	protected static final String ID_MESSAGE = null;

	private static final String MENSAGEM_VAZIA = "";

	/**
	 * Exibe FacesMessage Error global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirErroGrowl(String cabecalho, String detalhes) {
        adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_GROWL, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Error global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirErroGrowl(String cabecalho) {
        adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_GROWL, cabecalho,
        		MENSAGEM_VAZIA);
	}

	/**
	 * Exibe FacesMessage Error direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirErroMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_MESSAGE, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Error direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirErroMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}

	/**
	 * Exibe FacesMessage Fatal global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirFatalGrowl(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_GROWL, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Fatal global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirFatalGrowl(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_GROWL, cabecalho,
				MENSAGEM_VAZIA);
	}

	/**
	 * Exibe FacesMessage Fatal direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirFatalMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_MESSAGE, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Fatal direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirFatalMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}
	
	/**
	 * Exibe FacesMessage Info global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirInfoGrowl(String cabecalho, String detalhes) {
        adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_GROWL, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Info global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirInfoGrowl(String cabecalho) {
        adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_GROWL, cabecalho,
        		MENSAGEM_VAZIA);
	}

	/**
	 * Exibe FacesMessage Info direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirInfoMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_MESSAGE, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Info direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirInfoMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}

	/**
	 * Exibe FacesMessage Warn global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirWarnGrowl(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_GROWL, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Warn global usando o p:growl
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirWarnGrowl(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_GROWL, cabecalho,
				MENSAGEM_VAZIA);
	}

	/**
	 * Exibe FacesMessage Warn direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 * @param detalhes - O corpo da mensagem
	 */
	public void exibirWarnMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_MESSAGE, cabecalho, detalhes);
	}

	/**
	 * Exibe FacesMessage Warn direcionado para todos p:messages
	 * 
	 * @param cabecalho - Cabeçalho da mensagem
	 */
	public void exibirWarnMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}

	private void adicionarMensagem(Severity severidade, String clientId, 
			String cabecalho, String detalhes) {
		FacesMessage message = new FacesMessage(severidade, cabecalho, detalhes);
        FacesContext.getCurrentInstance().addMessage(clientId, message);
	}
}
