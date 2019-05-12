/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopropietariocasa;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author Alberto
 */
public class Propietario {

    int id;
    String nombre;
    String apellidos;
    ArrayList<Casa> casas;

    public Propietario() {
         this.casas = new ArrayList<>();
    }

    public Propietario(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.casas = new ArrayList<>();
    }
    
    public void agregarCasa(Casa c){
        getCasas().add(c);
    }

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    @XmlElement(name = "apellidos")
    public String getApellidos() {
        return apellidos;
    }

    @XmlElementWrapper(name = "casas")
    @XmlElement(name = "casa")
    public ArrayList<Casa> getCasas() {
        return casas;
    }

    @Override
    public String toString() {
        return "Propietario{" + "dni=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", casas=" + casas + '}';
    }

}
