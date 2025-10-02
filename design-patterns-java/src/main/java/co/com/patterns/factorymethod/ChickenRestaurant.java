package co.com.patterns.factorymethod;

public class ChickenRestaurant extends Restaurant {

    @Override
    IHamburger createHamburger() {
        return new ChickenIHamburgerImpl();
    }
}
