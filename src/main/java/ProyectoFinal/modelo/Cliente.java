 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal.modelo;

import java.time.LocalDate;

/**
 *
 * @author Winyi Galindo
 */
public class Cliente {
    String nombre;
    String apellido;
    String documento;
    String empresa;
    String direccion;
    LocalDate fecha;

    public Cliente(String nombre, String apellido, String documento, String empresa, String direccion, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.empresa = empresa;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", empresa=" + empresa + ", direccion=" + direccion + ", fecha=" + fecha + '}';
    }

    

      
}
