public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    CashCard(String number, int balance, int bonus){
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public void store(int money){
        if(money > 0){
            this.balance += money;
            if(money >= 1000)
                this.bonus += 1;
        }
        else{
            System.out.println("儲值是負的，你瘋了嗎?");
        }
    }

    public void charge(int money){
        if(money > 0){
            if(money <= this.balance)
                this.balance -= money;
            else
                System.out.println("窮鬼沒錢了啦!");
        }
        else{
            System.out.println("你是要我儲值嗎? 好耶!賺到了~");
        }
    }

    public int exchange(int bonus){
        if(bonus > 0)
            this.bonus -= bonus;
        return this.bonus;
    }

    public int getBalance(){
        return balance;
    }
    
    public int getBonus(){
        return bonus;
    }

    public String getNumber(){
        return number;
    }
}