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
        assert money >= 0 : "儲存是負的!!你瘋了嗎?";
        this.balance += money;
        if(money >= 1000)
            this.bonus += 1;
    }

    public void charge(int money) throws InsufficientException{
        assert money >= 0 : "扣負數?是叫我儲值嗎?";
        checkBalance(money);
        this.balance -= money;

    }

    private void checkBalance(int money) throws InsufficientException{
        if(money > this.balance){
            throw new InsufficientException("存款不夠啦~", this.balance); 
        }
    }


    public int exchange(int bonus) throws InsufficientException{
        assert bonus >= 0 : "還想偷存點數啊!";
        checkBonus(bonus);
        this.bonus -= bonus;
        return this.bonus;
    }

    private void checkBonus(int bonus) throws InsufficientException{
        if(bonus > this.bonus){
            throw new InsufficientException("點數不夠啦!", this.bonus);
        }
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
