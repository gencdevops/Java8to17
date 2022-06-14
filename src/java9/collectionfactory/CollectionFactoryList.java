package java9.collectionfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// Collection factory methodlari collection'larin davranislarini surdurur. Ornegin liste null eleman eklememek
//veya Set icerisinde duplicate olmamasi gibi.


public class CollectionFactoryList {
    public static void main(String[] args) {
        //unmodifiableListWithAdd();

        unmodifiableListArraysAsListExample();

        //unmodifiableListOf();
    }


    public static void unmodifiableListWithAdd() {
        List<String> list = new ArrayList<>();
        list.add("maksim gorki");
        list.add("turganyev");
        list.add("omer seyfettin");

        List<String> writers1 = Collections.unmodifiableList(list);

        //UnsupportedOperationException
        //writers1.add("ihsan oktay anar");


        System.out.println(writers1);
    }

    public static void unmodifiableListArraysAsListExample() {
        List<String> writers2 = Collections.unmodifiableList(
                Arrays.asList("maksim gorki", "turganyev", "omer seyfettin"));

        //UnsupportedOperationException
        // writers2.add("ihsan oktay anar");

        System.out.println(writers2);


    }


    //Java9 static factory methods
    //Efective Java kitabinda onerilen orneklerden
    public static void unmodifiableListOf() {
        List<String> writers3 = List.of("maksim gorki", "turganyev", "omer seyfettin");
        System.out.println(writers3);

        List<String> emptyList = List.of();
        List<String> oneElement = List.of("maksim gorki");
        List<String> twoElement = List.of("maksim gorki", "turganyev");
        List<String> moreElement = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "k");


        //UnsupportedOperationException
        //writers3.add("ihsan oktay anar");

        //UnsupportedOperationException
        //writers3.set(0, "ihsan oktay anar");
        //System.out.println(writers3);


//        UnsupportedOperationException
//        writers3.remove("turganyev");
//        System.out.println(writers3);


    }
}
