package tafari.abijah.ZCWlivingroom;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by abijah on 9/11/16.
 */
public class TelevisionTest {

    @Test
    public void  getVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 1;
        Integer actualValue= television.getVolume();

        assertEquals("The value should be 0", expectedValue,actualValue);
    }


}
