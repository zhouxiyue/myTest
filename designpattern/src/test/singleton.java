package test;

public class singleton {
    private static singleton singleton = new singleton();
    private singleton(){}
    public static singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        singleton singleton1 = singleton.getInstance();
        singleton singleton2 = singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}

class singleton1{
    private singleton1(){}
    private static volatile singleton1 singleton1;
    public static singleton1 getInstance(){
        if(singleton1==null){
            synchronized (test.singleton1.class){
                if(singleton1==null){
                    singleton1=new singleton1();
                }
            }
        }
        return singleton1;
    }

    public static void main(String[] args) {
        singleton1 singleton1=test.singleton1.getInstance();
        singleton1 singleton2=test.singleton1.getInstance();
        System.out.println(singleton1==singleton2);

        for(int i=0;i<5;i++){
            new Thread(()->{
                singleton1 singleton=test.singleton1.getInstance();
                System.out.println(singleton);
            },"t"+i).start();
        }
    }
}
