package co.com.patterns.factorymethod;

public abstract class Restaurant {
    abstract IHamburger createHamburger();

    void orderHamburger() {
        IHamburger burger = this.createHamburger();
        burger.prepare();
    }
}
