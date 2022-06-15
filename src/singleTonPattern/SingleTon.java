package singleTonPattern;

public class SingleTon {
    private static SingleTon singleTon=new SingleTon();

    private SingleTon() {};

    public static SingleTon getSingleTon() {
        return singleTon;
    }
    public void Message(){
        System.out.println("Hello World! \n");
    }
}
