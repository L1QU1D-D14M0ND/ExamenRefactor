/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenrefactor;

/**
 *
 * @author Overlord
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        PedidoRefactorizado pedido1 = new PedidoRefactorizado("Carlos");
        pedido1.agregarProducto("Smatphone", 500);
        pedido1.agregarProducto("Auriculares", 50);
        pedido1.agregarProducto("Cargador", 20);

        pedido1.mostrarPedido();

        pedido1.agregarProducto("", 10);
        pedido1.agregarProducto("Alfombrilla", -10);

        pedido1.mostrarPedido();

    }
}
