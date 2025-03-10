/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Tests;

import com.mycompany.examenrefactor.PedidoRefactorizado;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Overlord
 */
public class PedidoTest {

    public PedidoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void pedidoConDescuento() {

        PedidoRefactorizado pedido1 = new PedidoRefactorizado("Carlos");
        pedido1.agregarProducto("Smatphone", 200);
        double resultado = pedido1.calcularTotal();
        assertTrue(resultado == 180);
    }

    @Test
    public void pedidoSinDescuento() {
        PedidoRefactorizado pedido1 = new PedidoRefactorizado("Carlos");
        pedido1.agregarProducto("Smatphone", 50);
        double resultado = pedido1.calcularTotal();
        assertTrue(resultado == 50);
    }

    @Test
    public void validaciónNombresVacios() {
        PedidoRefactorizado pedido1 = new PedidoRefactorizado("Carlos");
        pedido1.agregarProducto("", 50);
    }

    @Test
    public void validaciónPreciosNegativos() {
        PedidoRefactorizado pedido1 = new PedidoRefactorizado("Carlos");
        pedido1.agregarProducto("Smatphone", -50);
    }
    
    @Test
    public void comprobaciónFinal() {
        PedidoRefactorizado pedido1 = new PedidoRefactorizado("Carlos");
        pedido1.agregarProducto("Smartphone", 500);
        pedido1.agregarProducto("Auriculares", 50);
        pedido1.agregarProducto("Cargador", 20);
        
        List<String> a = null;
        a.add("Smartphone");
        a.add("Auriculares");
        a.add("Cargador");
        
        List<String> p = pedido1.getCestaProductos();
        
        assertTrue(p.equals(a));
    }

}
