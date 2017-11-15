/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elect
 */
@RestController
@RequestMapping("/Mensajito")
@CrossOrigin
public class ControladorMensajes {
    
    //Aqui a continuacion van las 5 operaciones basicas con la entidad mensaje
    @Autowired RepositorioMensajito repoMensa;
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET, headers = {"Accept=application/json"})
    public Mensajito obtenerMensajito(@PathVariable Integer id)throws Exception{
        
        return repoMensa.findOne(id);
    
    }
   
}
