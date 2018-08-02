public class Main {

    public static void main(String[] args) {
        MySingleton singleton = EnumSingleton.getInstance();
        singleton.doSomething();

        StaticNestedClass.getInstance().doSomething();
    }
}
