package lesson5_theory_and_inheritance;

public class Main {
    public static void main(String[] args) {
        Fraction v1 = new Fraction(3, 5);
        Fraction v2 = new Fraction(4, 8);

        System.out.println(v1 + " equals " + v2 + ": " + v1.equals(v2));
    }
}
