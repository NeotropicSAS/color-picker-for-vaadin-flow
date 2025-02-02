/*
 *  Copyright 2010-2024 Neotropic SAS <contact@neotropic.co>.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://apache.org/licenses/LICENSE-2.0.txt
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


package com.neotropic.flow.component.colorPicker;

import com.vaadin.flow.component.html.Input;

/**
 * Input component for selecting a color.
 * @author Julian David Camacho Erazo  {@literal <julian.camacho@kuwaiba.org>} 
 */
public class ColorPicker extends Input{
    
    public ColorPicker(){
        setType("color");
        getElement().getStyle().set("width", "30px");
        getElement().getStyle().set("height", "20px");
        getElement().getStyle().set("margin-right", "95%"); 
        getElement().getStyle().set("border", "none"); 
        getElement().getStyle().set("outline", "none"); 
    }
    
    public ColorPicker(double width, double height){
        setType("color");
        getElement().getStyle().set("width", width + "px");
        getElement().getStyle().set("height",height + "px");
        getElement().getStyle().set("border", "none"); 
        getElement().getStyle().set("outline", "none"); 
    }
}
