package com.example.BackendActividad1084330566.IService;



import com.example.BackendActividad1084330566.Entity.Creacion_actividades;

import java.util.List;
import java.util.Optional;

public interface ICreacion_actividadesService {

    List<Creacion_actividades> All();
    Optional<Creacion_actividades> FindById(Long codigo_actividad);
    void Update(Creacion_actividades actividades, Long codigo_actividad);
    Creacion_actividades Save (Creacion_actividades actividades);
    void Delete (Long codigo_actividad);
}
