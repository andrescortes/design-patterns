package co.com.patterns.factorymethod;

public class BeefRestaurant extends Restaurant {
    @Override
    IHamburger createHamburger() {
        return new BeefIHamburgerImpl();
    }
}
