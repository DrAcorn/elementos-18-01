/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author elect
 */
public interface RepositorioMensajito extends CrudRepository<Mensajito, Integer>{

      List<Mensajito>findByTitulo(String titulo);
    
}
