package lesson7_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Data<MealSettings, Workout> data = new Data<>();
        Pagination pagination = new Pagination(10, 20, 30);

        MealSettings mealSettings1 = new MealSettings("OMNIVORE", "NONE", 3);
        MealSettings mealSettings2 = new MealSettings("VEGETARIAN", "GLUTEN-FREE", 5);
        MealSettings mealSettings3 = new MealSettings("VEGAN", "LACTOSE-FREE", 4);

        Workout workout1  = new Workout("STRENGTH", "MAIN", true);
        Workout workout2  = new Workout("YOGA", "RESTORATIVE", false);

        data.setMealSettings(mealSettings1);
        data.setMealSettings(mealSettings2);
        data.setMealSettings(mealSettings3);
        data.setWorkout(workout1);
        data.setWorkout(workout2);

        SearchResult<Data, Pagination> searchResult = new SearchResult<>();
        searchResult.setResult(data, pagination);
        System.out.println(searchResult.getResult());

        System.out.println();
        System.out.println("*** MealSettings sorting by meal times per day ***");
        System.out.println();

        List<MealSettings> list = new ArrayList<>();
        list.add(mealSettings1);
        list.add(mealSettings2);
        list.add(mealSettings3);

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
