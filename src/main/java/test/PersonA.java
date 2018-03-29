package test;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/29 17:59
 */
public class PersonA extends Thread {

    Bank bank;

    public PersonA(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money >= 100){
            bank.Counter(100);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
