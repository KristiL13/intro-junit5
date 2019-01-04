package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("In BeforeAll - I am only called once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach");
        greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        String control = "Hello World";
        String result = greeting.helloWorld();
        assertEquals(control, result, "helloWorld() returns wrong String");
        System.out.println(result);
    }

    @Test
    void testHelloWorldWithName() {
        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void testHelloWorldWithAnotherName() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach...");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("In AfterAll *** - I am only called once");
    }
}