class PizzaDelivery {
    // ...
    int getRating() {

        return numbeOfLateDeliveries > 5 ? 2 : 1;
    }
}