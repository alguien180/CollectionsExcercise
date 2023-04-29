package HashSet;

public class Coin {
    /*implementing Sets with a HashSet
     * Sets DO NOT CONTAIN DUPLICATES
     * They do not need a specific order
     * Useful when you need to know if an instance is already added to a collection*/
        private int denomination;
        public Coin (int denomination){
            this.denomination=denomination;
        }
        public int getDenomination(){
            return denomination;
        }
    }

