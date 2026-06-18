/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.Problema2_CuentasPorPagar;
import Modelo.Problema2_Menu;
import Modelo.Problema2_MenuALaCarta;
import Modelo.Problema2_MenuDelDia;
import Modelo.Problema2_MenuEconomico;
import Modelo.Problema2_MenuNiños;
import java.awt.Menu;

/**
 *
 * @author User
 */
public class Problema2_RestauranteEjecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Problema2_CuentasPorPagar cuenta1 = new Problema2_CuentasPorPagar("Dinho", 15.0);

        Problema2_Menu platoCarta = new Problema2_MenuALaCarta("Filete Mignon", 12.50, 3.00, 2.00, 10.0);
        Problema2_Menu platoDelDia = new Problema2_MenuDelDia("Seco de Chivo", 5.00, 1.50, 0.75);
        Problema2_Menu platoNiños = new Problema2_MenuNiños("Hamburguesa Mini", 4.50, 1.20, 1.00);
        Problema2_Menu platoEconomico = new Problema2_MenuEconomico("Almuerzo Ejecutivo", 3.50, 15.0);

        cuenta1.agregarMenu(platoCarta);
        cuenta1.agregarMenu(platoDelDia);
        cuenta1.agregarMenu(platoNiños);
        cuenta1.agregarMenu(platoEconomico);

        cuenta1.calcularCuentaTotal();
        System.out.println(cuenta1);

        System.out.println("\n\n");

        Problema2_CuentasPorPagar cuenta2 = new Problema2_CuentasPorPagar("Mateo Jaramillo", 12.0);

        Problema2_Menu platoMateo1 = new Problema2_MenuALaCarta("Corvina Apanada", 10.00, 2.50, 1.50, 10.0);
        Problema2_Menu platoMateo2 = new Problema2_MenuEconomico("Merienda Familiar", 4.00, 10.0);

        cuenta2.agregarMenu(platoMateo1);
        cuenta2.agregarMenu(platoMateo2);

        cuenta2.calcularCuentaTotal();
        System.out.println(cuenta2);
    }

}
