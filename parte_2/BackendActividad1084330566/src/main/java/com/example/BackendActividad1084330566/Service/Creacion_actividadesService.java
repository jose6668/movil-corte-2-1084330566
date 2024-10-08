package com.example.BackendActividad1084330566.Service;

import com.example.BackendActividad1084330566.Entity.Creacion_actividades;
import com.example.BackendActividad1084330566.IService.ICreacion_actividadesService;
import com.example.BackendActividad1084330566.Repository.ICreacion_actividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Creacion_actividadesService implements ICreacion_actividadesService {

    @Autowired
    private ICreacion_actividadesRepository actividadesRepository;

    @Override
    public List<Creacion_actividades> All() {
        return actividadesRepository.findAll();
    }

    @Override
    public Optional<Creacion_actividades> FindById(Long codigo_actividad) {
        return actividadesRepository.findById(codigo_actividad);
    }

    @Override
    public void Update(Creacion_actividades actividades, Long codigo_actividad) {
        Optional<Creacion_actividades> us = FindById(codigo_actividad);

        if (us.isEmpty()) {
            throw new RuntimeException("Creacion_actividades no encontrado con el ID: " + codigo_actividad);
        }else {
            Creacion_actividades Actual = us.get();
            Actual.setNombre(actividades.getNombre());
            Actual.setFecha(actividades.getFecha());
            Actual.setDireccion(actividades.getDireccion());



            actividadesRepository.save(Actual);
        }

    }

    @Override
    public Creacion_actividades Save(Creacion_actividades actividades) {
        return actividadesRepository.save(actividades);
    }

    @Override
    public void Delete(Long codigo_actividad) {
        actividadesRepository.findById(codigo_actividad);
    }
}
