package com.lorena.autenticacion_1.repository;

import com.lorena.autenticacion_1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuario(String usuario);
}
