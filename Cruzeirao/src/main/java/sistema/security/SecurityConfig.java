package sistema.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;


@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

private static UserDetailsService usuarioService = new UsuarioSistemaService();
	
	
	
   @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	   auth.userDetailsService(usuarioService);
    }

    //@Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	//Controle feito pelo JSF
    	http.csrf().disable();
    	    	
    	//Página de acesso negado
        http.exceptionHandling().accessDeniedPage("/pages/adm/organizador/InicialUser/acessonegado.xhtml");
        
        //Libera todos os recursos do JSF
        http.authorizeRequests().antMatchers("/pages/adm/organizador/InicialUser/**", "/resources/**","/javax.faces.resource/**","/webapp/resources/**").permitAll();
        
        //Controla o acesso a página protegida  do adm e superadmin        
       	http.authorizeRequests().antMatchers("/pages/**").hasAnyRole("ORGANIZADOR","DIRETOR","JOGADOR","TECNICO","PREPARADOR_FISICO","MASSAGISTA");
    	http.authorizeRequests().antMatchers("/pages/adm/diretor/**").hasAnyRole("ORGANIZADOR","DIRETOR");
        
       // http.authorizeRequests().antMatchers("/pages/superadm/**" ).hasRole("SUPERADMIN");        
        
		
    	
    	//Login
    	http.formLogin().loginPage("/pages/adm/organizador/InicialUser/login.xhtml").permitAll()
		.defaultSuccessUrl("/pages/adm/organizador/inicio.xhtml", true)
		.failureUrl("/pages/adm/organizador/InicialUser/login.xhtml?error=true")
		.usernameParameter("username")
		.passwordParameter("password");
    	
    	
    	//Logout
        http.logout().logoutUrl("/logout").logoutSuccessUrl("/pages/adm/organizador/InicialUser/login.xhtml");

        // Todas as requisições para partes internas da aplicação devem ser autenticadas
		http.authorizeRequests().anyRequest().authenticated();
    	
    	
    	
        
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
        web.ignoring().antMatchers("/javax.faces.resource/**");
        web.ignoring().antMatchers("/webapp/resources/**");
        //web.ignoring().antMatchers("/pages/adm/organizador/InicialUser/comuns/**");//paginas a serem ignoradas no caso login,index e 
    }
}

