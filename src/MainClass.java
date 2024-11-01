cdimport org.junit.Test;

public class MainClass {
    public int getLocalNumber() {
        return 14;
    }
private int class_number = 20;
public int getClassNumber(){
    return class_number;
}
 private String class_string = "Hello, world";
    public String getClassString() {
        String classString = class_string;
        return classString;

    }
}

// MainClass mainClass = new MainClass();для использования методов не из родительского класса
//  MainClass это тип переменной , mainClass имя , new MainClass имя класса для того чтобы создать обьект класса , он находитс в переменной mainClass
// без this обращаемся к локальным переменным функции теста , если this то к полям класса те к переменным которые находяться вне метода
// параметры функции publick int vver(int number) функция имеет входной параметр типа int c названием number
//publick static void статическое поле  используем для хранения
//super ключевое слово для выполенения теста сначала в классе родителя потом в наследовательном классе