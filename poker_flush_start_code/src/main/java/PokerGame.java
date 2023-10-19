public class PokerGame {

    public PokerGame(){

    }

    public boolean checkIfFlush(String[] cards){
//        write code here
        char initalSuit = cards[0].charAt(cards[0].length() - 1);

        for (int i = 1; i<cards.length;i++){
            if (cards[i].charAt(cards[i].length() - 1) != initalSuit){
                return false;
            }
        }

        return true;
    }

}
