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
public class Problema2_MenuALaCarta extends Problema2_Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public Problema2_MenuALaCarta(String nomPlato, double valorInicialMenu, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nomPlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    @Override
    public void calcularValorMenu() {
        double servicio = valorInicialMenu * (porcentajeServicio / 100);
        this.valorMenu = valorInicialMenu + valorGuarnicion + valorBebida + servicio;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeServicio() {
        return porcentajeServicio;
    }

    public void setPorcentajeServicio(double porcentajeServicio) {
        this.porcentajeServicio = porcentajeServicio;
    }

    @Override
public String toString() {
    return "-------------------------------------------------------------------------------------------------------------------------------------------------\n" +
           "Menu A La Carta\n" +
           "Nombre del Plato = " + nomPlato + ", Valor Inicial del Menu = " + valorInicialMenu + ", Valor Menu = " + valorMenu + ", Valor Guarnicion = " + valorGuarnicion + ", Valor Bebida = " + valorBebida + ", Porcentaje de Servicio = " + porcentajeServicio;
}

}
