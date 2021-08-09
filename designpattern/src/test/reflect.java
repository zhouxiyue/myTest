package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class testtest{
    int a;
    public testtest(){}
    public testtest(int a){
        this.a=a;
    }
    public void fun1(){
        System.out.println("fun1");
    }

    public void fun2(int i){
        System.out.println("fun2 "+i);
    }
    public int fun3(){
        System.out.println("fun3");
        return 1;
    }
    public void fun4(){
        System.out.println(a);
    }
}

public class reflect {
    public static void main(String[] args) {
        try {
            Class testclass = Class.forName("test.testtest");
            testtest test = (testtest) testclass.newInstance();
            test.fun1();
            Class testclass1 = Class.forName("test.testtest");
            testtest test1 = (testtest)testclass1.getConstructor(int.class).newInstance(2);
            Method method = test1.getClass().getMethod("fun4");
            method.invoke(test1);
            test1.fun4();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
