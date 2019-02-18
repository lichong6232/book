package concurrent;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author: lichong04
 * @Date: Created in 下午2:19 2019/2/18
 */
public class ConcurrentLinkedQueueTest {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        Thread thread1 = new Thread(new AddTask("task1",queue));
        Thread thread2= new Thread(new removeTask("task2",queue));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("finished");
    }

    static class removeTask implements Runnable{

        ConcurrentLinkedQueue<String> queue;
        String name;

        public removeTask(String name, ConcurrentLinkedQueue<String> queue){
            this.queue = queue;
            this.name = name;
        }

        @Override
        public void run() {
            for (int i=0;i<1000;i++){

                if (i>100){
                    queue.poll();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
    }

    static class AddTask implements Runnable{

        ConcurrentLinkedQueue<String> queue;
        String name;

        public AddTask(String name, ConcurrentLinkedQueue<String> queue){
            this.queue = queue;
            this.name = name;
        }

        @Override
        public void run() {
            for (int i=0;i<1000;i++){
                queue.offer(this.name +":"+i);
                if (i>100){
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        }
    }
}
