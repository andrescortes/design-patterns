package co.com.patterns.factorymethod;

public class BeefIHamburgerImpl implements IHamburger {

    @Override
    public void prepare() {
        System.out.println("Preparing a beef burger");
    }
}
