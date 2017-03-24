package other;

import com.java.improve.reflect.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gongchunru on 2017/3/1.
 */
public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("Bob",10));
        list.add(new Person("Tom",20));

        for (Person p: list) {
            System.out.println(p.toString());

            p.setAge(30);

        }

        for (Person p: list) {
            System.out.println(p.toString());

        }

    }
}
