package tafari.abijah.ZCWlivingroom;

/**
 * Created by abijah on 9/11/16.
 */
public class Television {

    private Integer volume;

    private Integer channel;

    public Television(){
        volume = 1;
        channel = 0;
    }
    public Integer getVolume(){
        return volume;

    }

    public void setVolume(Integer amount){

        volume= amount;
    }
}
