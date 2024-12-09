/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal.modelo;

import java.util.ArrayList;

/**
 *
 * @author sotod
 */
public class Inventario {
    ArrayList<Bebida> ListaBebidas = new ArrayList<>();

    public Inventario() {
    }

    public ArrayList<Bebida> getListaBebidas() {
        return ListaBebidas;
    }

    public void setListaBebidas(ArrayList<Bebida> ListaBebidas) {
        this.ListaBebidas = ListaBebidas;
    }

    @Override
    public String toString() {
        return "Inventario{" + "ListaBebidas=" + ListaBebidas + '}';
    }
    
    
    
}
