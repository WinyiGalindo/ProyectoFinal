/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal.controlador;

import ProyectoFinal.modelo.Bebida;
import java.util.ArrayList;

/**
 *
 * @author Winyi Galindo
 */
public class CBebida {

    public void crearInventario(ArrayList<Bebida> ListaBebidas) {

        Bebida bebida1 = new Bebida("Aguila", 1, 100, 3500);
        Bebida bebida2 = new Bebida("Aguila Light", 2, 100, 4000);
        Bebida bebida3 = new Bebida("Becks", 3, 100, 3000);
        Bebida bebida4 = new Bebida("Aguila Limon", 4, 100, 4000);
        Bebida bebida5 = new Bebida("Budweiser", 5, 100, 4000);
        Bebida bebida6 = new Bebida("Club Dorada", 6, 100, 4000);
        Bebida bebida7 = new Bebida("Club Negra", 7, 100, 4000);
        Bebida bebida8 = new Bebida("ColayPola", 8, 100, 3500);
        Bebida bebida9 = new Bebida("Costeña", 9, 100, 4000);
        Bebida bebida10 = new Bebida("Malta Leona", 10, 100, 3000);
        Bebida bebida11 = new Bebida("Pilsen", 11, 100, 3500);
        Bebida bebida12 = new Bebida("Poker", 12, 100, 4000);
        Bebida bebida13 = new Bebida("Poker Roja", 13, 100, 4000);
        Bebida bebida14 = new Bebida("Redds", 14, 100, 3500);
        Bebida bebida15 = new Bebida("Pony Malta", 15, 100, 2500);

        ListaBebidas.add(bebida1);
        ListaBebidas.add(bebida2);
        ListaBebidas.add(bebida3);
        ListaBebidas.add(bebida4);
        ListaBebidas.add(bebida5);
        ListaBebidas.add(bebida6);
        ListaBebidas.add(bebida7);
        ListaBebidas.add(bebida8);
        ListaBebidas.add(bebida9);
        ListaBebidas.add(bebida10);
        ListaBebidas.add(bebida11);
        ListaBebidas.add(bebida12);
        ListaBebidas.add(bebida13);
        ListaBebidas.add(bebida14);
        ListaBebidas.add(bebida15);

    }

    public Bebida consultarProducto(int idProducto, ArrayList<Bebida> listaBebidas) {
        for (Bebida bebida : listaBebidas) {
            if (bebida.getId() == idProducto) {
                return bebida; // Producto encontrado
            }
        }
        return null; // Producto no encontrado
    }

    public boolean eliminarProductoPorID(ArrayList<Bebida> listaBebidas, int id) {
        for (Bebida bebida : listaBebidas) {
            if (bebida.getId() == id) {
                listaBebidas.remove(bebida);
                return true; // Producto eliminado
            }
        }
        return false; // Producto no encontrado
    }

}
