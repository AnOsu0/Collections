package Example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lotto {
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static ArrayList<Integer> winNumbers = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        generate();
        randomize();
        winNumbers();
        Collections.sort(winNumbers);
        ArrayList<Integer> Users = fromUser();
        Collections.sort(Users);
        System.out.println("Twoje liczby to " + Users);
        System.out.println("WYgrane liczby to " + winNumbers);
        System.out.println("Liczba trafień: " + checkResult(Users));

    }

    private static void generate() {
        for (int i = 0; i < 49; i++) {
            numbers.add(i + 1);
        }
    }

    private static void randomize() {
        Collections.shuffle(numbers);
    }

    private static void winNumbers() {
        for (int i = 0; i < 6; i++) {
            winNumbers.add(numbers.get(i));
        }
    }

    private static ArrayList<Integer> fromUser() {
        ArrayList<Integer> fromUser = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbę nr " + (i + 1));
            fromUser.add(sc.nextInt());
        }
        return fromUser;
    }

    private static int checkResult(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < 6; i++) {
            int number = list.get(i);
            if (winNumbers.contains(number)) {
                result++;
            }
        }
        return result;
    }


}
