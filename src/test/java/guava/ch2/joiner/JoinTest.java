package guava.ch2.joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import java.util.Map;

/**
 * Created by gongchunru
 * Date：2017/4/13.
 * Time：17:11
 */
public class JoinTest {

    @Test
    public void testMapJoiner(){
        String expectedString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Map<String, String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington D.C","Redskins");
        testMap.put("New York City","Giants");
        testMap.put("Philadelphia","Eagles");
        testMap.put("Dallas","Cowboys");
        String returnedString = Joiner.on("#").withKeyValueSeparator("=").join(testMap);
        assertThat(returnedString, is(expectedString));
    }

    @Test
    public void testJoinStrings(){
        String[] values = new String[]{"foo", "bar", "baz"};
        String returned = Joiner.on("|").join(values);
        assertThat(returned,is("foo|bar|baz"));
    }




}
