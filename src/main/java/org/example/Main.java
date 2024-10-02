package org.example;

import org.example.modelos.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleados empleado = new Empleados();
        Area area = new Area();
        Beneficiario beneficiario = new Beneficiario();
        Nomina nomina = new Nomina();
        Sucursal sucursal= new Sucursal();

        Beneficiario beneficiario1 = new Beneficiario(beneficiario.getId(), beneficiario.getNombre(), beneficiario.getApellido(), beneficiario.getFechaNacimiento(), beneficiario.getNumeroIdentificacion(), beneficiario.getDireccion(), beneficiario.getTelefono(), beneficiario.getCorreo(), beneficiario.getNacionalidad(), beneficiario.getGenero());
        beneficiario1.setNombre("carlos");
        beneficiario1.setApellido("el mejor");
        beneficiario1.setCorreo("hola@adsa.com");
        beneficiario1.setDireccion("callevenezuela#33");
        beneficiario1.setGenero("hombre");
        beneficiario1.setNacionalidad("colombiano");
        beneficiario1.setFechaNacimiento(LocalDate.now());
        beneficiario1.setNumeroIdentificacion("1010101010");
        beneficiario1.setTelefono("3218828138");

        Nomina nomina1 = new Nomina(nomina.getId(), nomina.getNombreEmpleado(), nomina.getIdEmpleado(), nomina.getCargo(), nomina.getSalario(), nomina.getHorasTrabajadas(), nomina.getSalarioBruto(), nomina.getBonificaciones(), nomina.getComisiones(), nomina.getPagoHoraExtra());
        nomina1.setBonificaciones((float) 20000.0);
        nomina1.setCargo("jefe de area");
        nomina1.setComisiones((float)3000.0);
        nomina1.setHorasTrabajadas((float) 43);
        nomina1.setNombreEmpleado("Carlos");
        nomina1.setIdEmpleado("1");
        nomina1.setPagoHoraExtra((float)3000);
        nomina1.setSalarioBruto((float)90000);
        nomina1.setSalario((float)30000000);

        Sucursal sucursal1 = new Sucursal(sucursal.getId(), sucursal.getNombre(), sucursal.getDireccion(), sucursal.getCiudad(), sucursal.getCodigoPostal(), sucursal.getPais(), sucursal.getContacto(), sucursal.getRegion(), sucursal.getCorreo(), sucursal.getFechaApertura());
        sucursal1.setNombre("suratech");
        sucursal1.setPais("peru");
        sucursal1.setCorreo("parcenose@menos.szs");
        sucursal1.setDireccion("callebaretosur#58-40");
        sucursal1.setCiudad("Medellín");
        sucursal1.setCodigoPostal("051000");
        sucursal1.setFechaApertura(LocalDate.now());
        sucursal1.setRegion("lima");
        sucursal1.setContacto("3213214544");

        System.out.println(beneficiario1);
        System.out.println(nomina1);
        System.out.println(sucursal1);


    }
}