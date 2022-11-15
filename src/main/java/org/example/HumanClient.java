package org.example;

public class HumanClient implements Client {
    StringDrink drink;
    StringRecipe recipe;
    StringBar bar;
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        this.drink=drink;
        this.recipe=recipe;
        this.bar=bar;
    }
    @Override
    public void happyHourStarted(Bar bar){
        bar.startHappyHour();
    }
    @Override
    public void happyHourEnded(Bar bar){
        bar.endHappyHour();
    }
}
