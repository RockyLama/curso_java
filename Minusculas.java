package minusculas;

public class Minusculas {

    public static void main(String[] args) {
        //char caracter[];
        char caracter[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < caracter.length; i++) {
            System.out.println("La Minuscula numero " + (i+1) + " es: " + caracter[i]);
        }
    }

}
