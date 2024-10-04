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
public class VistaCLI {
    
    Scanner scanner;

    public VistaCLI(Scanner scanner) {
        this.scanner = scanner;
    }
    
    
    public void mostrarDetallesUsuario(Usuario usuario){
        System.out.println("El usuario tiene nombre:" + usuario.getNombre() + " con email: "+ usuario.getEmail());
    }
    
    public String solicitarNuevoNombre()   {
        System.out.println("Ingrese el nuevo nombre de Usuario: ");
        return scanner.next();
    }
    
    public String solicitarNuevoEmail()   {
        System.out.println("Ingrese el nuevo Email de Usuario: ");
        return scanner.next();
    }
    
}
