package co.com.patterns.factorymethod;

public class ChickenIHamburgerImpl implements IHamburger {

    @Override
    public void prepare() {
        System.out.println("Preparing a chicken burger");
    }
}
