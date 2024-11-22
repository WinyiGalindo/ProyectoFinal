/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal.controlador;

import ProyectoFinal.modelo.Cliente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Winyi Galindo
 */
public class CCliente {
    public void registrarCliente(ArrayList<Cliente> clientes) {

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite su Nombre: ");
        String nombre = input.nextLine(); // Lee toda la línea para incluir espacios
        System.out.print("Por favor, digite su Apellido: ");
        String apellido = input.nextLine(); // Lo mismo aquí
        System.out.print("Por favor, digite su Documento: ");
        String documento = input.nextLine(); // Documento como cadena
        System.out.print("Por favor, digite su Empresa: ");
        String empresa = input.nextLine(); // Empresa puede contener espacios
        System.out.print("Por favor, digite su Direccion: ");
        String direccion = input.nextLine(); // Dirección completa
        System.out.print("Por favor, digite su Fecha (Año-Mes-Dia): ");
        String fecha = input.nextLine();
        LocalDate fecha_nueva = LocalDate.parse(fecha);

        Cliente c = new Cliente(nombre, apellido, documento, empresa, direccion, fecha_nueva);
        
        clientes.add(c);
    }

    public void consultarCliente(ArrayList<Cliente> clientes) {

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, ingrese el documento del cliente que desea consultar: ");
        String documento = input.nextLine();

        boolean encontrado = false;

        for (Cliente cliente : clientes) {
            if (cliente.getDocumento().equals(documento)) {
                System.out.println("Cliente encontrado");
                System.out.println(cliente);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Lo sentimos, el cliente no se encuentra en el sistema");
        }
    }

    public void modificarCliente(ArrayList<Cliente> clientes) {

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, ingrese el documento del empleado que desea modificar: ");
        String documento = input.next();
        boolean encontrado = false;

        for (Cliente cliente : clientes) {
            while (true) {

                if (cliente.getDocumento().equals(documento)) {
                    System.out.println("Atributos del Cliente");
                    System.out.println(cliente);
                    System.out.println("1.Nombre");
                    System.out.println("2.Apellido");
                    System.out.println("3.Documento");
                    System.out.println("4.Empresa");
                    System.out.println("5.Direccion");
                    System.out.println("6.Fecha");
                    System.out.println("7.Salir de modificar");
                    System.out.print("Seleccione la opcion que desea modificar: ");
                    int opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Por favor, Digite el nuevo Nombre: ");
                            String nombre = input.next();
                            cliente.setNombre(nombre);
                            break;
                        case 2:
                            System.out.print("Por favor, Digite el nuevo apellido: ");
                            String apellido = input.next();
                            cliente.setApellido(apellido);
                            break;
                        case 3:
                            System.out.print("Por favor, Digite el nuevo documento: ");
                            String docu = input.next();
                            cliente.setDocumento(docu);
                            break;
                        case 4:
                            System.out.print("Por favor, Digite la nueva Empresa: ");
                            String empresa = input.next();
                            cliente.setEmpresa(empresa);
                            break;
                        case 5:
                            System.out.print("Por favor, Digite la nueva direccion: ");
                            String direccion = input.next();
                            cliente.setDireccion(direccion);
                            break;
                        case 6:
                            System.out.print("Por favor, Digite la nueva fecha: ");
                            String fec = input.next();
                            cliente.setFecha(LocalDate.parse(fec));
                            break;
                        case 7:
                            System.out.println("Saliendo de modificaciones del cliente...");
                            break;

                    }
                    if (opcion == 7) {
                        break;
                    }
                }

            }
            encontrado = true;

            break;
        }

        if (!encontrado) {
            System.out.println("Lo sentimos, el empleado no se encuentra en el sistema");
        }

    }

    public void eliminarCliente(ArrayList<Cliente> clientes) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite el documento del cliente que desea eliminar");
        String doc = input.next();

        boolean eliminado = clientes.removeIf(cliente -> cliente.getDocumento().equals(doc));

        if (eliminado) {
            System.out.println("Cliente eliminado.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
    
}
