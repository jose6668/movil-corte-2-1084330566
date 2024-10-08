package com.example.BackendActividad1084330566.Controller;


import com.example.BackendActividad1084330566.Entity.Creacion_actividades;
import com.example.BackendActividad1084330566.Entity.Usuarios;
import com.example.BackendActividad1084330566.IService.ICreacion_actividadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/api/actividades")
public class Creacion_actividadesController {

    @Autowired
    private ICreacion_actividadesService Service;

    @GetMapping("")
    public List<Creacion_actividades> All() {
        return Service.All();
    }

    @GetMapping("/{id}")
    public Optional<Creacion_actividades> findById(@PathVariable Long codigo_actividad) {
        return Service.FindById(codigo_actividad);
    }

    @PutMapping("/{id}")
    public void Update(@RequestBody Creacion_actividades actividades, @PathVariable Long codigo_actividad) {
        Service.Update(actividades, codigo_actividad);
    }

    @PostMapping("/guardar")
    public Creacion_actividades Save(@RequestBody Creacion_actividades actividades) {
        return Service.Save(actividades);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Long codigo_actividad) {
        Service.Delete(codigo_actividad);
    }
}
