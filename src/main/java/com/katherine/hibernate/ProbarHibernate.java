package com.katherine.hibernate;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class ProbarHibernate {
    public static void main(String[] args) {
        try {
            
            Session sesion = Utilidades.getSessionFactory().openSession();
            
            //Paso 1. Empezar la sesion
        sesion.getTransaction().begin();
        
        //Paso 2. Hacer una operacion
        
        //Guardar registro (INSERT)
        //sesion.save(new Usuario3(1, "Kenneth","1234"));
       
        /*Consulta de todos (SELECT *) a traves de Query
        Query q = sesion.createQuery("from Usuario3");
        ArrayList<Usuario3> us = (ArrayList<Usuario3>) q.list();
        
        for(Usuario3 u : us){
            System.out.println(u);
        }*/
        
        //Actualizar registros (UPDATE)
        //sesion.update(new Usuario3(1,"clarkenet","1234"));
        
        //Consulta de todos (SELECT *) a traves de Criteria
        Criteria crit = sesion.createCriteria(Usuario.class);
        ArrayList<Usuario> us = (ArrayList<Usuario>) crit.list();
        
        for(Usuario u : us){
            System.out.println(u);
        }
        
        //Paso 3. Hacer el commit
        sesion.getTransaction().commit();
        
        //Paso 3.5. Usar el Flush
        //sesion.flush();
        
        //Paso 4. Cerrar la sesion
        sesion.close();
            //System.out.println("Se ha guardado con exito este registro");
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
