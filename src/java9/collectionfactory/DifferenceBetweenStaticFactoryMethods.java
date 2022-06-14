package java9.collectionfactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DifferenceBetweenStaticFactoryMethods {
    public static void main(String[] args) {
        listOfVsUnmodifiable();
    }

    public static void listOfVsUnmodifiable() {
        List<String> list = Arrays.asList("maksim gorki", "tolstoy", "zweig", null);
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("unmodifiableList : " + unmodifiableList);


        //List.of() icerisine null deger gelirse NPE verir
//        List<String> listOf = List.of("maksim gorki", "tolstoy", "zweig", null);
//        System.out.println("List.of : " + listOf);

    }





}
