package com.libros.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "prestadores")



public class Prestador {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
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

    


    public Prestador() {
    }

    public Prestador(String nombre, String apellido, String correo, int telefono, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.documento = documento;
    }

    public Prestador(int id) {
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
    Prestador prestador = new Prestador("Jose", "Vivares", "maria.duque@example.com", 987654321, 987654321);
    System.out.println("Nombre: " + prestador.getNombre());
        System.out.println("Apellido: " + prestador.getApellido());
        System.out.println("Correo: " + prestador.getCorreo());
        System.out.println("Teléfono: " + prestador.getTelefono());
        System.out.println("Documento: " + prestador.getDocumento());
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}