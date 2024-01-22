package lesson7_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagination pagination = new Pagination(10, 20, 30);

        List<MealSettings> mealSettingsList = new ArrayList<>();

        mealSettingsList.add(new MealSettings("OMNIVORE", "NONE", 3));
        mealSettingsList.add(new MealSettings("VEGETARIAN", "GLUTEN-FREE", 5));
        mealSettingsList.add(new MealSettings("VEGAN", "LACTOSE-FREE", 4));

        SearchResult<MealSettings> search1 = new SearchResult<>(mealSettingsList, pagination);

        List<Workout> workoutList = new ArrayList<>();

        workoutList.add(new Workout("STRENGTH", "MAIN", true));
        workoutList.add(new Workout("YOGA", "RESTORATIVE", false));

        SearchResult<Workout> search2 = new SearchResult<>(workoutList, pagination);

        System.out.println();
        System.out.println("*** MealSettings sorting by meal times per day ***");
        System.out.println();

        Collections.sort(search1.getData());
        search1.getData().forEach(System.out::println);

        System.out.println();
        System.out.println("*** Workouts ***");
        System.out.println();

        search2.getData().forEach(System.out::println);
    }
}
