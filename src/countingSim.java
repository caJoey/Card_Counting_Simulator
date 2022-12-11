import java.util.*;
/*
Just simulates the counting of the cards, not the actual gameplay
 */
public class countingSim{
    public static void main(String[]args){
        bj(2);
    }
    public static void bj(int decks){
        String[] deck1 = new String[]{"A","A","A","A","K","K","K","K","Q","Q","Q","Q","J","J","J","J","10","10","10","10","9","9","9","9","8","8","8","8","7","7","7","7","6","6","6","6","5","5","5","5","4","4","4","4","3","3","3","3","2","2","2","2"};
        Stack<String> deck = new Stack<>();
        int count = 0;
        String broa;
        for(int i = 0; i < decks; i++){
            for(int j = 0; j < deck1.length; j++){
                deck.push(deck1[j]);
            }
        }
        Collections.shuffle(deck);
        for(double i = 0; i < deck1.length * decks; i++){
            broa = deck.pop();
            if(broa == "A" || broa == "K" || broa == "Q" || broa == "J"){
                count++;
            }
            else{
                if(Integer.parseInt(broa) <= 6){
                    count--;
                }
                else if(Integer.parseInt(broa) == 10){
                    count++;
                }
            }
            double remains = ((52 * decks) - i)/52;
            double remainsRound = Math.round(remains*10.0)/10.0;
            double simpy = count / remains;
            double round = Math.round(simpy*10.0)/10.0;
            double round1 = Math.round(simpy*1.0)/1.0;
            System.out.println("Card: " + broa + "    Count: " + count + "    True Count: " + round + "    True Count rounded: " + (int)round1 + "    Decks Remaining: " + remainsRound + "   Cards Remaining: " + (int)((deck1.length * decks) - i-1));
        }
    }
}
