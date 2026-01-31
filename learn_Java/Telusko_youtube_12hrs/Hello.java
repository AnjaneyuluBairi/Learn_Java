class OverloadingExample {
    // Same return type, different number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Status status[] = Status.values();
        System.err.println("Status: "+status[0]);
        System.out.print(status[0].name());
        int[] a=new int[4];
        System.err.println(a[2]);
        // OverloadingExample obj = new OverloadingExample();
        // System.out.println(obj.add(10, 20));       // Calls add(int, int)
        // System.out.println(obj.add(10, 20, 30));   // Calls add(int, int, int)
    }
}

enum Status{
    PENDING,APPROVED,REJECTED;
}
