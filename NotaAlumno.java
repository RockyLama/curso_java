
package notaalumno;

import java.util.Scanner;
public class NotaAlumno {


    public static void main(String[] args) {
        int nota1,nota2,nota3,suma,prom, cantidadDeNotas=3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del alumno");
        String nombre = sc.nextLine();
        System.out.println("Ingrese nota 1");
        nota1 = sc.nextInt();
        System.out.println("Ingrese nota 2");
        nota2 = sc.nextInt();
        System.out.println("Ingrese nota 3");
        nota3 = sc.nextInt();
        
        suma = nota1+nota2+nota3;
        prom=suma/cantidadDeNotas;
        
        if(prom>=7){
            System.out.println("El alumno "+nombre+" Promociona con promedio: "+prom);
        }
        else if(prom<7 && prom>=4){
            System.out.println("El alumno "+nombre+" Aprobo con promedio: "+prom);
        }
        else if(prom<4){
            System.out.println("El alumno "+nombre+" Recursa con promedio: "+prom);
        }
    }
    
}
