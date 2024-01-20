package lesson7_generics;

public class MealSettings implements Comparable<MealSettings>{
    private final String mealStyle;
    private final String restrictions;
    private final int mealTimesPerDay;

    public MealSettings(String mealStyle, String restrictions, int mealTimesPerDay) {
        this.mealStyle = mealStyle;
        this.restrictions = restrictions;
        this.mealTimesPerDay = mealTimesPerDay;
    }

    @Override
    public String toString() {
        return  "    {" + "\n" +
                "      \"mealStyle\": \"" + mealStyle + "\"," + "\n" +
                "      \"restrictions\": \"" + restrictions + "\"," + "\n" +
                "      \"mealTimesPerDay\": \"" + mealTimesPerDay + "\"" + "\n" +
                "    },";
    }

    @Override
    public int compareTo(MealSettings m) {
        return Integer.compare(this.mealTimesPerDay, m.mealTimesPerDay);
    }
}
