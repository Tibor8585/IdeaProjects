

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practiceList2 {
    public static void main(String[] args) {
        List<String> randomNames = new ArrayList<>();
        List<Integer> randomNums = new ArrayList<>();
        List<Double> randomDoubleNums = new ArrayList<>();
        List<Boolean> randomBooleans = new ArrayList<>();

        System.out.println(randomNames.isEmpty());
        System.out.println(randomNames.size());
        randomNames.add("Tomi");
        System.out.println(randomNames.isEmpty());
        System.out.println(randomNames.size());
        randomNames.add("Tomi2");
        randomNames.add("Tomi3");
        randomNames.add("Tomi4");
        randomNums.add(1);

        System.out.println(randomNames.size());


        List<String> names = Arrays.asList("Viktor", "József", "Benedek");
        System.out.println(names);

        randomNames.addAll(names);

        System.out.println(randomNames);
        System.out.println(randomNames.get(5));
        if (randomNames.contains("József")) {
            System.out.println("Van benne József");
        }

        randomNames.remove(3);

        System.out.println(randomNames);
        System.out.println(randomNames.get(5));


        randomNames.remove("Tomi2");

        System.out.println(randomNames);

        if (randomNames.contains("Tomi2")) {
            System.out.println("Van benne Tomi2");
        }

        System.out.println("----------------------------------");
        List<Integer> numsList = new ArrayList<>();
        for (int i = 100; i <= 111; i++) {
            numsList.add(i);
        }
        System.out.println(numsList);
    }
    }

