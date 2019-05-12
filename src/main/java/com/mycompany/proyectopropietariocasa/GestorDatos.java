/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopropietariocasa;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class GestorDatos {

    int idPropietario;
    int idCasa;
    int propietarioActual;
    int casaActual;
    ArrayList<Propietario> propietarios;
    ArrayList<Casa> casas;

    public GestorDatos() {
        this.propietarios = new ArrayList<>();
        this.casas = new ArrayList<>();
        this.propietarioActual = 0;
        this.casaActual = 0;
        this.idCasa = 0;
        this.idPropietario = 0;
    }

    public int obtenerNumeroCasaActual() {
        return this.casaActual;
    }

    public int obtenerNumeroPropietarioActual() {
        return this.propietarioActual;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void agregarPropietario(Propietario p) {
        getPropietarios().add(p);
    }

    public void agregarCasa(Casa c) {
        getCasas().add(c);
    }

    public Propietario getPropietarioActual() {
        return getPropietarios().get(this.propietarioActual);
    }

    public Casa getCasaActual() {
        return getCasas().get(casaActual);
    }

    public void siguienteCasa() {
        if (this.casas.size() - 1 > this.casaActual) {
            this.casaActual++;
        }
    }

    public void anteriorCasa() {
        if (0 < this.casaActual) {
            this.casaActual--;
        }
    }

    public void siguientePropietario() {
        if (this.propietarios.size() - 1 > this.propietarioActual) {
            this.propietarioActual++;
        }
    }

    public void anteriorPropietario() {
        if (0 < this.propietarioActual) {
            this.propietarioActual--;
        }
    }

    public void agregarCasaAPropietario(int id) {
        this.casas.stream().filter(p-> p.getId() != id).forEach(p->this.getPropietarioActual().agregarCasa(p));
        
    }
    
    public void agregarPropietarioACasa(int id) {
        
    }

    public static void main(String[] args) {
        
    }

}
