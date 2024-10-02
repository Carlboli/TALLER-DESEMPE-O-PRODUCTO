package org.example.modelos;

public class Nomina {

    private Long id;
    private String nombreEmpleado;
    private String idEmpleado;
    private String cargo;
    private Float salario;
    private Float horasTrabajadas;
    private Float salarioBruto;
    private Float bonificaciones;
    private Float comisiones;
    private Float pagoHoraExtra;

    public Nomina() {
    }

    public Nomina(Long id, String nombreEmpleado, String idEmpleado, String cargo, Float salario, Float horasTrabajadas, Float salarioBruto, Float bonificaciones, Float comisiones, Float pagoHoraExtra) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioBruto = salarioBruto;
        this.bonificaciones = bonificaciones;
        this.comisiones = comisiones;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Float getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(Float bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public Float getComisiones() {
        return comisiones;
    }

    public void setComisiones(Float comisiones) {
        this.comisiones = comisiones;
    }

    public Float getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(Float pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", idEmpleado='" + idEmpleado + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", horasTrabajadas=" + horasTrabajadas +
                ", salarioBruto=" + salarioBruto +
                ", bonificaciones=" + bonificaciones +
                ", comisiones=" + comisiones +
                ", pagoHoraExtra=" + pagoHoraExtra +
                '}';
    }
}
