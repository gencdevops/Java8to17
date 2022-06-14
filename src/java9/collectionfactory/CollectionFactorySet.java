package java9.collectionfactory;

import java.util.*;

public class CollectionFactorySet {
    public static void main(String[] args) {

    }

    public static void unmodifiableSetAdd() {
        Set<String> set = new HashSet<>();
        set.add("EPL");
        set.add("LALIGA");
        set.add("BUNDESLIGA");

        Set<String> leagues = Collections.unmodifiableSet(set);
        System.out.println(leagues);
    }


    public static void unmodifiableListArraysAsList() {
        List<String> leagues = Collections.unmodifiableList(
                Arrays.asList("Epl", "LaLiga", "Bundesliga"));

        System.out.println(leagues);
    }


    public static void unmodifiableSetOf() {
        Set<String> leagues = Set.of("EPL", "LALIGA", "BUNDESLIGA");
        System.out.println(leagues);
    }


}
