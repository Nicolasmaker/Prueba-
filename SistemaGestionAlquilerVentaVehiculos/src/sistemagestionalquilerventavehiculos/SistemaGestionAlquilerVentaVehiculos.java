/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionalquilerventavehiculos;

import Bd.Conexion;
import controller.ClienteController;
import views.MenuGestion;

/**
 *
 * @author Cetecom
 */
public class SistemaGestionAlquilerVentaVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        ClienteController cc = new ClienteController();
        cc.listarCliente();
        MenuGestion mn = new MenuGestion();
        mn.setVisible(true);
    }
    
}
