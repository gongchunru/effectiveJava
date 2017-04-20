package guava.ch2.charmatcher;

import com.google.common.base.CharMatcher;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by gongchunru
 * Date：2017/4/14.
 * Time：14:42
 */
public class CharMatcherTest {
    @Test
    public void testRemoveLinebreaks(){
        String stringWithLineBreaks = "This is an example\n"+
                                        "of a String with linebreaks\n"+
                                        "we want on one line";
        String expected = "This is an example of a String with linebreaks we want on one line";
//        String scrubbed = CharMatcher.BREAKING_WHITESPACE.replaceFrom(stringWithLineBreaks,' ');
        String scrubbed = CharMatcher.breakingWhitespace().replaceFrom(stringWithLineBreaks,' ');
        assertThat(scrubbed,is(expected));
    }

    @Test
    public void testRemoveWhiteSpace(){
        String tabsAndsSpaces = "String with    spaces  and     tabs";
        String expected = "String with spaces and tabs";
//        String scrubbed = CharMatcher.WHITESPACE.collapseFrom(tabsAndsSpaces,' ');
        String scrubbed = CharMatcher.whitespace().collapseFrom(tabsAndsSpaces,' ');
        assertThat(scrubbed,is(expected));
    }



}
