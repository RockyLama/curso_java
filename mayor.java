import java.util.Scanner;

public class mayor {
    public static void main(String[] args) {
        int numI,numII,numIII,mayor;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nunero 1");
        numI = teclado.nextInt();
        System.out.println("Ingrese Numero 2");
        numII = teclado.nextInt();
        System.out.println("Ingrese Numero 3");
        numIII = teclado.nextInt();

        if(numII<numI && numIII<numI){
            mayor=numI;
            System.out.println("El numero mayor es: "+mayor);
        }
        else if(numI<numII && numII<numII){
            mayor=numII;
            System.out.println("El numero mayor es: "+mayor);
        }
        else if(numI<numIII && numII<numIII){
            mayor=numIII;
            System.out.println("El numero mayor es: "+mayor);
        }
    }
}
