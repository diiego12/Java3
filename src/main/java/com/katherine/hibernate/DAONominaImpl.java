package com.katherine.hibernate;

import static com.katherine.hibernate.DAO.close;
import static com.katherine.hibernate.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;

public class DAONominaImpl extends DAO{
    public void agregarNomina(Nomina cliente) {
    begin();
    getSession().save(cliente);
    commit();
    close();
    
    }
 
       /**
        * Este metodo obtiene todos los registros de la tabla cliente 
        * @return Este metodo nos regresa todos los clientes
        */
    public ArrayList<Nomina> buscarTodasNominas() {
        begin();
      Criteria c=getSession().createCriteria(Nomina.class);
      ArrayList<Nomina> nm = (ArrayList<Nomina>)c.list();
        commit();
        close();
         
return nm; 
        
      
    }
    /**
     * Este metodo borra un cliente
     * @param p Se le debe pasar un parametro de tipo cliente para ser borrado
     */
 public void borrarNomina(Usuario p){
            begin();
            getSession().delete(p);
            commit();
            close();
 }   
        /**
         * Este metodo busca un cliente por medio de su Id
         * @param id Este parametro es el Id del cliente que se quiere buscar
         * @return El tipo de retorno es el cliente buscado
         */
  public Usuario buscarNominaPorId(int id){
      begin();
     Query q = getSession().createQuery("from Nomina where id = :id");
        q.setInteger("id",id);
        Usuario p = (Usuario)q.uniqueResult();
        commit();
        close();
return p;  
   
    }
}
