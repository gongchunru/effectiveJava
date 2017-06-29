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

    @Test(expected = IllegalArgumentException.class)
    public void testAddInvalidValue(){
        PreconditionExample example = new PreconditionExample("testing");
        example.updateCurrentIndexValue(0,99);
        assertThat(example.getValues()[0],is(99));

        example.updateCurrentIndexValue(0,1000);
        fail("Should not get here");
    }

    @Test(expected = IllegalStateException.class)
    public void testAttemptOperation(){
        PreconditionExample example = new PreconditionExample("open");
        example.updateCurrentIndexValue(0,10);
        example.doOperation();
        example.updateCurrentIndexValue(0,1);
        example.doOperation();
        fail("Should not get here");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdateInvalidIndex(){
        PreconditionExample example = new PreconditionExample("testing");

        example.updateCurrentIndexValue(4,99);
        assertThat(example.getValues()[4],is(99));

        example.updateCurrentIndexValue(25,10);
        fail("should not get here");


    }

}
