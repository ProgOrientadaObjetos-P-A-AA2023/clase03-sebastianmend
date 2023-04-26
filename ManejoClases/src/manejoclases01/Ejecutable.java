/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.1f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
        //un objeto de tipo hospital
        
       Hospital hospital2=new Hospital();
       
       hospital2.nombre="Solca";
       hospital2.numeroCamas = 500;
       hospital2.presupuesto = 3872382.67;
       System.out.printf("%s - %d - %.2f\n", hospital2.nombre,
                hospital2.numeroCamas, hospital2.presupuesto);
       
    }
}
