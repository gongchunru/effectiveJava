package java8.lambda;

import com.google.common.collect.Lists;

import java.util.*;

public class Lambda1 {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter","anna","mike","xenia");
        List<Integer> nums = Arrays.asList(2,15,1,8,3,4);
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });


        Collections.sort(nums,Integer::compareTo);

        Collections.sort(names, Comparator.reverseOrder());

        names.sort(Comparator.reverseOrder());
        names.sort(Collections.reverseOrder());

        Collections.sort(names, (a,b) -> b.compareTo(a));

        Collections.sort(nums,(Integer a, Integer b) -> b.compareTo(a));


        List<String> names2 = Arrays.asList("peter",null,"anna","mike","jobs");
        names2.sort(Comparator.nullsLast(String::compareTo));
        System.out.println(names2);

//        List<String> names3 = Arrays.asList("peter",null,"anna","mike","jobs");
        List<String> names3 = null;
//        Optional.ofNullable(names3).isPresent(list -> list.sort(Comparator.naturalOrder()));
//        Optional.ofNullable(names3).isPresent(Collections::sort);

    }



}
