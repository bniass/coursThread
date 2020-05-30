package main;

public class Thread1 {
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i < 10){
                    System.out.println("hello");
                    i++;
                    try {
                        Thread.sleep(5000);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int j = 0;
                while(j < 10){
                    System.out.println("bye");
                    j++;
                    try {
                        Thread.sleep(5000);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();
        System.out.println("finish");
    }
}
