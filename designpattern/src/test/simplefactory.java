package test;

interface IceCream{
    void taste();
}

class AppleIceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("apple");
    }
}

class BananaIceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("Banana");
    }
}

class PearIceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("Pear");
    }
}

class IceCreamFactory{
    public static IceCream createIceCream(String s){
        IceCream iceCream=null;
        switch(s){
            case "apple":iceCream=new AppleIceCream();break;
            case "banana":iceCream=new BananaIceCream();break;
            case "pear":iceCream=new PearIceCream();break;
            default:break;
        }
        return iceCream;
    }
}

public class simplefactory {
    public static void main(String[] args) {
        IceCream iceCream1 = IceCreamFactory.createIceCream("apple");
        iceCream1.taste();
        IceCream iceCream2 = IceCreamFactory.createIceCream("banana");
        iceCream2.taste();
        IceCream iceCream3 = IceCreamFactory.createIceCream("pear");
        iceCream3.taste();
    }
}
