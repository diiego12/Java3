
package com.katherine.hibernate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class ControllerNomina {
    @RequestMapping(value="/nomina/{}/{}", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable String nombre, @PathVariable float sueldo){
           DAONominaImpl d= new DAONominaImpl();
           d.agregarNomina(null);
           return "Nomina guardada con exito";
    }    
    
}
