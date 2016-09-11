package tafari.abijah.ZCWlivingroom;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by abijah on 9/11/16.
 */
public class setVolumeTest {


    @Test
    public void  setVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 10;
        television.setVolume(10);
        Integer actualValue= television.getVolume();

        assertEquals("The value should be 0", expectedValue,actualValue);
    }


}
