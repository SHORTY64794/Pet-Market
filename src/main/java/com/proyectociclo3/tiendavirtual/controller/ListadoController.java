package com.proyectociclo3.tiendavirtual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    /*El Request...sirve xa q nos renderize nuestra pág raiz ("/") */
    @RequestMapping("/")
    /*metodo q nos renderiza la pag ppal */
    public String listartiendavirtual(){
        /*retorna nuestra pag ppal llamada 'listado' */
        return "listado";

    }
}
