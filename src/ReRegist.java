//Заменить все буквы в слове на строчные,
// а первую букву на заглавную.
// Например, дано hello, получаем Hello / дано HeLLO, получаем Hello.


// psvm - shortcut "public static void main(String[] args)"
// sout - shortcut "System.out.println();"

import java.util.Arrays;
import java.util.Scanner;

public class ReRegist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = in.nextLine();
        String[] wordMass = word.split("");// преобразуем слово в массив букв
        System.out.println(Arrays.toString(wordMass));
    }
}

