package sistema.cdi.util;

import javax.enterprise.inject.spi.BeanManager;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Classe auxiliar para obter o BeanManager e evitar duplicações de código. Não
 * adicionar nada que não for relacionado a isso aqui.
 * 
 * @author Gabriel Pedote
 *
 */

public final class BeanManagerProducer {

	private static final Log log = LogFactory.getLog(BeanManagerProducer.class);

	private BeanManagerProducer() {
		// Esconde construtor padrão
	}

	public static BeanManager getBeanManager() {
		InitialContext contexto;
		try {
			contexto = new InitialContext();
		} catch (NamingException e) {
			throw new RuntimeException("Falha ao obter o contexto", e);
		}

		try {
			return (BeanManager) contexto.lookup("java:comp/env/BeanManager");
		} catch (NamingException e1) {
			log.info("Falha ao procurar o contexto CDI. Tentando segunda opção", e1);

			try {
				return (BeanManager) contexto.lookup("java:comp/BeanManager");
			} catch (NamingException e2) {
				throw new RuntimeException("Não foi possível encontrar BeanManager no JNDI.", e2);
			}
		}
	}

}
