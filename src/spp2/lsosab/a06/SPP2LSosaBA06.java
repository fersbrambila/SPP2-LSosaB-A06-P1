/*
 * Luisa Fernanda Sosa Brambila
 * A01411485
 * IIS
 */
package spp2.lsosab.a06;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBA06 {

   
    public static void main(String[] args) {
        System.out.println("Acumulador de números hasta que se ingrese un número negativo");
        double num=0;
        double suma =0;
        while(num>=0){
            try{
            suma= calcularSuma(num,suma);
            num=solicitarDatos(); 
        }
            catch (Exception ex){
                System.out.println("Este programa solo admite números, por favor ingresa un número");
                
            }
        }
        System.out.println("La suma de los números positivos es: "+suma);

        Scanner tec= new Scanner(System.in);
        System.out.println("");
    }
    
    static double solicitarDatos(){
        Scanner tec = new Scanner (System.in);
        double num;
        System.out.println("Ingresa un número positivo: ");
        num=tec.nextDouble();
        return num;
    }

    static double calcularSuma(double num, double suma){
        
        return suma=suma+num;
    }

    
}
