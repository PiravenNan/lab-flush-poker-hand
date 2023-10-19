public class PokerGame {

    public PokerGame(){

    }

    public boolean checkIfFlush(String[] cards){
//        write code here
        char initalSuit = cards[0].charAt(cards[0].length() - 1);

        for (String card : cards){
            if (card.charAt(card.length() - 1) != initalSuit){
                return false;
            }
        }

        return true;
    }

}
