package designpatterns.strategy;

/**
 * Created by issacholguin1 on 9/25/18.
 */
public class KenmoreGrill extends Grill {
    public KenmoreGrill () {
        setPropaneType(new GallonPropane());
    }

    public void display() {
        System.out.println("I am a Kenmore grill!");
    }

}
