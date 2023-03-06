package com.mycompany.objectdbdemo;

/**
 *
 * @author josel
 */
import java.util.*;
import javax.persistence.*;

public class DAO {

    private EntityManagerFactory emf;

    public DAO() {
        emf = Persistence.createEntityManagerFactory("$objectdb/db/alumnos.odb");
    }

    public void insertarAlumno(Alumno alumno) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        em.close();
    }

    public List<Alumno> listarTodo() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT a FROM Alumno a");
        List<Alumno> alumnos = q.getResultList();
        em.close();
        return alumnos;
    }
    
        public List<Alumno> listarSuspensos() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT a FROM Alumno a WHERE notaAD < 5.0 and notaDI < 5.0");
        List<Alumno> alumnos = q.getResultList();
        em.close();
        return alumnos;
    }
        
    
   

    public void eliminarTodosLosAlumnos() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("DELETE FROM Alumno");
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

    public void cerrar() {
        emf.close();
    }
}
