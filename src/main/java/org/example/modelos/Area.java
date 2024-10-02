package org.example.modelos;

import java.time.LocalDate;

public class Area {

    private Long id;
    private String nombre;
    private String localidad;
    private String tipo;
    private LocalDate fechaInicio;
    private String equipos;
    private String tareas;
    private Float espacio;
    private String recursos;
    private Integer numeroEmpleados;

    public Area() {
    }

    public Area(Long id, String nombre, String localidad, String tipo, LocalDate fechaInicio, String equipos, String tareas, Float espacio, String recursos, Integer numeroEmpleados) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.equipos = equipos;
        this.tareas = tareas;
        this.espacio = espacio;
        this.recursos = recursos;
        this.numeroEmpleados = numeroEmpleados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public Float getEspacio() {
        return espacio;
    }

    public void setEspacio(Float espacio) {
        this.espacio = espacio;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", equipos='" + equipos + '\'' +
                ", tareas='" + tareas + '\'' +
                ", espacio=" + espacio +
                ", recursos='" + recursos + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                '}';
    }
}
