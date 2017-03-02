/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("Ejemplo Clases y Objetos");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoPregrado al1 = new AlumnoPregrado("Miguel", "Perez", 40.0, 20.0, 35.0);
        AlumnoPregrado al2 = new AlumnoPregrado("Jaime", "Lopez", 40.0, 60.0, 45.0);
        AlumnoPregrado al3 = new AlumnoPregrado("Ismael", "Rojas", 40.0, 35.0, 38.0);

        c.println("\nNombre: " + al1.getNombreCompleto());
        c.println("Promedio: " + al1.getPromedio());
        c.println("Situacion Final: " + al1.getSituacionFinal());

        c.println("\nNombre: " + al2.getNombreCompleto());
        c.println("Promedio: " + al2.getPromedio());
        c.println("Situacion Final: " + al2.getSituacionFinal());

        al3.setNota3(700.0);

        c.println("\nNombre: " + al3.getNombreCompleto());
        c.println("Promedio: " + al3.getPromedio());
        c.println("Situacion Final: " + al3.getSituacionFinal());
    }

}
