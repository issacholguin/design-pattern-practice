package designpatterns.strategy;

public class Main {

    public static void main(String[] args) {
        KenmoreGrill kGrill = new KenmoreGrill();

        kGrill.display();
        kGrill.showPropaneType();
        kGrill.setPropaneType(new PintPropane());
        System.out.println("- - - - - After Changes at Runtime - - - - - -");
        kGrill.showPropaneType();
    }


}
