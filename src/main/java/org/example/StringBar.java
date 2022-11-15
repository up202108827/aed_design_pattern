package org.example;
public class StringBar extends Bar {
    boolean isHappyHour;
    public StringBar() {
        this.isHappyHour = false;
    }
    public void order(StringDrink drink,StringRecipe recipe){
        recipe.mix(drink);
    }

    public boolean isHappyHour() {

        return isHappyHour;
    }
    public void startHappyHour() {
        isHappyHour = true;
        notifyObservers();
    }
    public void endHappyHour() {
        isHappyHour = false;
        notifyObservers();
    }
}