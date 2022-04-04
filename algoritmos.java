import java.util.Scanner;

public class algoritmos {

    public static void main(String[] args) {
        int peso, altura, mc;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese peso");
        peso = teclado.nextInt();
        System.out.println("Ingrese altura");
        altura = teclado.nextInt();
        mc = peso / altura;
        System.out.println("Indice de masa Muscular: " + mc);

        if (mc < 20) {
            System.out.println("Diagnostico: Mal estado");
        } else if (mc > 20 && mc < 22) {
            System.out.println("Diagnostico: Bajo de Peso");
        } else if (mc > 22 && mc < 25) {
            System.out.println("Diagnostico: Peso Normal");
        } else if (mc > 25 && mc < 30) {
            System.out.println("Diagnostico: Sobrepeso");
        } else if (mc > 30 && mc < 40) {
            System.out.println("Diagnostico: Bajo de Peso");
        } else if (mc > 40) {
            System.out.println("Diagnostico: Bajo de Peso");
        }
    }

}