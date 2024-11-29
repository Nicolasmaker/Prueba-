/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import models.Cliente;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Cetecom
 */
public class ClienteController {
    Conexion cx;
    public ClienteController() {
        Conexion cx = new Conexion();
        cx.conectar();
    }
     
    
    
    public List<Cliente> listarCliente(){
        List<Cliente> cliente = new ArrayList<>();
        String query = "SELECT * FROM CLIENTE";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                cliente.add(new Cliente(
                rs.getString("rut"),
                rs.getString("nombre"),
                rs.getString("numero_de_contacto"),
                rs.getString("direccion"),
                rs.getString("tipo_de_cliente")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener clientes: " + e.getMessage());
        }
        return cliente;
    }
    
    public void agregarCliente(String rut, String nombre, String numeroContacto, String direccion, String tipoCliente){
        String query = "INSERT INT ´cliente´ (rut,nombre,numero_de_contacto,direccion,tipo_de_cliente) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(query);
            st.setString(1, rut);
            st.setString(2, nombre);
            st.setString(3, numeroContacto);
            st.setString(4, direccion);
            st.setString(5, tipoCliente);
            st.executeUpdate();
            System.out.println("Libro agregado");
        } catch (Exception e) {
            
        }
    }}
