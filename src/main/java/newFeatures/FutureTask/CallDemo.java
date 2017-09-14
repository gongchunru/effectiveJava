package newFeatures.FutureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by gongchunru
 * Date：2017/7/21.
 * Time：15:46
 */
public class CallDemo {
    public static void main(String[] args) {

        //创建FutureTask ，
        System.out.println("创建FutureTask ，");
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Task());
        System.out.println("创建Thread ，");
        Thread thread = new Thread(futureTask);
        thread.setName("Task thread");
        System.out.println("Thread  start");
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread [" + Thread.currentThread().getName() + "] is running");

        if (!futureTask.isDone()){
            System.out.println("Task is not done");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int result = 0;
        try {
            // 5. 调用get()方法获取任务结果,如果任务没有执行完成则阻塞等待
            result = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("result is " + result);

    }


    static class Task implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            System.out.println("Thread ["+Thread.currentThread().getName()+"] is running");
            int result = 0;
            for (int i = 0; i < 100; i++) {
                result += 1;
            }
            Thread.sleep(3000);
            return result;
        }
    }
}




