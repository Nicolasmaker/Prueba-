/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Transaccion {
    private int id_transaccion;
    private String fecha;
    private String tipoTransaccion;
    private int montoTotal;
    private int idVehiculo;
    private String rutCliente;

    public Transaccion() {
    }

    public Transaccion(int id_transaccion, String fecha, String tipoTransaccion, int montoTotal, int idVehiculo, String rutCliente) {
        this.id_transaccion = id_transaccion;
        this.fecha = fecha;
        this.tipoTransaccion = tipoTransaccion;
        this.montoTotal = montoTotal;
        this.idVehiculo = idVehiculo;
        this.rutCliente = rutCliente;
    }

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id_transaccion=" + id_transaccion + ", fecha=" + fecha + ", tipoTransaccion=" + tipoTransaccion + ", montoTotal=" + montoTotal + ", idVehiculo=" + idVehiculo + ", rutCliente=" + rutCliente + '}';
    }
    
    
   
}
