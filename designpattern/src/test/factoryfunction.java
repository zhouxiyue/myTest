package test;

interface IceCreamFactory2{
    public IceCream create();
}

class appleIceCreamFactory implements IceCreamFactory2{
    @Override
    public IceCream create() {
        return new AppleIceCream();
    }
}

class bananaIceCreamFactory implements IceCreamFactory2{
    @Override
    public IceCream create() {
        return new BananaIceCream();
    }
}

class pearIceCreamFactory implements IceCreamFactory2{
    @Override
    public IceCream create() {
        return new PearIceCream();
    }
}

public class factoryfunction {
    public static void main(String[] args) {
        IceCreamFactory2 IceCreamFactory1 = new appleIceCreamFactory();
        IceCream iceCream1 = IceCreamFactory1.create();
        iceCream1.taste();
        IceCreamFactory2 IceCreamFactory2 = new bananaIceCreamFactory();
        IceCream iceCream2 = IceCreamFactory2.create();
        iceCream2.taste();
        IceCreamFactory2 IceCreamFactory3 = new pearIceCreamFactory();
        IceCream iceCream3 = IceCreamFactory3.create();
        iceCream3.taste();
    }
}
