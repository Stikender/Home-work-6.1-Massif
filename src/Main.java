import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int [] apples = new int[3];
        apples[0] = 1;
        apples[1] = 2;
        apples[2] = 3;
        double [] weight = {1.57, 7.654, 9.986};
        int [] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // Задание 2
        System.out.println(apples[0]  + ", " + apples[1] + ", " + apples[2]);
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);
        for (int i =0; i < 12; i++) {
            System.out.print(month[i] + ", ");
        }
        // Задание 3
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(apples[i] + ", ");
        }

        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        for (int i = 11; i >= 0; i--) {
            System.out.print(month[i] + ", ");
        }
        System.out.println();
        // Задание 4

        for (int i = 0; i < apples.length; i++) {
            if (apples[i] % 2 != 0) {
                apples[i] += 1;

            }
            System.out.print(apples[i] + " ");
        }
    }
}