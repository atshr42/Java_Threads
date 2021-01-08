/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg3.pkg3;

/**
 *
 * @author aashish
 */
class oneToTen extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception Caught");
            }
        }

    }
}

class elevenToTwenty extends Thread {

    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception Caught");
            }
        }

    }
}

public class ThreadPrinter {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new oneToTen();
        Thread t2 = new elevenToTwenty();       
        t1.start();
        t2.start();
    }

}
