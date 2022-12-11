import java.util.*;
import java.io.*;
/*
 author Joey Capps
 version 18
 since 18
 */
public class playingSim {
    public static String[] deck1 = new String[]{"A","A","A","A","K","K","K","K","Q","Q","Q","Q","J","J","J","J","10","10","10","10","9","9","9","9","8","8","8","8","7","7","7","7","6","6","6","6","5","5","5","5","4","4","4","4","3","3","3","3","2","2","2","2"};
    public static Stack<String> deck = new Stack<>();
    public static ArrayList<String> tempPlayer = new ArrayList<>();
    public static ArrayList<String> tempDealer = new ArrayList<>();
    public static int dealerCount = 0;
    public static int playerCount = 0;
    public static double balance = 5000; //represents player's bankroll
    public static int roundCount = 0;
    public static int count = 0;
    public static int hidden = 0;
    public static int betSize = 0;
    public static int aceCount = 0;
    public static int aceCountDealer = 0;
    public static boolean aceDouble = false;
    public static int timer = 0;
    /*These four 2D matrices correspond directly with "basic strategy" AKA what you are supposed to do in different blackjack situations such as hit, stand, double down, etc. (see the Basic_Strategy.webp file in the main folder of repository)*/
    /*22-1010*/public static String[][] splitRange = {{"n","n","y","y","y","y","n","n","n","n",},{"n","n","y","y","y","y","n","n","n","n",},{"n","n","n","n","n","n","n","n","n","n",},{"n","n","n","n","n","n","n","n","n","n",},{"n","y","y","y","y","n","n","n","n","n",},{"y","y","y","y","y","y","n","n","n","n",},{"y","y","y","y","y","y","y","y","y","y",},{"y","y","y","y","y","n","y","y","n","n",},{"n","n","n","n","n","n","n","n","n","n",}};
    /*A2-A9*/public static String[][] softRange= {{"h","h","h","d","d","h","h","h","h","h",},{"h","h","h","d","d","h","h","h","h","h",},{"h","h","d","d","d","h","h","h","h","h",},{"h","h","d","d","d","h","h","h","h","h",},{"h","d","d","d","d","h","h","h","h","h",},{"d","d","d","d","d","s","s","h","h","h",},{"s","s","s","s","d","s","s","s","s","s",},{"s","s","s","s","s","s","s","s","s","s",}};
    /*A2-A9*/public static String[][] softRangeSplit= {{"h","h","h","h","h","h","h","h","h","h",},{"h","h","h","h","h","h","h","h","h","h",},{"h","h","h","h","h","h","h","h","h","h",},{"h","h","h","h","h","h","h","h","h","h",},{"h","h","h","h","h","h","h","h","h","h",},{"s","s","s","s","s","s","s","h","h","h",},{"s","s","s","s","s","s","s","s","s","s",},{"s","s","s","s","s","s","s","s","s","s",}};
    /*9-16*/public static String[][] hardRange = {{"h","d","d","d","d","h","h","h","h","h"},{"d","d","d","d","d","d","d","d","h","h",},{"d","d","d","d","d","d","d","d","d","d",},{"h","h","s","s","s","h","h","h","h","h"},{"s","s","s","s","s","h","h","h","h","h"},{"s","s","s","s","s","h","h","h","h","h"},{"s","s","s","s","s","h","h","h","h","h"},{"s","s","s","s","s","h","h","h","h","h"}};
    public static void main(String[]args){
        restart();
        System.out.println("------------------------");
        System.out.println("hands played: " + roundCount);
        System.out.println("------------------------");
    }
    public static void restart(){//new shuffle, clears everything
        timer++;
        //timer limit can be changed, this example does 12 shoes, which I found comes out to about 100 hands played
        //100 hands is important because that's a decent amount of hands per 1 hour that a card counter will look for at a table
        //therefore, when the program terminates and the final bankroll amount is printed, it represents a simulation of 1 hour of play
        //max I've been able to do is 120, or 10 hour sample, before there is an error
        if(timer == 12){
            //every time the file is run, it copies the final bankroll size from whatever sample size you have and pastes it into "testing.txt" which can inputted into an array in "average.java"
            try{
                FileWriter nob = new FileWriter("testing.txt", true);
                String s = String.valueOf(balance);
                nob.write(s + ", ");
                nob.close();
                System.out.println("---------------------");
                System.out.println("success " + s);
            }
            catch (IOException e){
            }
        }
        //timer represents how many shoes we want to play
        while(timer < 12){
            System.out.println("restart!");
            deck.clear();
            playerCount = 0;
            dealerCount = 0;
            count = 0;
            //starting bet size in a spread, this example is $5, but can be whatever
            betSize = 5;
            aceCount = 0;
            aceCountDealer = 0;
            aceDouble = false;
            //the "i < 2" represents that this is a double-deck game, if there were 6 decks, it would be 6
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < deck1.length; j++){
                    deck.push(deck1[j]);
                }
            }
            Collections.shuffle(deck);
            round();
        }
    }
    //new round
    public static void round(){
        System.out.println("--------------------------");
        System.out.println("balance: " + balance);
        checken();
        System.out.println("running " + count);
        System.out.println("true " + truer());
        System.out.println("bet size " + betSize);
        System.out.println("remaining cards: " + deck.size());
        //this if statement represents a shuffle. in the double-deck game simulated, the shuffle happens when half the deck is remaining, so since there are 128 cards, 52 would be half of that
        //the second statement "shuffles" when the true count is greater or equal to 3. This represents the player leaving the table in a double-deck game and waiting for the next shuffle to happen
        if(deck.size() < 52 || truer() >= 3){
            restart();
        }
        else{
            roundCount++;
            tempPlayer.clear();
            tempDealer.clear();
            playerCount = 0;
            dealerCount = 0;
            hidden = 0;
            aceCount = 0;
            aceCountDealer = 0;
            aceDouble = false;
            boolean insurance = false;

            String tempSplit = deck.pop();//player first card
            tempPlayer.add(tempSplit);
            playerCount += deCeauder(tempSplit);
            counta(playerCount);
            if(playerCount == 11){
                aceCount++;
            }
            String tempSplit10 = deck.pop();
            hidden = deCeauder(tempSplit10);//dealer hidden card
            counta(hidden);
            if(hidden == 11){
                aceCountDealer++;
            }

            String tempSplit1 = deck.pop();//player second card
            tempPlayer.add(tempSplit1);
            int temp = deCeauder(tempSplit1);
            counta(temp);
            if(temp == 11){
                aceCount++;
            }
            playerCount += temp;

            String tempSplit2 = deck.pop();
            dealerCount += deCeauder(tempSplit2);//dealers shown card
            tempDealer.add(tempSplit2);
            tempDealer.add(tempSplit10);
            System.out.println("player count: " + playerCount);
            System.out.println("dealer upcard: " + dealerCount);
            if(dealerCount == 11){
                aceCountDealer++;
            }
            counta(dealerCount);
            if(dealerCount == 11 && truer() <= -3){
                insurance = true;
            }

            if(playerCount == 21 && dealerCount + hidden != 21){//checks for bj
                if(insurance == true){
                    System.out.println("even money");
                    balance += betSize;
                }
                else{
                    balance += (betSize + (betSize / 2.0));
                }
                printEm();
                round();
            }
            else if(playerCount == 21 && dealerCount + hidden == 21){
                if(insurance == true){
                    System.out.println("even money");
                    balance += betSize;
                }
                printEm();
                System.out.println("player + dealer bj");
                round();
            }
            else if(playerCount != 21 && dealerCount + hidden == 21){
                if(insurance == false){
                    balance -= betSize;
                }
                else{
                    System.out.println("insurance activated W");
                }
                printEm();
                System.out.println("dealer bj");
                round();
            }
            else if(tempSplit == tempSplit1){
                if(insurance == true){
                    System.out.println("insurance activated L");
                    balance -= betSize / 2;
                }
                split(deCeauder(tempSplit));
            }
            else if(tempSplit == "A" || tempSplit1 == "A"){
                if(insurance == true){
                    System.out.println("insurance activated L");
                    balance -= betSize / 2;
                }
                soft();
            }
            else{
                if(insurance == true){
                    System.out.println("insurance activated L");
                    balance -= betSize / 2;
                }
                hard();
            }
        }
    }
    public static int deCeauder(String s){//takes string and returns number value of card
        if(s == "K" || s == "Q" || s == "J"){
            return 10;
        }
        else if(s == "A"){
            return 11;
        }
        else{
            return Integer.parseInt(s);
        }
    }
    public static void counta(int ooga){//takes int adds or subtracts from count, or does nothing
        if(ooga >= 10){
            count++;
        }
        else if(ooga <= 6){
            count--;
        }
    }
    public static double truer(){//calculates true count given running
        double remains = deck.size() / 52.0;
        double broa = count / remains;
        return Math.round(broa*10.0)/10.0;
    }
    public static void hard(){
        int temp;
        if(playerCount >= 17){//✓
            stand();
        }
        else if(playerCount <= 8){
            temp = hit();
            if(temp == 11){
                soft();
            }
            else{
                hard();
            }
        }
        else{
            String spot = hardRange[playerCount - 9][dealerCount - 2];
            if(dealerCount == 10 && playerCount == 16 && truer() < 0){
                System.out.println("16 VS 10");
                spot = "s";
            }
            if(spot == "d" && tempPlayer.size() == 2){
                System.out.println("double!");
                betSize *= 2;
                hit();
                if(playerCount == 22){
                    playerCount = 12;
                }
                stand();
            }
            else if(spot == "h" || spot == "d"){
                temp = hit();
                if(temp == 11){
                    soft();
                }
                else if(playerCount > 21){
                    printEm();
                    balance -= betSize;
                    round();
                }
                else{
                    hard();
                }
            }
            else{
                stand();
            }
        }
    }
    public static void soft(){//player has an ace as one or more of their cards
        int tempCount = 0;
        for(int i = 0; i < aceCount + 1; i++){
            if(playerCount - (10 * i) > tempCount && playerCount - (10 * i) <= 21){
                System.out.println("possible ace total: " + (playerCount - (10 * i)));
                tempCount = playerCount - (10 * i);
            }
        }
        System.out.println("kept ace total: " + tempCount);
        if(tempCount == 0){
            System.out.println("busted with ace");
            printEm();
            balance -= betSize;
            round();
        }
        else if(aceDouble == false){
            int strip = playerCount - (aceCount * 11);
            System.out.println("strip: " + strip);
            if(strip > 8 || strip < 2){
                System.out.println("strip too high, old player count: " + playerCount);
                playerCount = tempCount;
                System.out.println("new player count: " + playerCount);
                hard();
            }
            else{
                System.out.println("strip not too high");
                String spot = softRange[strip - 2][dealerCount - 2];
                if(spot == "d" && tempPlayer.size() == 2){
                    System.out.println("doubling ace");
                    aceDouble = true;
                    betSize *= 2;
                    hit();
                    soft();
                }
                else if(spot == "h" || spot == "d" && strip <= 6){
                    System.out.println("hitting soft " + playerCount);
                    hit();
                    soft();
                }
                else{
                    playerCount = tempCount;
                    stand();
                }
            }
        }
        else{
            playerCount = tempCount;
            stand();
        }
    }
    public static void split(int card){//player is splitting
        System.out.println("splitting " + card);
        aceCount = 0;
        int temp1 = 0;
        int temp2 = 0;
        if(card == 11){
            temp1 = hitSplit(card);
            if(temp1 == 22){
                temp1 = 12;
            }
            temp2 = hitSplit(card);
            if(temp2 == 22){
                temp2 = 12;
            }
            standSplit(temp1, temp2);
        }
        else if(splitRange[card - 2][dealerCount - 2] == "y"){
            System.out.println("yh we split em");
            temp1 = dewSplit(card);
            temp2 = dewSplit(card);
            standSplit(temp1, temp2);
        }
        else{
            System.out.println("we dont split em, hard");
            hard();
        }
    }
    public static void standSplit(int first, int second){
        System.out.println("Player Stands (split)");
        int combine = dealerCount + hidden;
        System.out.println("dealer combined total (split): " + combine);
        if(aceCountDealer > 0){
            combine = dealerSoftSplit();
        }
        if(combine >= 17){
            if(first <= 21 && first > combine || first <= 21 && combine > 21){
                System.out.println("first wins with " + first);
                balance += betSize;
            }
            else if(first > 21 || first < combine){
                System.out.println("first loses with " + first);
                balance -= betSize;
            }
            if(second <= 21 && second > combine || second <= 21 && combine > 21){
                System.out.println("second wins with " + second);
                balance += betSize;
            }
            else if(second > 21 || second < combine){
                System.out.println("second loses with " + second);
                balance -= betSize;
            }
        }
        else{
            hitDealer();
            standSplit(first,second);
        }
        printEm();
        round();
    }
    public static int dealerSoftSplit(){
        System.out.println("dealer soft split");
        int tempCount = 0;
        int combine = dealerCount + hidden;
        for(int i = 0; i < aceCountDealer + 1; i++){
            if(combine - (10 * i) > tempCount && combine - (10 * i) <= 21){
                System.out.println("possible ace total (dealer) (split): " + (combine - (10 * i)));
                tempCount = combine - (10 * i);
            }
        }
        System.out.println("kept ace total (dealer) (soft): " + tempCount);
        if(tempCount == 0){
            aceCountDealer = 0;
            return 22;
        }
        else if(tempCount >= 18){
            System.out.println("dealer stands with (split) " + tempCount);
            aceCountDealer = 0;
            return tempCount;
        }
        else if(tempCount <= 16){
            hitDealer();
            return dealerSoftSplit();
        }
        else{
            if(combine - (10 * aceCountDealer) == 7){
                hitDealer();
                return dealerSoftSplit();
            }
            else{
                return 17;
            }
        }
    }
    public static int dewSplit(int card){
        int temp;
        if(card >= 17){
            return card;
        }
        else if(card <= 8){
            temp = hitSplit(0);
            card += temp;
            if(temp == 11){
                return dewSoftSplit(card, 1);
            }
            else{
                return dewSplit(card);
            }
        }
        else{
            String spot = hardRange[card - 9][dealerCount - 2];
            if(spot == "h" || spot == "d"){
                temp = hitSplit(0);
                card += temp;
                if(temp == 11){
                    return dewSoftSplit(card, 1);
                }
                else{
                    return dewSplit(card);
                }
            }
            else{
                return card;
            }
        }
    }
    public static int dewSoftSplit(int card, int aceNum){
        int tempCount = 0;
        for(int i = 0; i < aceNum + 1; i++){
            if(card - (10 * i) > tempCount && card - (10 * i) <= 21){
                System.out.println("possible ace total (split): " + (card - (10 * i)));
                tempCount = card - (10 * i);
            }
        }
        System.out.println("kept ace total: " + tempCount);
        if(tempCount == 0){
            return card;
        }
        else{
            int strip = card - (aceNum * 11);
            System.out.println("strip: " + strip);
            if(strip > 8){
                System.out.println("strip too high, old player count (split): " + card);
                card = tempCount;
                System.out.println("new player count: " + card);
                return dewSplit(card);
            }
            else{
                System.out.println("strip not too high (split)");
                String spot = softRangeSplit[strip - 2][dealerCount - 2];
                if(spot == "h"){
                    System.out.println("hitting soft " + card);
                    int temp = hitSplit(0);
                    card += temp;
                    if(temp == 11){
                        return dewSoftSplit(card, aceNum + 1);
                    }
                    else{
                        return dewSoftSplit(card, aceNum);
                    }
                }
                else{
                    return tempCount;
                }
            }
        }
    }
    //this is the bet spread, it is a 1-16, with the betSizes representing the changing bet size. This can be edited to a different spread with different amounts
    public static void checken(){
        if(truer() >= -1){
            betSize = 5;
        }
        else if(truer() >= -2.49){
            betSize = 20;
        }
        else if(truer() >= -3.49){
            betSize = 40;
        }
        else{
            betSize = 80;
        }
    }
    public static void stand(){
        System.out.println("Player Stands");
        int combine = dealerCount + hidden;
        System.out.println("dealer combined total: " + combine);
        if(aceCountDealer > 0){
            dealerSoft();
        }
        else if(combine >= 17){
            if(playerCount > combine || combine > 21){
                balance += betSize;
            }
            else if(playerCount < combine){
                balance -= betSize;
            }
            printEm();
            round();
        }
        else{
            hitDealer();
            stand();
        }
    }
    public static void dealerSoft(){
        System.out.println("dealer soft");
        int tempCount = 0;
        int combine = dealerCount + hidden;
        for(int i = 0; i < aceCountDealer + 1; i++){
            if(combine - (10 * i) > tempCount && combine - (10 * i) <= 21){
                System.out.println("possible ace total (dealer): " + (combine - (10 * i)));
                tempCount = combine - (10 * i);
            }
        }
        System.out.println("kept ace total (dealer): " + tempCount);
        if(tempCount == 0){
            System.out.println("dealer busted with ace");
            printEm();
            balance += betSize;
            round();
        }
        else if(tempCount >= 18){
            System.out.println("dealer stands with " + tempCount);
            hidden = 0;
            dealerCount = tempCount;
            aceCountDealer = 0;
            stand();
        }
        else if(tempCount <= 16){
            hitDealer();
            dealerSoft();
        }
        else{//dealer has 17
            if(combine - (10 * aceCountDealer) == 7){
                hitDealer();
                dealerSoft();
            }
            else{
                hidden = 0;
                dealerCount = 17;
                aceCountDealer = 0;
                stand();
            }
        }
    }
    public static int hit(){
        String temp = deck.pop();
        tempPlayer.add(temp);
        int hitter = deCeauder(temp);
        if(hitter == 11){
            aceCount++;
        }
        playerCount += hitter;
        System.out.println("player hits: " + playerCount);
        counta(hitter);
        return hitter;
    }
    public static int hitDealer(){
        String temp = deck.pop();
        tempDealer.add(temp);
        int hitter = deCeauder(temp);
        if(hitter == 11){
            aceCountDealer++;
        }
        dealerCount += hitter;
        System.out.println("dealer hits: " + (dealerCount + hidden));
        counta(hitter);
        return hitter;
    }
    public static int hitSplit(int hitted){
        String temp = deck.pop();
        System.out.println("hit split " + temp);
        tempPlayer.add(temp);
        int hitter = deCeauder(temp);
        hitted += hitter;
        counta(hitter);
        return hitted;
    }
    public static void printEm(){
        System.out.println("players cards: " + tempPlayer);
        System.out.println("dealers cards: " + tempDealer);
    }
}