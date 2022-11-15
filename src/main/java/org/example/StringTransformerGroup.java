package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer>transformer;
    public StringTransformerGroup(List<StringTransformer> transformer){
        this.transformer=transformer;
    }
    public void execute(StringDrink drink){
        for(int i=0;i<transformer.size();i++){
            transformer.get(i).execute(drink);
        }
    }
}
