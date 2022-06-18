package java9.streamenhancement;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Set'in sirali tutmadigindan her seferinde farkli vermesi
public class LimitSkipSet {
    public static void main(String[] args) {
        limit();
        skip();
    }

    public static void limit(){
        List<String> data =
                getData().stream()
                        .limit(5)
                        .collect(Collectors.toList());
        System.out.println(data);
    }

    public static Set<String> getData(){
        return Set.of("a","c", "e","g","i","j","l","n");
    }

    public static void skip() {
        List<String> data =
                getData().stream()
                        .skip(5)
                        .collect(Collectors.toList());
        System.out.println(data);
    }

}
