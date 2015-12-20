package view;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;


public class liming {
	@RequestMapping(value="index.do")  
	    public void index_jsp(Model model){  
	        model.addAttribute("liming", "ÀèÃ÷ÄãºÃ");  
	        System.out.println("index.jsp");  
	    }  

}
