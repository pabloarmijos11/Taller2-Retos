/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Problema2_CuentasPorPagar {

    private String nombreCliente;
    private ArrayList<Problema2_Menu> listaMenus;
    private double subtotal;
    private double iva;
    private double valorTotal;

    public Problema2_CuentasPorPagar(String nombreCliente, double porcentajeIva) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = new ArrayList<>();
        this.iva = porcentajeIva;
    }

    public void agregarMenu(Problema2_Menu menu) {
        menu.calcularValorMenu();
        this.listaMenus.add(menu);
    }

    public void calcularCuentaTotal() {
        this.subtotal = 0;
        for (int i = 0; i < this.listaMenus.size(); i++) {
            Problema2_Menu m = this.listaMenus.get(i);
            this.subtotal = this.subtotal + m.getValorMenu();
        }
        double calculoIva = this.subtotal * (this.iva / 100);
        this.valorTotal = this.subtotal + calculoIva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Problema2_Menu> getListaMenus() {
        return listaMenus;
    }

    public void setListaMenus(ArrayList<Problema2_Menu> listaMenus) {
        this.listaMenus = listaMenus;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        String detalles = "";
        System.out.println("======Restaurante Dona Vicky======");  
        for (int i = 0; i < this.listaMenus.size(); i++) {
            detalles = detalles + this.listaMenus.get(i).toString() + "\n";
        }

        return "Cuentas Por Pagar\n"
                + " Nombre Cliente = " + nombreCliente + ",\n"
                + " Lista de Menus\n" + detalles
                + "-------------------------------------------------------------------------------------------------------------------------------------------------\n"
                + String.format("   Subtotal     = %.2f\n", subtotal)
                + String.format("   IVA (%.1f%%)  = %.2f\n", iva, (subtotal * (iva / 100)))
                + String.format("   Valor Total  = %.2f", valorTotal);
    }

}
