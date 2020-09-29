public class CheckRunnable {

    public static void main(String[] args) {

        System.out.println("Creating runnable");
//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Executing run...");
//            }
//        };

        Runnable runnable=()->{
            System.out.println("Executing run...");
        };
        Thread t=new Thread(runnable);
        t.start();
    }
}
