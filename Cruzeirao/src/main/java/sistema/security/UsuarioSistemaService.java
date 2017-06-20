package sistema.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import sistema.cdi.util.CDIServiceLocator;
import sistema.cruzeirao.Usuario;

import sistema.dao.UsuarioDAO;



/**
 * Service dedicado para fazer o meio de campo entre
 * JSF e o Spring Security 
 * 
 *
 * 
 */

public class UsuarioSistemaService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(final String login) throws UsernameNotFoundException {
		
		UsuarioDAO usuarioService = CDIServiceLocator.getBean(UsuarioDAO.class);
				
		//Pesquisar o usuário no banco
		Usuario usuario = usuarioService.pesquisarPorUserName(login);
		
		
		if (usuario != null) {
			return new UsuarioSistema(usuario, obtemGruposdoUsuario(usuario));
		}

		throw new UsernameNotFoundException("Usuário não encontrado");
	}

	private Collection<? extends GrantedAuthority> obtemGruposdoUsuario(Usuario usuario) {
		List<GrantedAuthority> papeis = new ArrayList<>();
		
		papeis.add(new SimpleGrantedAuthority("ROLE_" + usuario.getRole()));

		return papeis;
	}

}
