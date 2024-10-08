package com.example.BackendActividad1084330566.IService;

import com.example.BackendActividad1084330566.Entity.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IUsuariosService {
    List<Usuarios> All();
    Optional<Usuarios> FindById(Long id);
    void Update(Usuarios usuarios, Long id);
    Usuarios Save (Usuarios usuarios);
    void Delete (Long id);

}
