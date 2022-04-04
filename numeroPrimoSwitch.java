
package numeroprimo;

import java.util.Scanner;
public class numeroPrimoSwitch {
    
    public static void main(String[] args) 
    {
        Scanner numeroIngresado = new Scanner(System.in);
        //Variables
        int numeroDeResultados,i,numero;
        
        System.out.print("Ingrese un numero del 1 al 14: ");
        numero = numeroIngresado.nextInt();
        //Inicializamos en cero
        
        switch(numero){
            case 2:  
            case 3:  
            case 5:  
            case 7:  
            case 11:  
            case 13:  
                    System.out.println("El numero ingresado es Primo");         
                     break;
            default: System.out.println("El numero ingresado NO es Primo");
                     break;
        }
    }
}
