package sistema.dao.transactional;
import java.io.Serializable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Interceptor
@Transactional
public class TransactionInterceptor implements Serializable {

	private static final long serialVersionUID = -7589539028297322937L;

	@Inject
	private transient EntityManager em;

	@AroundInvoke
	public Object invoke(InvocationContext context) throws Exception {
		EntityTransaction transaction = em.getTransaction();
		boolean criadorDaTransaction = false;

		try {
			if (!transaction.isActive()) {
				// truque para fazer rollback no que já passou
				// (senão, um futuro commit, confirmaria até mesmo operações sem transação)
				transaction.begin();
				transaction.rollback();
				
				// agora sim inicia a transação
				transaction.begin();
				
				criadorDaTransaction = true;
			}

			return context.proceed();
		} catch (Exception e) {
			if (transaction != null && criadorDaTransaction) {
				transaction.rollback();
			}

			throw e;
		} finally {
			if (transaction != null && transaction.isActive() 
					&& criadorDaTransaction) {
				transaction.commit();
			}
		}
	}
}