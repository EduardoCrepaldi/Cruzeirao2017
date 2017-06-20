package sistema.cdi;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


/**
 * Classe produtora de EntityManagers para CDI
 * 
 * 
 */
public class EntityManagerProducer implements Serializable {

	private static final long serialVersionUID = -1021119833523730667L;

	@Inject
	private transient EntityManagerFactory emf;

	/**
	 * Abre uma EntityManager
	 * 
	 * @return EntityManager aberta
	 */
	@Produces
	@RequestScoped
	public EntityManager criar() {
		EntityManager em = emf.createEntityManager();
		return em;
	}

	/**
	 * Fecha uma EntityManager
	 * 
	 * @param em
	 *            EntityManager a ser fechada
	 */
	public void fechar(@Disposes EntityManager em) {
		if (em.isOpen()) {
			em.close();
		}

	}
}