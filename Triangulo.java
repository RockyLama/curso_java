

package triangulo;

import java.util.Scanner;
/**
 *
 * @author lamad
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado1,lado2,lado3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese lado 1");
        lado1 = sc.nextInt();
        System.out.println("Ingrese lado 2");
        lado2 = sc.nextInt();
        System.out.println("Ingrese lado 3");
        lado3 = sc.nextInt();
        
        
        if(lado1==lado2 || lado1==lado3 || lado2==lado3){
            System.out.println("Trianglo: isosceles");
        }
        else if(lado1==lado2 && lado1==lado3){
            System.out.println("Trianglo: equilatero");
        }
        else{
            System.out.println("Trianglo: escaleno");
        }
    }
    
}
