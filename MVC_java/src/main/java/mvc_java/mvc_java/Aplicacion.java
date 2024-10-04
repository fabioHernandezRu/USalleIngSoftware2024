/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java.mvc_java;

/**
 *
 * @author User
 */
public class Aplicacion {
    private String nombre;
    private String email;
    

    public Aplicacion(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarUsuario(){
        System.out.println(this);
    }
    
    public void actualizarUsuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Aplicacion{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
