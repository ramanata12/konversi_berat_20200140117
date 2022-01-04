/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi.berat.konversiberat;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author MSi-GAMING
 */
@Controller
public class controller {
    
    @RequestMapping("/berat")
    @ResponseBody
    public String getBerat(HttpServletRequest data){
        
        int get = Integer.parseInt(data.getParameter("data"));
       
        double bobot = konversi.KgKeGram(get);
        double bobot1 = konversi.KgKeOns(get);
        double bobot2 = konversi.KgKePon(get);
      
        
        
        return "Kg = " + get + " Kg"+"<p>" + "<hr>" 
                +"Gram  = " + bobot + " g"+"<p>"
                +"Ons = " +bobot1 + " Ons" +"<p>"
                +"Pon = " +bobot2 + " pon";
    }
    
    @RequestMapping("/gram")
    @ResponseBody
    public String getGram(HttpServletRequest data){
        
        
        int get = Integer.parseInt(data.getParameter("data"));
        
        
        double bobot = konversi.GramKeKg(get);
        
        return  "Gram = " + get + " g" + "<p>" +"<hr>"+
                "Kg = " + bobot + " kg";
    }
    
    @RequestMapping("/ons")
    @ResponseBody
    public String getOns(HttpServletRequest data){
 
        int get = Integer.parseInt(data.getParameter("data"));
      
        double bobot = konversi.OnsKeKg(get);
        
        return  "Ons = " + get + " ons" + "<p>" +"<hr>"+
                "Kg = " + bobot + " Kg";
    }
    
    @RequestMapping("/pon")
    @ResponseBody
    public String getPon(HttpServletRequest data){
        
        int get = Integer.parseInt(data.getParameter("data"));
        
        double bobot =  konversi.PonKeKg(get);
        
        return "Pon = " + get +" pon"+ "<p>" +"<hr>"+
                "Kg = " + bobot + " Kg";
    } 
}

