package com.example.BackendActividad1084330566.Controller;


import com.example.BackendActividad1084330566.Entity.Usuarios;
import com.example.BackendActividad1084330566.IService.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/api/Usuario")
public class UsuariosController {

    @Autowired
    private IUsuariosService usuarioService;

    @GetMapping("")
    public List<Usuarios> All() {
        return usuarioService.All();
    }

    @GetMapping("/{id}")
    public Optional<Usuarios> findById(@PathVariable Long id) {
        return usuarioService.FindById(id);
    }

    @PutMapping("/{id}")
    public void Update(@RequestBody Usuarios usuario, @PathVariable Long id) {
        usuarioService.Update(usuario, id);
    }

    @PostMapping("/guardar")
    public Usuarios Save(@RequestBody Usuarios usuario) {
        return usuarioService.Save(usuario);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Long id) {
        usuarioService.Delete(id);
    }

}
