import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
        int notaI,notaII,notaIII,suma,prom;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nota 1");
        notaI = teclado.nextInt();
        System.out.println("Ingrese Nota 2");
        notaII = teclado.nextInt();
        System.out.println("Ingrese Nota 3");
        notaIII = teclado.nextInt();

        suma=notaI+notaII+notaIII;
        prom=suma/3;

        if(prom<10){
            System.out.println("Reprobado");
        }
        else if(prom>10 && prom<15){
            System.out.println("Aprobado");
        }
        else if(prom>10 && prom<15){
            System.out.println("Eximido");
        }

    }
}