package com.example.BackendActividad1084330566.Repository;

import com.example.BackendActividad1084330566.Entity.Creacion_actividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICreacion_actividadesRepository extends JpaRepository<Creacion_actividades, Long> {
}
