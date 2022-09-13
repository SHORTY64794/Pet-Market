package com.proyectociclo3.tiendavirtual.controller;

import com.proyectociclo3.tiendavirtual.domain.Usuario;
import com.proyectociclo3.tiendavirtual.domain.UsuarioDTO;
import com.proyectociclo3.tiendavirtual.respository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    /* El Request...sirve xa q nos renderize nuestra pág raiz ("/") */
    @RequestMapping("/")
    /*metodo q nos renderiza la pag ppal */
    public String listartiendavirtual(){
        /*retorna nuestra pag ppal llamada 'listado' */
        return "login";

    }

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE )
    /*metodo q nos renderiza la pag ppal */
    public String loguearse(UsuarioDTO usuario){

        Usuario usuariodb = usuarioRepositorio.findByNombre(usuario.getNombre());

        if (usuariodb == null){
            return "login";
        }
        if(usuariodb.getPassword().equals(usuario.getPassword())){
            return "listado";
        }
        return "errorContrasena";
    }

}
