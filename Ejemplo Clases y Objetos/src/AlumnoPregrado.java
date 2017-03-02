/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class AlumnoPregrado {

    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;

    public AlumnoPregrado() {
        this.nombre = "";
        this.apellido = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    public AlumnoPregrado(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public AlumnoPregrado(AlumnoPregrado alumnoPregrado) {
        this.nombre = alumnoPregrado.getNombre();
        this.apellido = alumnoPregrado.getApellido();
        this.nota1 = alumnoPregrado.getNota1();
        this.nota2 = alumnoPregrado.getNota2();
        this.nota3 = alumnoPregrado.getNota3();
    }

    public String getSituacionFinal() {
        double promedio = this.getPromedio();
        if (promedio < 3.5) {
            return "REPROBADO.";
        }
        if (promedio < 4.0) {
            return "EXAMEN.";
        }
        return "APROBADO.";
    }

    public double getPromedio() {
        double suma = this.nota1 + this.nota2 + this.nota3;
        double promedio = suma / 3;
        return promedio;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 1.0 && nota1 <= 7.0) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 1.0 && nota2 <= 7.0) {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return this.nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 1.0 && nota3 <= 7.0) {
            this.nota3 = nota3;
        }
    }

}
