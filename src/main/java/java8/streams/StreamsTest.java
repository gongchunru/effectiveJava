package java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.print(p));

        System.out.println("------");

        Stream<Integer> stream2 = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
        stream2.forEach(p -> System.out.print(p));


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream1 = list.stream();
        stream1.forEach(p -> System.out.print(p));

        System.out.println("------\n");
//
//        Stream<Date> stream3 = Stream.generate(() -> {
//            return new Date();
//        });
//        stream3.forEach(p -> System.out.println(p));


        System.out.println("---3-----\n");

        IntStream stream3 = "123_adadf".chars();
        stream3.forEach(p -> System.out.println(p));

        System.out.println("---4-----\n");

//        Stream<String> stream4 = Stream.of("A$B$C".split("$"));
//        stream4.forEach(p -> System.out.println(p));

        test2();

        test3();

    }



    private static void test2(){

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0 ).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumbersArr));
    }

    private static void test3(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("zs");
        memberNames.add("ls");
        memberNames.add("ww");
        memberNames.add("ll");
        memberNames.add("Alpha");
        memberNames.add("Apple");

        memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("---------");
        List<String> namesInUpper = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesInUpper);



        boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
        System.out.println(" matchedResult  " + matchedResult);

        matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
        System.out.println(" matchedResult  " + matchedResult);

        matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
        System.out.println(" matchedResult  " + matchedResult);

        long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
        System.out.println("totalMatched  "+totalMatched);


        Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);


        boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
        System.out.println("matched "+matched);

        String firstMatchedName = memberNames.stream().filter(s -> s.startsWith("A")).findFirst().get();
        System.out.println("firstMatchedName  "+firstMatchedName);










    }

}
