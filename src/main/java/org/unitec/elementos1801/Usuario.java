/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
//long     
@Id
private Long cuenta;
private String nombre;
private String email;

    public Long getCuenta() {
        return cuenta;
    }

    public void setCuenta(Long cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario() {
    }

    public Usuario(Long cuenta, String nombre, String email) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.email = email;
    }

    public Usuario(Long cuenta) {
        this.cuenta = cuenta;
    }

    /*
    este no por que el id no se va a autoincrementar
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
*/


    
    
}