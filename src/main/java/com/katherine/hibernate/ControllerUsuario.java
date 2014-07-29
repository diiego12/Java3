package com.katherine.hibernate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class ControllerUsuario {
    @RequestMapping(value="/usuario/{nombre}/{sueldo}", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable String nombre, @PathVariable float sueldo){
           DAOUsuarioImpl d= new DAOUsuarioImpl();
           d.agregarUsuario(null);
           return "Usuario guardado con exito";
    }    
}
