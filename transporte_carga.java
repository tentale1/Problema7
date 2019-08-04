import java.util.Scanner;

/**
 * Programa para hallar la eficiencia de transportar carga a Sasaima
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class transporte_carga
{
    public static void main(String[] args)
    {
        double dist=80.2,cap=1000,gpk=0.10,ppg=10000,kg,viaj,costg,gpv,gas;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Este transporte es capaz de transportar 1000 Kg");
        
        System.out.println("Por favor ingrese la cantidad de kilos que desea transportar a Sasaima");
        kg = Teclado.nextDouble();
        
        gas = gpk*dist; // gal a Sasaima
        viaj = kg/cap; //cantidad de viajes
        gpv = gas*viaj; //gal X viaje
        costg = gpv*ppg; //costo gas
        
                 
        System.out.println("Para transportar esta cantidad de mercancia seran necesarios  " + viaj + " viaje/s");
        System.out.println("Se consumira " + gpv + " galones de gasolina");
        System.out.println("El costo de la gasolina será de " + "$" + costg + " CoP");
    }
}
