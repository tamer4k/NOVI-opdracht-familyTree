package nl.family;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int result = method1(10,10);
        System.out.println(result);
    }

    public static int method1(int x, int y){
        int result = x + y;
        return result;
    }
}