/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopropietariocasa;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alberto
 */
@XmlRootElement(name = "almacen")
public class Almacen {
    ArrayList<Propietario> propietarios;

    public Almacen() {
        this.propietarios = new ArrayList<>();
    }

    
    @XmlElement(name = "propietario")
    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }
    
    public void agregarPropietario(Propietario p){
        this.propietarios.add(p);
    }
    
    
}
