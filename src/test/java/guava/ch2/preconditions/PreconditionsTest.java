package guava.ch2.preconditions;

import org.junit.Test;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static com.google.common.base.Preconditions.*;

/**
 * Created by gongchunru
 * Date：2017/4/20.
 * Time：17:46
 */
public class PreconditionsTest {

    @Test(expected = NullPointerException.class)
    public void testNotNull(){
        checkNotNull(null,"Message null");
    }

    @Test
    public void testNotNullValid(){
        String value = "foo";
        String returned = checkNotNull(value,"Message null");
        assertThat(returned,is(value));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithAsserts(){
        new PreconditionExample(null);
    }
}
