package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,String> fruitBowl = new HashMap<>();
        fruitBowl.put("Pear","Green");
        fruitBowl.put("Cherry","Red");
        fruitBowl.put("Banana","Yellow");
        fruitBowl.put("Apple","Yellow");
        fruitBowl.put("Kiwi","Grey");
        displayFruits(fruitBowl);
        findElement(fruitBowl, "Kiwi");
    }
    static void displayFruits(HashMap<String, String> fruitBowl){
        for(Map.Entry<String, String> fruit : fruitBowl.entrySet())
        System.out.println("Fruit: "+ fruit.getKey()
        +" - Color: "+ fruit.getValue());
    }
    static void findElement(HashMap<String, String> fruitBowl, String fruit){
        if(fruitBowl.containsKey(fruit)){
            System.out.println("The fruit "+ fruit
                    +" is of Color: "+ fruitBowl.get(fruit));
        }else{
            System.out.println("The bowl does not contain this fruit");
        }
    }
}
