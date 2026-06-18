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
public class Problema2_MenuNiños extends Problema2_Menu {

    private double valorHelado;
    private double valorPastel;

    public Problema2_MenuNiños(String nomPlato, double valorInicialMenu, double helado, double pastel) {
        super(nomPlato, valorInicialMenu);
        this.valorHelado = helado;
        this.valorPastel = pastel;
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel;
    }

    @Override
public String toString() {
    return "-------------------------------------------------------------------------------------------------------------------------------------------------\n" +
           "Menu Niños\n" +
           "Nombre Plato = " + nomPlato + ", Valor Inicial del Menu = " + valorInicialMenu + ", Valor Menu = " + valorMenu + ", Valor Helado = " + valorHelado + ", Valor Pastel = " + valorPastel;
}

}
