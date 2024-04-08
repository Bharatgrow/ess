 
package mvc.Controller;

import javax.servlet.http.HttpSession;
import mvc.Entity.User;
import mvc.Entity.attendance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import mvc.hibernate.dao;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class homeController {
    @Autowired
   private dao d;
    
   
    
    @RequestMapping("/home")
    public String home (){
       
        return "home";
    }
    
    @RequestMapping("/attendance")
    public String at (){
       
        return "Attendance";
    }
     @RequestMapping(path="/attendance" , method=RequestMethod.POST)
       public String help(@ModelAttribute("at") attendance at){
         
           d.save(at);
           
           return "home";
       }
    
      
    
    
    @RequestMapping("/index")
    public String index(Model model){
        System.out.println("this is home url");
        model.addAttribute("name", "bharat");
        
        return "index";
    }
    
    @RequestMapping(path="/homeController" , method=RequestMethod.POST)
    public String help(@ModelAttribute("user") User user,Model model){
        System.out.println("help page");
        
     this.d.save(user);
      
          
            return "home";
    }
    
  
    
}
