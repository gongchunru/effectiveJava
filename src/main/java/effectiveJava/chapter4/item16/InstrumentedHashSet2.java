package effectiveJava.chapter4.item16;

import java.util.*;

/**
 * Created by gongchunru on 2017/2/28.
 */
public class InstrumentedHashSet2<E> extends ForwardingSet<E>   {

    private int addCount = 0;


    public InstrumentedHashSet2(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount ++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }


    public int getAddCount(){
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet2<String> set = new InstrumentedHashSet2<String>(new HashSet<String>());
        set.addAll(Arrays.asList("Snap","Crackle","Bob"));
        System.out.println(set.getAddCount());

    }

}


class ForwardingSet<E> implements Set<E>{

    private final Set<E> s;

    public ForwardingSet(Set<E> s) {
        this.s = s;
    }


    public boolean add(E e) {
        return s.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        return s.addAll(c);
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }



    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }
}