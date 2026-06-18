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
public class Problema2_MenuDelDia extends Problema2_Menu {

    private double valorPostre;
    private double valorBebida;

    public Problema2_MenuDelDia(String nomPlato, double valorInicialMenu, double postre, double bebida) {
        super(nomPlato, valorInicialMenu);
        this.valorPostre = postre;
        this.valorBebida = bebida;
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    @Override
public String toString() {
    return "-------------------------------------------------------------------------------------------------------------------------------------------------\n" +
           "Menu Del Dia\n" +
           "Nombre del Plato = " + nomPlato + ", Valor Inicial del Menu = " + valorInicialMenu + ", Valor Menu = " + valorMenu + ", Valor Postre = " + valorPostre + ", Valor Bebida = " + valorBebida;
}

}
