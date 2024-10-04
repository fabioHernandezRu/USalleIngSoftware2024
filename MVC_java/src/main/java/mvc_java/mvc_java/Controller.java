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
public class Controller {
    
    Usuario modelo;
    //VistaCLI vista;
    vistaGUI vista;
    public Controller(Usuario modelo, vistaGUI vista) {
        this.modelo = modelo;
        this.vista = vista;
         initController();
    }

    private void initController() {
        // Puede escuchar eventos como clics en botones para actualizar el usuario
        vista.actualizar.addActionListener(e -> actualizarUsuario());
    }
    public void actualizarVista(){
        vista.mostrarDetallesUsuario(modelo);
    }
    
    public void actualizarUsuario(){
        String nombre = vista.solicitarNuevoNombre();
        String email = vista.solicitarNuevoEmail();
        modelo.setEmail(email);
        modelo.setNombre(nombre);
    }
    
}
