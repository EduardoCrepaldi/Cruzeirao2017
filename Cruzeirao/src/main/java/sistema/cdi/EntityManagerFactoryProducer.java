package sistema.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 * Classe produtora de EntityManagerFactory para CDI
 * 
 *
 *
 */
@ApplicationScoped
@Named
public class EntityManagerFactoryProducer implements Serializable {

	private static final long serialVersionUID = 3811879914474709959L;

	private static final String NOME_DA_PERSISTENCE_UNIT = "Cruzeirao";


	/**
	 * Abre a EntityManagerFactory
	 * 
	 * @return Factory aberta
	 */
	@Produces
	@ApplicationScoped
	public EntityManagerFactory criar() {
		return Persistence.createEntityManagerFactory(NOME_DA_PERSISTENCE_UNIT);
	}

	/**
	 * Fecha a EntityManagerFactory
	 * 
	 * @param emf
	 *            Factory a ser fechada
	 */
	public void fechar(@Disposes EntityManagerFactory emf) {
		if (emf.isOpen()) {
			emf.close();
		}
	}
}