package test;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/29 17:59
 */
public class PersonB extends Thread {

    Bank bank;

    public PersonB(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money >= 100){
            bank.ATM(200);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        Bank bank = new Bank();
        PersonA a = new PersonA(bank);
        PersonB b = new PersonB(bank);
        a.start();
        b.start();
    }
}
