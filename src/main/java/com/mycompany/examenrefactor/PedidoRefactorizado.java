package com.mycompany.examenrefactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Pedido del cliente, refactorizado
 *
 * @author Overlord
 */
public class PedidoRefactorizado {

    private final String nombreCliente;
    private List<String> cestaProductos;
    private double totalCoste;

    /**
     * Constructor de la clase Pedido
     *
     * @param cliente nombre del nuevo cliente
     */
    public PedidoRefactorizado(String cliente) {
        this.nombreCliente = cliente;
        this.cestaProductos = new ArrayList<>();
        this.totalCoste = 0;
    }

    /**
     * Añade un producto con su nombre y precio a la cesta.
     *
     * @param producto un string que es el nombre del producto a añadir a la
     * cesta del cliente.
     * @param precio el precio del producto a añadir a la cesta.
     */
    public void agregarProducto(String producto, double precio) {
        // Comprobar si estas ramificaciones funcionan
        if (producto.equals("")) {
            System.err.println("El producto no tiene nombre");
        } else {
            if (precio > 0) {
                cestaProductos.add(producto);
                totalCoste += precio;
            } else {
                System.err.println("El producto no tiene un precio por encima de 0");
            }
        }
    }

    /**
     * Calcula los posibles descuentos.
     *
     * @return devuelve el coste total de los productos que tiene el cliente.
     */
    public double calcularTotal() {
        // Comprobar si estas ramificaciones funcionan
        if (totalCoste > 100) {
            return totalCoste * 0.90; // 10% de descuento si el pedido supera los 100
        } else {
            return totalCoste;
        }
    }

    /**
     * Escribe en la consola lo que contienen las variables del cliente.
     */
    public void mostrarPedido() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Productos: " + cestaProductos);
        System.out.println("Total: " + calcularTotal());
    }

    public List<String> getCestaProductos() {
        return cestaProductos;
    }

}
