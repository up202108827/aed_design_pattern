package org.example;

public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink){
        StringBuilder rev= new StringBuilder(drink.getText());
        rev=rev.reverse();
        drink.setText(rev.toString());
    }

}
