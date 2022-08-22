
abstract class X {
    public X() {
        System.out.println("One");
    }

    abstract void abstractMethod();
}

class Y extends X {
    public Y() {
        System.out.println("Two");
    }

    @Override
    void abstractMethod() {
        System.out.println("Three");
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        X x = new Y();
        x.abstractMethod();
        throw new Exception();

    }
}
