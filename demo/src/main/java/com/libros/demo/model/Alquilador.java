

package com.libros.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "alquiladores")

class Alquilador {
    
    @Id 
    int id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "nombre", length = 100, nullable = false)
    String nombre;

    @Column(name = "apellido", length = 100, nullable = false)
    String apellido;

    @Column(name = "correo", length = 100, nullable = false)
    String correo;

    @Column(name = "telefono", nullable = false)    
     int telefono;
    @Column(name = "documento", nullable = false)
    int documento;

    


    public Alquilador() {
    }

    public Alquilador(String nombre, String apellido, String correo, int telefono, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.documento = documento;
    }

    public Alquilador(int id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
public static void main(String[] args) {
    Alquilador alquilador = new Alquilador("Jose", "Vivares", "Jose.vivares@example.com", 123456789, 23446756);
    System.out.println("Nombre: " + alquilador.getNombre());
    System.out.println("Apellido: " + alquilador.getApellido());
    System.out.println("Correo: " + alquilador.getCorreo());
    System.out.println("Teléfono: " + alquilador.getTelefono());
    System.out.println("Documento: " + alquilador.getDocumento());
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
