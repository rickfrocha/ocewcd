package componentes;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/****
 * Exemplo de componente Web
 * 
 * @author darochri
 *
 */
public class MyCustomTag extends SimpleTagSupport{

	private String usuario;

	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public void doTag() throws JspException, IOException {
        JspWriter out = super.getJspContext().getOut();
        out.println("<script> ");
        out.println("function hello(){ ");
        out.println(" alert('hello: "+ this.getUsuario() +"');");
        out.println("} ");
        out.println("</script> ");
        out.println("<script> hello(); </script>");
	}

}
