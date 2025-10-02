package co.com.patterns.factorymethod;

public class App {
    public static void main(String[] args) {
        Restaurant restaurant = new BeefRestaurant();
        restaurant.orderHamburger();

        Restaurant chickenRestaurant = new ChickenRestaurant();
        chickenRestaurant.orderHamburger();
    }
}
