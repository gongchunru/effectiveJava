package guava.ch2.charsets;

import com.google.common.base.Charsets;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by gongchunru
 * Date：2017/4/20.
 * Time：17:20
 */
public class CharsetsTest {

    @Test
    public void testCharsets(){
        byte[] bytes = null;

        try {
            bytes = "foobarbaz".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte[] bytes2 = "foobarbaz".getBytes(Charsets.UTF_8);
        assertThat(bytes,is(bytes2));

    }

}
