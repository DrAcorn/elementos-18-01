/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Direccion {
    @Id
    @GeneratedValue  //por que se autogenera      
    private Long id_dir;
    //aqui FK en java no existe FK 
    //aqui diriamos que un usuario corresponde a una direccion
    @OneToOne
    @JoinColumn(name="cuenta")        
    private Usuario u;
    
    private String calle;
    private Integer cp;
    private String municipio;

    //recuerda get and set con la opcion encapsulation y seleccionar todos
    public Long getId_dir() {
        return id_dir;
    }

    public void setId_dir(Long id_dir) {
        this.id_dir = id_dir;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Direccion() {
    }
//si se auto incremente 
    public Direccion(Long id_dir) {
        this.id_dir = id_dir;
    }

    public Direccion(Usuario u, String calle, Integer cp, String municipio) {
        this.u = u;
        this.calle = calle;
        this.cp = cp;
        this.municipio = municipio;
    }

    public Direccion(Long id_dir, Usuario u, String calle, Integer cp, String municipio) {
        this.id_dir = id_dir;
        this.u = u;
        this.calle = calle;
        this.cp = cp;
        this.municipio = municipio;
    }
    
    
    
    
    
}