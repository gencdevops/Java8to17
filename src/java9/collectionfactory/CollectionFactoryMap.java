package java9.collectionfactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class CollectionFactoryMap {
    public static void main(String[] args) {
        unmodifiableMapUsingPut();
        unmodifiableMapUsingOf();
        unmodifiableMapWithTenElements();

    }

    public static void unmodifiableMapUsingPut() {
        Map<String, Integer> map = new HashMap<>();

        map.put("EPL", 200);
        map.put("LaLiga", 210);
        map.put("Bundesliga", 190);

        Map<String, Integer> leagueRanking = Collections.unmodifiableMap(map);
        System.out.print(leagueRanking);
    }

    public static void unmodifiableMapUsingOf() {
        Map<String, Integer> leagueRanking =
                Map.of("Epl", 200, "LaLiga", 210, "Bundesliga", 190);
        System.out.println(leagueRanking);
    }


    //Entries methoduyla coklu ekleme
    public static void unmodifiableMapWithTenElements() {
        //If more than 10 entries...
        Map<String, Integer> leagueRanking =
                Map.ofEntries(
                        entry("Epl", 200),
                        entry("LaLiga", 210),
                        entry("Bundesliga", 190),
                        entry("League1", 250)
                );
        System.out.println(leagueRanking);
    }
}
