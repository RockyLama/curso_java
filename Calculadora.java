
package calculadora;
import java.util.Scanner;

public class Calculadora {

 
    public static void main(String[] args) {
        int valor1, valor2, op, suma, mul, resta,div;
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecccione la operacion: 1 Suma, 2 Resta, 3 Multiplicacion, 4 Division ");
        op = sc.nextInt();
        System.out.println("Ingrese el primer valor");
        valor1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        valor2 = sc.nextInt();
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        mul = valor1 * valor2;
        div = valor1 / valor2;
        
        
        switch (op) {
            case 1:
                System.out.println("La suma es:" + suma);
                break;
            case 2:
                System.out.println("La resta es:" + resta);
                break;
            case 3:
                System.out.println("El producto entre ambos es:" + mul);
                break;
            case 4:
                System.out.println("La division entre ambos es:" + div);
                break;
            default: System.out.println("Opcion incorrecta");
                     break;
        }

    }
    
}
