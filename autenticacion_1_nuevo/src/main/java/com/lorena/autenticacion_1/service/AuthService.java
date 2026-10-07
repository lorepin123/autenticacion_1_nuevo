package com.lorena.autenticacion_1.service;

import com.lorena.autenticacion_1.dto.UsuarioDTO;
import com.lorena.autenticacion_1.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtUtil jwtUtil;

    public AuthService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public String registrar(UsuarioDTO usuarioDTO) {
        // Aquí guardarías el usuario en BD
        return "Usuario registrado correctamente";
    }

    public String login(UsuarioDTO usuarioDTO) {
        // Aquí validarías usuario y contraseña
        return jwtUtil.generarToken(usuarioDTO.getUsuario());
    }
}
