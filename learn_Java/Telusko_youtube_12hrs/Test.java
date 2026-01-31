

import java.util.Scanner;


@FunctionalInterface
interface A{
    void show();
}


class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        A obj = new A(){
            @Override
            public void show(){
                System.out.println("Hello");
            }
        };
        obj.show();
    }
}


