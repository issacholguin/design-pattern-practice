package designpatterns.strategy;

/**
 * Created by issacholguin1 on 9/25/18.
 */
public abstract class Grill {
    public Grill() {}

    PropaneType propaneType;
    BurnerType burnerType;

    public void setBurnerType(BurnerType burnerType) {
        this.burnerType = burnerType;
    }

    public void setPropaneType(PropaneType propaneType) {
        this.propaneType = propaneType;
    }

    public void showPropaneType() { propaneType.showPropane(); }
    public void showBurnerType() { burnerType.showBurner(); }

    abstract void display();

}

