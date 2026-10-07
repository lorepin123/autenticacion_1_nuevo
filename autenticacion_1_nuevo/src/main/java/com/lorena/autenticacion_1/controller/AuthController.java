package com.lorena.autenticacion_1.controller;

import com.lorena.autenticacion_1.dto.UsuarioDTO;
import com.lorena.autenticacion_1.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/registro")
    public ResponseEntity<?> registrar(@Valid @RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(authService.registrar(usuarioDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(authService.login(usuarioDTO));
    }
}
