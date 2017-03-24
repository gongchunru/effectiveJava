package effectiveJava.chapter2.No06;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by gongchunru on 2017/2/17.
 */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object object){
        ensureCapacity();
        elements[size++] = object;
    }

    /**
     * 一个对象被弹出栈，指向他的引用就过期了，需要手动清空。
     * @return
     */
    public Object pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }


    private void ensureCapacity(){
        if (elements.length == size){
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }




}
