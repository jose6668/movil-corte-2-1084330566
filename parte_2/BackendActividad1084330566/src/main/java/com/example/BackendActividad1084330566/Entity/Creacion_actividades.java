package com.example.BackendActividad1084330566.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "creacion_actividades")
public class Creacion_actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_actividad;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    public Long getCodigo_actividad() {
        return codigo_actividad;
    }

    public void setCodigo_actividad(Long codigo_actividad) {
        this.codigo_actividad = codigo_actividad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
