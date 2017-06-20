package sistema.cdi.util;

import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;


public class CDIServiceLocator {

	private CDIServiceLocator() {
		// Esconde construtor padrão
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {
		
		BeanManager bm = BeanManagerProducer.getBeanManager();
		final Set<Bean<?>> beans = bm.getBeans(clazz);

		if (beans == null || beans.isEmpty()) {
			return null;
		}

		try {
			Bean<T> bean = (Bean<T>) beans.iterator().next();

			CreationalContext<T> ctx = bm.createCreationalContext(bean);
			return (T) bm.getReference(bean, clazz, ctx);
		} catch (Exception e) {
			throw new IllegalArgumentException("Falha ao obter o bean " + clazz.getName(), e);
		}
	}

}