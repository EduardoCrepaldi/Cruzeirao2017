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
	
	public SecurityConfig() {
		 
	}
	
   @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	   auth.userDetailsService(usuarioService);
	   
        
        
    }

    //@Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	//Controle feito pelo JSF
    	http.csrf().disable();
    	    	
    	//Página de acesso negado
        http.exceptionHandling().accessDeniedPage("/pages/inicial/acessonegado.xhtml");
        
        //Libera todos os recursos do JSF
        http.authorizeRequests().antMatchers("/javax.faces.resource/**","/pages/**" , "/webapp/resources/**").permitAll();
        
            
        //Controla o acesso a página protegida  Organizador        
        http.authorizeRequests().antMatchers("/pages/organizador/**","/pages/**").hasRole("Organizador");
                
        //Controla o aceso a pagina protegida Diretor
        http.authorizeRequests().antMatchers("/pages/diretor/**").hasRole("Diretor");
    	
    	//Login
    	http.formLogin().loginPage("/pages/comuns/inicial/login.xhtml").permitAll()
		.defaultSuccessUrl("/pages/inicio.xhtml", true)
		.failureUrl("/pages/comuns/inicial/login.xhtml?error=true")
		.usernameParameter("userName")
		.passwordParameter("password");
    	
    	
    	//Logout
        http.logout().logoutUrl("/logout")
                     .logoutSuccessUrl("/login.xhtml");

        // Todas as requisições para partes internas da aplicação devem ser autenticadas
		http.authorizeRequests().anyRequest().authenticated();
    	
    	
    	
        
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**", "/javax.faces.resource/**","/webapp/resources/**");
      
    }
}

