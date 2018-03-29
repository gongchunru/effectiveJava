package test;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/29 17:56
 */
public class Bank {

    volatile static int money = 1000;

    public synchronized void Counter(int money){
        Bank.money -= money;
        System.out.println("A取走了" + money + "还剩下" + (Bank.money));
    }

    public synchronized  void ATM(int money){
        Bank.money -= money;
        System.out.println("B取走了" + money + "还剩下" + (Bank.money));
    }

}
