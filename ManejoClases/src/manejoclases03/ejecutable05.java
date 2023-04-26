
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;
import java.util.Scanner;
/**
 *
 * @author SALA H
 */
public class ejecutable05 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        
        // Dar alores a los atributos
        // ingresar los valores por teclado 
        
        String hospital;
        int numCamas;
        double valorPresupuesto;
        System.out.println("Ingrese el nombre del Hospital");
        hospital=entrada.nextLine();
        
        System.out.println("Ingrese el número de camas");
        numCamas=entrada.nextInt();
        
        System.out.println("Ingrese el presupuesto");
        valorPresupuesto=entrada.nextDouble();
        
        Hospital nuevoHospital=new Hospital();         
        
        
        nuevoHospital.establecerNombre(hospital);
        nuevoHospital.establecerNumeroCamas(numCamas);
        nuevoHospital.establecerPresupuesto(valorPresupuesto);
         System.out.printf("%s - %d - %.2f\n", nuevoHospital.obtenerNombre(), 
                nuevoHospital.obtenerNumeroCamas(), nuevoHospital.obtenerPresupuesto());
        
}
}