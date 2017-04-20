package guava.ch2.Objects;

/**
 * Created by gongchunru
 * Date：2017/4/20.
 * Time：17:32
 */
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
//import static com.google.common.base.Objects.*;
import static com.google.common.base.MoreObjects.*;
public class ObjectTest {

    @Test
    public void testFirstNonNullBothNotNull(){
        String value = "foo";
        //返回第一个非null的值
        String returned = firstNonNull(value, null);
        assertThat(returned,is(value));
    }

    @Test
    public void testFirstNonNullFirstNull(){
        String value = "bar";
        String returned = firstNonNull(null,value);
        assertThat(returned,is(value));
    }


    @Test
    public void testFirstNonNullSecondNull(){
        String value = "bar";
        String returned = firstNonNull(value,null);
        assertThat(returned,is(value));
    }

    @Test(expected = NullPointerException.class)
    public void testBothNull(){
        //Never do this
        firstNonNull(null,null);
    }


}
