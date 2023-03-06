package com.mycompany.objectdbdemo;

import java.util.List;

/**
 *
 * @author josel
 */
public class ObjectDBDemo {

    public static void main(String[] args) {
DAO dao = new DAO();

dao.eliminarTodosLosAlumnos();



Alumno a1 = new Alumno();
a1.setNombre("Jose Luis");
a1.setTelefono("608502333");
a1.setNotaAD(8.0);
a1.setNotaDI(8.0);
a1.setEmail("jose@gmail.com");

Alumno a2 = new Alumno();
a2.setNombre("Francisco");
a2.setTelefono("609512333");
a2.setNotaAD(7.0);
a2.setNotaDI(7.0);
a2.setEmail("francisco@gmail.com");

Alumno a3 = new Alumno();
a3.setNombre("Antonio");
a3.setTelefono("601512353");
a3.setNotaAD(9.0);
a3.setNotaDI(9.0);
a3.setEmail("antonio@gmail.com");

Alumno a4 = new Alumno();
a4.setNombre("Loren");
a4.setTelefono("601812373");
a4.setNotaAD(4.5);
a4.setNotaDI(4.5);
a4.setEmail("loren@gmail.com");

Alumno a5 = new Alumno();
a5.setNombre("Adolfo");
a5.setTelefono("604112032");
a5.setNotaAD(3.2);
a5.setNotaDI(3.2);
a5.setEmail("adolfo@gmail.com");



dao.insertarAlumno(a1);
dao.insertarAlumno(a2);
dao.insertarAlumno(a3);
dao.insertarAlumno(a4);
dao.insertarAlumno(a5);

System.out.println(dao.listarTodo().toString());
//System.out.println(dao.listarSuspensos().toString());
        



        
       
        dao.cerrar();
    }
}
    

