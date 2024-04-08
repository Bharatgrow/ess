/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Controller;

import mvc.Entity.User;
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
public class update {
    @Autowired
    private dao d;
    @RequestMapping("/update")
    public String del(Model model){
        System.out.println("this is home url");
        model.addAttribute("name", "bharat");
        return "update";
    }
    
      @RequestMapping(path="/update" , method=RequestMethod.POST)
    public String update(@ModelAttribute("user") User user,Model model){
        this.d.update(user);
      return"home";  
    } 
}
