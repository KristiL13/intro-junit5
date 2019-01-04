package guru.springframework;

/**
 * Created by jt on 10/10/18.
 */
class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    String helloWorld(){
        return HELLO + " " + WORLD;
    }

    String helloWorld(String name){
        return HELLO + " " + name;
    }
}
