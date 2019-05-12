/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopropietariocasa;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alberto
 */
public class Casa {

    int id;
    String direccion;
    ArrayList<Propietario> propietarios;

    public Casa() {
    }

    public Casa(int identificador, String direccion) {
        this.id= identificador;
        this.direccion = direccion;
        this.propietarios = new ArrayList<>();
    }

    @XmlElement(name = "identificador")
    public int getId() {
        return id;
    }

    @XmlElement(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    @XmlTransient
    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }
    
    public void agregarPropietario(Propietario p){
        getPropietarios().add(p);
    }

    @Override
    public String toString() {
        return "Casa{" + "identificador=" + id + ", direccion=" + direccion + ", propietarios=" + propietarios + '}';
    }

}
