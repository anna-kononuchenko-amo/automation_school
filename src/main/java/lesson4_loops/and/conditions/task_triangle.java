package lesson4_loops.and.conditions;

public class task_triangle {
    public static void main(String[] args) {
        int rows = 5;

        // Трикутник
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int k = 0;
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
        }

        // Ромб
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int k = 0;
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
        }
    }
}
