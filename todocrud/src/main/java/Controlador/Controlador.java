/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Puesto;
import Mapeo.Usuario;
import Modelo.PuestoDAO;
import Modelo.UsuarioDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Milton Pineda
 */
@Controller 
public class Controlador {
    
    @Autowired
    UsuarioDAO usuario_db;
    
    @Autowired
    PuestoDAO puesto_db;
    
    @RequestMapping(value="/")
    public String registrar(){
        return "inicio";
    }
    

    
   
    @RequestMapping(value="clase1/clase1/lista", method = RequestMethod.GET)
    public ModelAndView puestoLista(ModelMap model,HttpServletRequest request) {
      List<Puesto> ps = puesto_db.obtenerListaPuestos();
for (Puesto i:puesto_db.obtenerListaPuestos()) {

        System.out.println (i); //Muestra cada uno de los nombres dentro de listaDeNombres

    }      
    

       

    
      model.addAttribute("ps",ps);
        return new ModelAndView("listaPuesto",model);
    
    }
    }

