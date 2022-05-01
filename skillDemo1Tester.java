import static org.junit.Assert.*;
import org.junit.*;
// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar skillDemo1Tester.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore skillDemo1Tester

public class skillDemo1Tester {
    @Test
    public void maxIntTest(){
        int[] arr = {1,4,6,0};
        int maxInt= skillDemo1.maxInt(arr);
        assertEquals(0, maxInt);

    }
}

