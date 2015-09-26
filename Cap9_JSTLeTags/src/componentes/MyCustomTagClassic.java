package componentes;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class MyCustomTagClassic extends javax.servlet.jsp.tagext.TagSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String[] optionsList = null;
	private String name;
	
    private int currentIndex;
    private int size;
	public String[] getOptionsList() {
		return optionsList;
	}

	//Getters And Setters
	public void setOptionsList(String[] optionsList) {
		this.optionsList = optionsList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
	//Business
    private void doInitMyComponent(){
	    try {
			JspWriter out = pageContext.getOut();
			out.println("<select name='"+this.getName()+"' size='"+this.getSize()+"'>");
		} catch (Exception e) {
			System.out.println("Falha ao inicilizar MyComponent");
		}	
    }
    
    private void doEndMyComponent(){
	    try {
			JspWriter out = pageContext.getOut();
			out.println("</select>");
		} catch (Exception e) {
			System.out.println("Falha ao finalizar MyComponent");
		}	    	
    }
    
	private void doEvaluateColorItem(){
		try {
	      JspWriter out = pageContext.getOut();			
		  String currentColor = optionsList[currentIndex];	            
		  out.println("<option value='"+currentColor+"'>");
		  out.println(currentColor );
		  out.println("</option> " );
		  currentIndex++;				
		} catch (Exception e) {
			System.out.println("Falha ao escrever option.");
		}
	}

	
	//Cicle of Life.
	public int doStartTag() throws JspException{
	  currentIndex = 0;
	  this.doInitMyComponent();
	  this.doEvaluateColorItem();
	  return EVAL_BODY_INCLUDE;	
	}
	
	
	public int doAfterBody() throws JspException{
		if(currentIndex < optionsList.length){
		   doEvaluateColorItem();	
		   return EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException{
		doEndMyComponent();
		return EVAL_PAGE;
	}

}
