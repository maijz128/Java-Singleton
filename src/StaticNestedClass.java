public class StaticNestedClass implements MySingleton {

    public static class Holder{
        private static final StaticNestedClass instance = new StaticNestedClass();
    }

    public static final StaticNestedClass getInstance(){
        return Holder.instance;
    }

    private StaticNestedClass(){}



    @Override
    public void doSomething() {
        System.out.println("hello StaticNestedClass");
    }

}
