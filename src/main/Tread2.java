package main;

public class Tread2 {
    public static void main(String[] args)
    {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("salut");
            }
        });
        t.start();

        Runnable r = ()->{
            System.out.println("salut");
        };
        Thread t2 = new Thread(r);
        t2.start();


    }

}
