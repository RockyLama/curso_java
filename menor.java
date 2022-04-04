import java.util.Scanner;

public class menor {
    public static void main(String[] args) {
        int numI,numII,numIII,menor;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nunero 1");
        numI = teclado.nextInt();
        System.out.println("Ingrese Numero 2");
        numII = teclado.nextInt();
        System.out.println("Ingrese Numero 3");
        numIII = teclado.nextInt();

        if(numII>numI && numIII>numI){
            menor=numI;
            System.out.println("El numero menor es: "+menor);
        }
        else if(numI>numII && numIII>numII){
            menor=numII;
            System.out.println("El numero menor es: "+menor);
        }
        else if(numI>numIII && numII>numIII){
            menor=numIII;
            System.out.println("El numero menor es: "+menor);
        }
    }
}
