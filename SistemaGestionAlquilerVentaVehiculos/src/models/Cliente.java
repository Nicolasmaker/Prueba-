/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String numeroContacto;
    private String direccion;
    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String numeroContacto, String direccion, String tipoCliente) {
        this.rut = rut;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", numeroContacto=" + numeroContacto + ", direccion=" + direccion + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
}
