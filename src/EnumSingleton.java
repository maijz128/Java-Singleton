public enum EnumSingleton implements MySingleton{

    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("hello world!");
        }
    };

    public static MySingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }
}
