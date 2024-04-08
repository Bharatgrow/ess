/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Controller;

import mvc.hibernate.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author bharat
 */
@Controller

public class punchOut {
    
    @Autowired
    private dao d;
    
     @RequestMapping("/punchout")
    public String at (){
       
        return "punchout";
    }
     @RequestMapping(path="/punchout" , method=RequestMethod.POST)
       public String help(@ModelAttribute("po") mvc.Entity.punchOut po){
         
           d.save(po);
           
           
           return "home";
       }
}
