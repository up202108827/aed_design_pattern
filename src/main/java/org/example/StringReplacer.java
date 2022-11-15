
package org.example;

public class StringReplacer implements StringTransformer{

    String str="";
    char old=' ';
    char n=' ';
    public StringReplacer(char old,char n){
        this.old=old;
        this.n=n;
    }
    @Override
    public void execute(StringDrink drink){
        str=drink.getText();
        str=str.replace(old,n);
        drink.setText(str);
    }
}
