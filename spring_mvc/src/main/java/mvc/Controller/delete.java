/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Controller;

import mvc.Entity.User;
import mvc.Entity.attendance;
import mvc.Entity.punchOut;
import mvc.hibernate.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author bharat
 */
@Controller
public class delete {
    
    @Autowired
    private dao d;
    
   
    @RequestMapping("/delete")
    public String del(Model model){
        System.out.println("this is home url");
        model.addAttribute("name", "bharat");
        return "delete";
    }
    
      @RequestMapping(path="/delete" , method=RequestMethod.POST)
    public String delete(@ModelAttribute("user") User user,Model model){
        this.d.delete(user);
      return"home";  
    }
    
   
}
