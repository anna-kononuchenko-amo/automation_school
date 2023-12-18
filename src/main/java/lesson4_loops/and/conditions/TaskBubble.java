package lesson4_loops.and.conditions;

public class TaskBubble {
    public static void main(String[] args) {
        int[] intArray = {31, 432, 3, 42, 51, 999, -1};
        int l = intArray.length;

        for (boolean flag = true; flag; ) {
            flag = false;
            for (int i = 0; i < l - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
