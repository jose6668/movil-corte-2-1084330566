package com.example.BackendActividad1084330566.Service;

import com.example.BackendActividad1084330566.Entity.Usuarios;
import com.example.BackendActividad1084330566.IService.IUsuariosService;
import com.example.BackendActividad1084330566.Repository.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    private IUsuariosRepository usuariosRepository;

    @Override
    public List<Usuarios> All() {
        return usuariosRepository.findAll();
    }

    @Override
    public Optional<Usuarios> FindById(Long id) {
        return usuariosRepository.findById(id);
    }

    @Override
    public void Update(Usuarios usuarios, Long id) {
        Optional<Usuarios> us = FindById(id);

        if (us.isEmpty()) {
            throw new RuntimeException("Usuario no encontrado con el ID: " + id);
        }else {
            Usuarios usuarioActual = us.get();
            usuarioActual.setNombre(usuarios.getNombre());
            usuarioActual.setApellido(usuarios.getApellido());
            usuarioActual.setCorreo(usuarios.getCorreo());
            usuarioActual.setDireccion(usuarios.getDireccion());
            usuarioActual.setTelefono(usuarios.getTelefono());
            usuarioActual.setContrasena(usuarios.getContrasena());


            usuariosRepository.save(usuarioActual);
        }

    }

    @Override
    public Usuarios Save(Usuarios usuarios) {
        return  usuariosRepository.save(usuarios);
    }

    @Override
    public void Delete(Long id) {
        usuariosRepository.deleteById(id);
    }
}
