public class Main{
    public static void main(String[] args) {
        SingletonJava s = SingletonJava.getSingletonVariable();
        System.out.println(s);
        SingletonJava s2 = SingletonJava.getSingletonVariable();
        System.out.println(s2.equals(s));
    }
}