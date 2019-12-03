import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;
import static org.junit.jupiter.api.Assertions.*;

class animalsTest {
    //animals pet = new animals();

    @Test
    void TestDogSound() {
        assertEquals("Barks", animals.sound());
    }

    @Test
    void TestDogEats() {
        assertEquals("Food", animals.eat());
    }

    @Test
    void TestCatSound() {
        assertEquals("Meows", animals.sound());
    }
    @Test
    void TestCatEats(){
        assertEquals("Food", animals.eat());


    }
}