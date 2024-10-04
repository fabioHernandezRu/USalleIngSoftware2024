/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java.mvc_java;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        //Aplicacion app = new Aplicacion("Andres", "Andres@unisalle.edu.co");
        //app.mostrarUsuario();
        //app.actualizarUsuario("Andrea", "andrea@unisalle.edu.co");
        //app.mostrarUsuario();
        Scanner scanner = new Scanner(System.in);
        //VistaCLI vista = new VistaCLI(scanner);
        vistaGUI vista = new vistaGUI();
        Usuario model = new Usuario("Fabio", "fabio@");
        Controller controlador = new Controller(model, vista);
        controlador.actualizarVista();
        controlador.actualizarUsuario();
        controlador.actualizarVista();
        
    }
}
