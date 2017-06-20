package sistema.bens;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import sistema.util.AlertaUtil;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private AlertaUtil msg = new AlertaUtil();
	
	
	public void preRender(){
		
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		if ("true".equals(request.getParameter("error"))) {
			msg.exibirErroGrowl("Usuário ou senha inválidos");
		}
		
	}

}
