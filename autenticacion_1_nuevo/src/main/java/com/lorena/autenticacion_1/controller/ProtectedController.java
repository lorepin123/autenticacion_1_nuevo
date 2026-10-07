package com.lorena.autenticacion_1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedController {

    // Solo ADMIN
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/api/admin")
    public String adminOnly() {
        return "Acceso permitido: solo ADMIN puede ver este contenido.";
    }

    // ADMIN o USER
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/api/user")
    public String userOnly() {
        return "Acceso permitido: USER y ADMIN pueden ver este contenido.";
    }

    // Cualquier usuario autenticado
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/api/general")
    public String generalProtected() {
        return "Acceso permitido: cualquier usuario autenticado.";
    }
}
