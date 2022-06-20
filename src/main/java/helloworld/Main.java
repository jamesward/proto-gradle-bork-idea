package helloworld;

public class Main {

    public static void main(String[] args) {
        HelloWorld.Hello hello = HelloWorld.Hello.newBuilder().setMessage("hello, world").build();
        System.out.println(hello);
    }

}