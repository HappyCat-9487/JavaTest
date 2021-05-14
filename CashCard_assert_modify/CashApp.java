import java.util.Scanner;

public class CashApp {
    public static void main(String[] args){
        CashCard[] cards = {
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1),
        };

        try(Scanner console = new Scanner(System.in)){
            for(CashCard card : cards){
            System.out.printf("為 (%s %d %d) 儲值：", card.getNumber(), card.getBalance(), card.getBonus());
            card.store(console.nextInt());
            System.out.printf("invoice  (%s %d %d)%n",card.getNumber() , card.getBalance() ,card.getBonus());
            }
        }
        
    }
}