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
public abstract class Problema2_Menu {

    protected String nomPlato;
    protected double valorInicialMenu;
    protected double valorMenu;

    public Problema2_Menu(String nomPlato, double valorInicialMenu) {
        this.nomPlato = nomPlato;
        this.valorInicialMenu = valorInicialMenu;
    }

    public abstract void calcularValorMenu();

    public String getNomPlato() {
        return nomPlato;
    }

    public void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }

    public void setValorInicialMenu(double valorInicialMenu) {
        this.valorInicialMenu = valorInicialMenu;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------------------------------------------------------------------------------\n"
                + "\nMenu" + "Nombre Plato =" + nomPlato + ", Valor Inicial del Menu =" + valorInicialMenu + ", Valor Menu =" + valorMenu;
    }

}
