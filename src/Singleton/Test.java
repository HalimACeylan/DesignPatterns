package Singleton;

public class Test {

    public static void main(String[] args) {
        (new MyThread()).start();
        (new Thread(new MyRunnable())).start();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        if(s1 == s2){
            System.out.println("Objects are same");
        }else{
            System.out.println("Objects are different");
        }

    }

    static class MyThread extends Thread{
        @Override
        public void run(){
            Singleton s1 = Singleton.getInstance();
            //
        }
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run(){
            Singleton s1 = Singleton.getInstance();
            //
        }
    }
}
