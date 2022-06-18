package java9.streamenhancement;

import java.util.List;
import java.util.stream.Collectors;

//Java 9
public class LimitSkip {

    public static void main(String[] args) {
        limit();
        skip();
    }

    //limit ilk kac datayi almak istiyorsan
    public static void limit(){
        List<String> data =
                getData().stream()
                        .limit(5)
                        .collect(Collectors.toList());
        System.out.println(data);
    }

    public static List<String> getData(){
        return List.of("a","c", "e","g","i","j","l","n");
    }

    //ilk kactaneyi atlamak istiyorsan

    public static void skip() {
        List<String> data =
                getData().stream()
                        .skip(5)
                        .collect(Collectors.toList());
        System.out.println(data);
    }
}
