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
    public Optional<Creacion_actividades> FindById(Long id) {
        return actividadesRepository.findById(id);
    }

    @Override
    public void Update(Creacion_actividades actividades, Long id) {
        Optional<Creacion_actividades> us = FindById(id);

        if (us.isEmpty()) {
            throw new RuntimeException("Creacion_actividades no encontrado con el ID: " + id);
        }else {
            Creacion_actividades Actual = us.get();
            Actual.setFecha(actividades.getFecha());
            Actual.setNombre(actividades.getNombre());
            Actual.setDireccion(actividades.getDireccion());



            actividadesRepository.save(Actual);
        }

    }

    @Override
    public Creacion_actividades Save(Creacion_actividades actividades) {
        return actividadesRepository.save(actividades);
    }

    @Override
    public void Delete(Long id) {
        actividadesRepository.deleteById(id);
    }
}
