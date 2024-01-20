package lesson7_generics;

public class Workout {
    private final String type;
    private final String purpose;
    private final boolean isCompleted;

    public Workout(String type, String purpose, boolean isCompleted) {
        this.type = type;
        this.purpose = purpose;
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "    {" + "\n" +
                "      \"type\": \"" + type + "\"," + "\n" +
                "      \"purpose\": \"" + purpose + "\"," + "\n" +
                "      \"isCompleted\": \"" + isCompleted + "\"" + "\n" +
                "    },";
    }
}
