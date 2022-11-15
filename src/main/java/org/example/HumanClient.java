package org.example;

public class HumanClient implements Client {


        OrderingStrategy clientType;

     public HumanClient(OrderingStrategy strategy) {
            clientType = strategy;
        }

   /*  public HumanClient() {
         clientType = new ImpatientStrategy();
     }
 */
        public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
            clientType.wants(drink, recipe, bar);
        }

        @Override

        public void happyHourStarted(Bar bar) {

            clientType.happyHourStarted((StringBar) bar);
        }

        @Override

        public void happyHourEnded(Bar bar) {
            clientType.happyHourEnded((StringBar) bar);
        }
}
