package com.java.chapter14.typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author gongchunru
 * @Package com.java.chapter14.typeinfo.pets
 * @date 16/3/24 22:45
 */
public class LiteralPetCreator extends PetCreator {

    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(Pet.class,Dog.class,Cat.class,Rodent.class,
                    Mutt.class,Pug.class,EgyptianMau.class,Manx.class,Cymric.class,Rat.class,Mouse.class,Hamster.class));
    //Types for random creation;
    private static final List<Class<? extends  Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
