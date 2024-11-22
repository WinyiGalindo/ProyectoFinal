/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal.vista;

import java.util.Scanner;
import java.util.ArrayList;
import ProyectoFinal.controlador.CCliente;
import ProyectoFinal.modelo.Cliente;

/**
 *
 * @author Winyi Galindo
 */
public class Menu {

    public static void mostrar_menu() {

        Scanner input = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        CCliente controCliente = new CCliente();

        while (true) {
            System.out.println("OPCIONES");
            System.out.println("1. Gestionar Cliente");
            System.out.println("2. Salir");
            System.out.print("Por favor, elija una opcion: ");
            int opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    while (true) {

                        System.out.println("Bienvenido al menu de Cliente");
                        System.out.println("OPCIONES");
                        System.out.println("1. Registrar Cliente");
                        System.out.println("2. Consultar Cliente");
                        System.out.println("3. Modificar Cliente");
                        System.out.println("4. Eliminar Cliente");
                        System.out.println("5. Salir");
                        System.out.print("Por favor, elija una opcion: ");
                        int opcion2 = input.nextInt();

                        switch (opcion2) {
                            case 1:
                                controCliente.registrarCliente(clientes);

                                break;
                            case 2:
                                controCliente.consultarCliente(clientes);

                                break;
                            case 3:
                                controCliente.modificarCliente(clientes);

                                break;
                            case 4:
                                controCliente.eliminarCliente(clientes);

                                break;
                            case 5:
                                System.out.println("Saliendo del menu de Cliente...");
                                break;
                        }
                        if (opcion2 == 5) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Gracias por usar nuestro programa");
                    return;
            }

        }
    }
}
