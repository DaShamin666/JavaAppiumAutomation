import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MainClassTest extends MainClass {

    @Test
    public void Proverka() {
        int a = 10;
        if (a > getLocalNumber()) {
            System.out.println("Возвращает 10");
        } else {
            System.out.println("Возвращает 14");
        }
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int number = mainClass.getClassNumber();
        assertTrue("Метод getClassNumber должен возвращать число больше 45", number > 45);
    }

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String result = mainClass.getClassString();
        assertTrue("testGetClassString содержит одно из слов",result.contains("hello") || result.contains("Hello"));

    }
}
