public class cbHelloWorld {
     public String sayHello() {
        return "Hello world -CI/CD !";
    }
    public static void main(String[] args) {
        cbHelloWorld helloWorldObject = new cbHelloWorld();
        System.out.println(helloWorldObject.sayHello());
    }
}
