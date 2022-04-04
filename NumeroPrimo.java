package numeroprimo;

import java.util.Scanner; //permite que el usuario ingrese informacion por pantalla

public class NumeroPrimo 
{
    public static void main(String[] args) 
    {
        Scanner numeroIngresado = new Scanner(System.in);
        //Variables
        int numeroDeResultados,i,numero;
        
        System.out.print("Ingrese un numero del 1 al 14: ");
        numero = numeroIngresado.nextInt();
        //Inicializamos en cero
        numeroDeResultados = 0;
        
        for(i=1;i<=numero;i++)//con el ciclo for verificamos por cuanto numeros es divisible
        {
            if((numero%i)==0)
            {
                numeroDeResultados++;
            }
        }
        
        if(numeroDeResultados <=2)//Condicion, si es menor o igual a dos es numero primo, si es mayo a dos no es primo
        {
            System.out.println("El numero ingresado " + numero + " es primo");
        }else{
            System.out.println("El numero ingresado " + numero + " no es primo");
        }
    }
}
