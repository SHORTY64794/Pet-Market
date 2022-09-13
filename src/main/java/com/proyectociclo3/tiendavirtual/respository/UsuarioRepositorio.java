package com.proyectociclo3.tiendavirtual.respository;

import com.proyectociclo3.tiendavirtual.domain.Usuario;
import com.proyectociclo3.tiendavirtual.domain.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

    Usuario findByNombre(String usuario);
}
