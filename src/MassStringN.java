/*Задать массив на N слов.
В цикле считывать с консоли слова (scanner.nextLine()),
и добавлять их в массив (добавлять новое слово в массив можно только,
если в нем его еще нет). В итоге в массиве будут только уникальные слова.
Выход их программы по слову exit (слово 'exit' в массив не добавлять) или
если массив заполнен
Перед завершением программы, вывести получившийся массив в консоль
 */
// psvm - shortcut "public static void main(String[] args)"
// sout - shortcut "System.out.println();"

import java.util.Scanner;
import java.util.Arrays;

public class MassStringN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int massN = in.nextInt();
        String[] massW = new String[massN];

        for (int i = 0; i < massN; i += 1) {
            System.out.println("Введите слово массива: ");
            Scanner sw = new Scanner(System.in);
            String word = sw.nextLine();
            if ("exit".equals(word)) break;
            else {
                // проверка на пулл строк
                String interMass = word.intern();
                if (word == interMass) massW[i] = interMass;
            }
        }
        System.out.println(Arrays.toString(massW));
    }
}
