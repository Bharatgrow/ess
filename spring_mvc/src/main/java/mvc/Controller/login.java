
package mvc.Controller;

import java.util.Base64;
import javax.servlet.http.HttpSession;
import mvc.Entity.User;
import mvc.Entity.attendance;
import mvc.hibernate.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class login {
    @Autowired
   private dao d;
    
    @RequestMapping("/")
    public String login(){
    return "login";
    
}
    
     
    
    
    @RequestMapping(path="/loginservlet",method=RequestMethod.POST)
    public String logins(@ModelAttribute("user") User user ,HttpSession session){
        
     
          
       boolean value= d.login(user);
        User uname=d.getuserById(user.getId());
       if(value){
           
           String base64Image = Base64.getEncoder().encodeToString(uname.getImage());
           
         session.setAttribute("id", uname.getId());
        session.setAttribute("name", uname.getName());
        session.setAttribute("image", base64Image);
        return "home";
         
             
       }else{
           return "login";
       }
       // return "home";
        
    
}
}
