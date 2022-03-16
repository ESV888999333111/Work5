//Определить, является ли срока полиндромом.
// не работает
import java.util.Scanner;

public class Polyndrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово:");
        String poly = in.nextLine();
        //String[] polyMass = poly.split("");// преобразуем слово в массив букв
        StringBuilder revPoly = new StringBuilder(poly).reverse();
        System.out.println("++++" + revPoly);
        if (revPoly.equals(poly)) System.out.println("Выраежение: " + poly + " - полиндром");
        else System.out.println("Выражение: " + poly + " - не полиндром");

    }
}
