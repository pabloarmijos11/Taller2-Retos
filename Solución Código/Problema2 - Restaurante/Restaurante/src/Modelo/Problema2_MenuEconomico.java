/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.*;

/**
 *
 * @author User
 */
public class Problema2_MenuEconomico extends Problema2_Menu {

    private double porcentajeDescuento;

    public Problema2_MenuEconomico(String nomPlato, double valorInicialMenu, double descuento) {
        super(nomPlato, valorInicialMenu);
        this.porcentajeDescuento = descuento;
    }

    @Override
    public void calcularValorMenu() {
        double descuento = valorInicialMenu * (porcentajeDescuento / 100);
        this.valorMenu = valorInicialMenu - descuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
public String toString() {
    return "-------------------------------------------------------------------------------------------------------------------------------------------------\n" +
           "Menu Economico\n" +
           "Nombre del Plato = " + nomPlato + ", Valor Inicial del Menu = " + valorInicialMenu + ", Valor Menu= " + valorMenu + ", Descuento = " + porcentajeDescuento;
}
}
