//Найдите самое длинное слово в предложении,
// при условии,
// что в предложении все слова разной длины.
// Предложение для поска длинного слова: "в предложении все слова разной длины".


// psvm - shortcut "public static void main(String[] args)"
// sout - shortcut "System.out.println();"


import java.util.Arrays;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String line = in.nextLine(); // введем предложение
        String[] lineMass = line.split(" ");// преобразуем предложенние в массив
        System.out.println(Arrays.toString(lineMass));

        String[] wordMass;
        for (int i = 0, ii =0, len =0; i < lineMass.length; i += 1) {
            wordMass = lineMass[i].split(""); // преобразуем каждое слово в массив букв
            System.out.println(Arrays.toString(wordMass));
            if (wordMass.length > len) {
                len = wordMass.length;
                ii = i;
            }
        }
    }
}

