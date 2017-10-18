/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author elect
 */
@SpringUI
@Theme("valo")
public class MiUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout= new VerticalLayout();
         
         //Generar una etiqueta
         Label etiqueta= new Label("Aplicacion con mensajitos bonitos");
         etiqueta.addStyleNames(ValoTheme.LABEL_H1);
         layout.addComponent(etiqueta);
         setContent(layout);
    }
    
    
    
}
