package HashSet;

import java.util.HashSet;
//HashSet excercise Driver
public class CoinTestDriver {
    public static void main(String[] args) {
        Coin coin=new Coin(2);
        Coin coin2=new Coin(1);
        Coin coin5=new Coin(5);
        Coin coin10=new Coin(10);
        Coin coin20=new Coin(20);
        Coin coin6=new Coin(30);
        Coin coin7=new Coin(50);
        Coin coin8=new Coin(100);
        HashSet<Coin> bagOfCoins = new HashSet<>();
        bagOfCoins.add(coin);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin6);
        bagOfCoins.add(coin7);
        bagOfCoins.add(coin10);

        findCoin(bagOfCoins,coin8);
        findCoin(bagOfCoins,coin2);
        displayBagContents(bagOfCoins);
        bagOfCoins.clear();
        displayBagContents(bagOfCoins);
    }

    public static void findCoin(HashSet<Coin> bagOfCoins, Coin coin){
        if (bagOfCoins.contains(coin))
            System.out.println("There is a coin "+coin.getDenomination()+ " in the bag");
        else
            System.out.println("There is no coin "+coin.getDenomination()+" in the bag");
    }
    public static void displayBagContents(HashSet<Coin> bagOfCoins){
        if(bagOfCoins.isEmpty()){
            System.out.println("\nThere are no coins in the bag");
        }
        for (Coin i: bagOfCoins)
            System.out.println("There is a " + i.getDenomination()+ " coin");
        System.out.println("There are "+bagOfCoins.size() + " coins in total");
    }
    }


