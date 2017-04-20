package guava.ch2.ascii;

import com.google.common.base.CaseFormat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by gongchunru
 * Date：2017/4/14.
 * Time：10:28
 */
public class CaseFormatTest {

    @Test
    public void testToLowerCamelCaseFromLowerHyphen(){
        assertThat(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL,"foo-bar"),is("fooBar"));
    }

    @Test
    public void testToUpperCamelCaseFromLowerUnderScore(){
        assertThat(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL,"foo_bar"),is("FooBar"));
    }

    @Test
    public void testToUpperUnderScoreFromLowerCamelCase(){
        assertThat(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE,"fooBar"),is("FOO_BAR"));
    }
}
