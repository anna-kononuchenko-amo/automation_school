package lesson7_generics;

public class Data <T, V>{
    private String string = "";
    public String getResult() {
        return string;
    }
    public void setMealSettings (T t){
        this.string = this.string + "\n" + t.toString();
    }
    public void setWorkout (V v){
        this.string = this.string + "\n" + v.toString();
    }

    @Override
    public String toString() {
        return "  \"data\": [" +
                string + "\n" +
                "  ],";
    }
}
