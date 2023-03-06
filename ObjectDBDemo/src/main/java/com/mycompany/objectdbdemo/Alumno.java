package com.mycompany.objectdbdemo;
import javax.persistence.*;
/**
 *
 * @author josel
 */


@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
   
    private String nombre;
    private String telefono;
    private String email;
    private Double notaAD;
    private Double notaDI;

    public Alumno(int id, String nombre, String telefono, String email, Double notaAD, Double notaDI) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.notaAD = notaAD;
        this.notaDI = notaDI;
    }

    public Alumno() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getNotaAD() {
        return notaAD;
    }

    public void setNotaAD(Double notaAD) {
        this.notaAD = notaAD;
    }

    public Double getNotaDI() {
        return notaDI;
    }

    public void setNotaDI(Double notaDI) {
        this.notaDI = notaDI;
    }

    
    
    
//    
//    @Override
//public String toString() {
//    return "Alumno{" +
//            "id=" + id +
//            ", nombre='" + nombre + '\'' +
//            '}';
//}

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", notaAD=" + notaAD + ", notaDI=" + notaDI + '}';
    }


}
