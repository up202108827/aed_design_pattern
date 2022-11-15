package org.example;

import java.util.List;

public class StringRecipe {

    List<StringTransformer>transformer;
    public StringRecipe(List<StringTransformer> transformer){
        this.transformer=transformer;
    }

    public void mix(StringDrink drink){
        for(int i=0;i<transformer.size();i++){
            transformer.get(i).execute(drink);
        }
    }
}
