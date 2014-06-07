package com.diego.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServiciosKatherine {

@Bean
Persona ejecutarGracia(){
    
    return new CuentaChistes();
}
    
}
