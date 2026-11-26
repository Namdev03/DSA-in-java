package Encapsulation;
class BanckAccount{
     private double balance =  10000;
     public void getBalance(){
       System.out.println("your current balnce "+ balance);
    }
    public void deposite(double amount){
        if (amount>0) {
            balance+=amount;
            System.out.println("Amount deposited: " + amount);
        }
        else{
            System.out.println("Insaficiant balance");
        }
    }
    public void withdrow(double amount){
        if (amount>0 && amount<=balance) {
            balance -=amount;
            System.out.println("Amount withdraw succesfully: "+amount +" and your current balannce is "+ balance);
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BanckAccount bank = new  BanckAccount();
        bank.deposite(1000);
        bank.withdrow(5000);
         bank.getBalance();
    }

}
