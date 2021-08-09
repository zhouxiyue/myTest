package test;

class bigAppleiceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("bigAppleiceCream");
    }
}

class smallAppleiceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("smallAppleiceCream");
    }
}

class bigBananaiceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("bigBananaiceCream");
    }
}

class smallBananaiceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("smallBananaiceCream");
    }
}

class bigPeariceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("bigPeariceCream");
    }
}

class smallPeariceCream implements IceCream{
    @Override
    public void taste() {
        System.out.println("smallPeariceCream");
    }
}

interface IceCreamFactory3{
    public IceCream createBig();
    public IceCream createSmall();
}

class appleIceCreamFactory3 implements IceCreamFactory3{
    @Override
    public IceCream createBig() {
        return new bigAppleiceCream();
    }

    @Override
    public IceCream createSmall() {
        return new smallAppleiceCream();
    }
}

class bananaIceCreamFactory3 implements IceCreamFactory3{
    @Override
    public IceCream createBig() {
        return new bigBananaiceCream();
    }

    @Override
    public IceCream createSmall() {
        return new smallBananaiceCream();
    }
}

class pearIceCreamFactory3 implements IceCreamFactory3{
    @Override
    public IceCream createBig() {
        return new bigPeariceCream();
    }

    @Override
    public IceCream createSmall() {
        return new smallPeariceCream();
    }
}

public class abstractfactory {
    public static void main(String[] args) {
        IceCreamFactory3 iceCreamFactory1 = new appleIceCreamFactory3();
        IceCream iceCream1 = iceCreamFactory1.createBig();
        iceCream1.taste();
        IceCreamFactory3 iceCreamFactory2 = new appleIceCreamFactory3();
        IceCream iceCream2 = iceCreamFactory2.createSmall();
        iceCream2.taste();
        IceCreamFactory3 iceCreamFactory3 = new bananaIceCreamFactory3();
        IceCream iceCream3 = iceCreamFactory3.createBig();
        iceCream3.taste();
        IceCreamFactory3 iceCreamFactory4 = new bananaIceCreamFactory3();
        IceCream iceCream4 = iceCreamFactory4.createSmall();
        iceCream4.taste();
        IceCreamFactory3 iceCreamFactory5 = new pearIceCreamFactory3();
        IceCream iceCream5 = iceCreamFactory5.createBig();
        iceCream5.taste();
        IceCreamFactory3 iceCreamFactory6 = new pearIceCreamFactory3();
        IceCream iceCream6 = iceCreamFactory6.createSmall();
        iceCream6.taste();
    }
}
