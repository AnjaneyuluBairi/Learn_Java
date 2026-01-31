
class Test {

    public static void main(String[] args) {

        Runnable obj11=()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("He");
                try {
                    Thread.sleep(5);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        };
        Runnable obj21=()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("she");
                try {
                    Thread.sleep(5);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        };
        Thread t1 = new Thread(obj11);  
        Thread t2 = new Thread(obj21);
        t1.start();
        t2.start();
        System.err.println("||||");
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

class A extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

}

class B extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(5);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
