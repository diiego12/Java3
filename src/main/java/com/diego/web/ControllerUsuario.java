package com.diego.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-usuario")
public class ControllerUsuario {

@RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=text/html")) //enviar y recibir texto html
public @ResponseBody String buscarTodos(){
       String mensajito="Probando el metodo GET para enviar a todos los usuarios";
    return mensajito;
}
}
