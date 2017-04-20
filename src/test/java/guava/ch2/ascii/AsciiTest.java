package guava.ch2.ascii;

import com.google.common.base.Ascii;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


/**
 * Created by gongchunru
 * Date：2017/4/14.
 * Time：10:02
 */
public class AsciiTest {

    @Test
    public void testIsLowerCase(){
        assertThat(Ascii.isLowerCase('b'), is(true));
    }

    @Test
    public void testIsUpperCase(){
        assertThat(Ascii.isUpperCase('B'), is(true));
    }

    @Test
    public void testToLowerCase(){
        assertThat(Ascii.toLowerCase("HELLO"),is("hello"));
    }

    @Test
    public void testToUpperCase(){
        assertThat(Ascii.toUpperCase("hello"),is("HELLO"));
    }
}
