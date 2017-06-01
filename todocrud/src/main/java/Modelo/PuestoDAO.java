/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.Puesto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Milton Pineda
 */
public class PuestoDAO {
    //Atributo para una nueva sesion 
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public Puesto agregarPuesto(String pstos, String descripcion, String horario, String cordenada_x, String cordenada_y) {
        Puesto psto = new Puesto();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            System.out.println(pstos+ " "+descripcion+ " "+ horario+ " "+ cordenada_x + " "+ cordenada_y );
           psto.setIdpuesto(pstos);
           psto.setDescripcion(descripcion);
           psto.setHorario(horario);
           psto.setCordenada_x(cordenada_x);
           psto.setCordenada_y(cordenada_y);
           session.save(psto);
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return psto;
    }
    
     public Puesto eliminarPuestos(String pstos) {
        Puesto psto = new Puesto();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
            String hql = "  from Puesto where idpuesto = :psto";
            Query query = session.createQuery(hql);
            query.setParameter("psto", pstos);
            psto = (Puesto)query.uniqueResult();
       
           
           
       session.delete(psto);
           session.getTransaction().commit();
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return psto;
    }
     
     public Puesto actualizarPuesto(String pstos, String descripcion, String horario) {
        Puesto psto = new Puesto();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            System.out.println(pstos+ " "+descripcion+ " "+ horario );
           psto.setIdpuesto(pstos);
           psto.setDescripcion(descripcion);
           psto.setHorario(horario);
           session.update(psto);
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return psto;
    }
     
     public List<Puesto> obtenerListaPuestos() {
        
            
           
             List<Puesto> result = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = " FROM Puesto";
            Query query = session.createQuery(hql);
            result = (List<Puesto>)query.list();
            tx.commit();
            
            
            
            
            
            
            
            
           
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return result;
    }
     public List<Puesto> obtenerListaPuestos2() {
        List<Puesto> psto = new ArrayList<Puesto>();
        Transaction trns = null;
        Session session = sessionFactory.openSession();
        try {
            trns = session.beginTransaction();
             String idpuesto;
             String cordenada_x;
             String cordenada_y;
             String descripcion;
             String horario;
             psto = session.createQuery("from Puesto").list();
             for(int i = 0; i < psto.size(); i++){
                    idpuesto = ((Puesto)psto.get(i)).getIdpuesto();
                    cordenada_x = ((Puesto)psto.get(i)).getCordenada_x();
                    cordenada_y = ((Puesto)psto.get(i)).getCordenada_y();
                    descripcion = ((Puesto)psto.get(i)).getDescripcion();
                    horario = ((Puesto)psto.get(i)).getHorario();
                    System.out.println("puesto: "+ idpuesto);
                    
 }} catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return psto;
    }
     

}
