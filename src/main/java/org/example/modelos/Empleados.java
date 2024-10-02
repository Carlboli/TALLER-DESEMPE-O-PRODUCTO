package org.example.modelos;

import java.time.LocalDate;

public class Empleados {

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String cedula;
    private String correo;
    private String direccion;
    private Boolean tieneExperiencia;
    private Double peso;
    private Double estatura;
    private String contactoSecundario;
    private Boolean tieneHijos;
    private Boolean casado;
    private String cuentaBancaria;
    private Boolean pelaBienElPlatano;

    public Empleados() {
    }

    public Empleados(Long id, String nombre, String apellido, LocalDate fechaNacimiento, String cedula, String correo, String direccion, Boolean tieneExperiencia, Double peso, Double estatura, String contactoSecundario, Boolean tieneHijos, Boolean casado, String cuentaBancaria, Boolean pelaBienElPlatano) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.tieneExperiencia = tieneExperiencia;
        this.peso = peso;
        this.estatura = estatura;
        this.contactoSecundario = contactoSecundario;
        this.tieneHijos = tieneHijos;
        this.casado = casado;
        this.cuentaBancaria = cuentaBancaria;
        this.pelaBienElPlatano = pelaBienElPlatano;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento() {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo() {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getTieneExperiencia() {
        return tieneExperiencia;
    }

    public void setTieneExperiencia() {
        this.tieneExperiencia = tieneExperiencia;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public String getContactoSecundario() {
        return contactoSecundario;
    }

    public void setContactoSecundario(String contactoSecundario) {
        this.contactoSecundario = contactoSecundario;
    }

    public Boolean getTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(Boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

    public Boolean getCasado() {
        return casado;
    }

    public void setCasado() {
        this.casado = casado;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Boolean getPelaBienElPlatano() {
        return pelaBienElPlatano;
    }

    public void setPelaBienElPlatano(Boolean pelaBienElPlatano) {
        this.pelaBienElPlatano = pelaBienElPlatano;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tieneExperiencia=" + tieneExperiencia +
                ", peso=" + peso +
                ", estatura=" + estatura +
                ", contactoSecundario='" + contactoSecundario + '\'' +
                ", tieneHijos=" + tieneHijos +
                ", casado=" + casado +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                ", pelaBienElPlatano=" + pelaBienElPlatano +
                '}';
    }
}
