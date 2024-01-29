package dialogGraphicaInterface;

public class Girl extends Human { //Наследуем переменные и методы из класса Human
    //Конструктор класса вызывается с использованием ключевого слова super
    public Girl(double w, double h, String name) {
        super(w, h, name);
    }

    // Да
    public String yes() {
        return (name + ": " + "Yes!");
    }
    // Нет
    public String no() {
        return (name + ": " + "No! ");
    }

    //Вывод приветствия
    @Override
    public String hello() {
        return (name + ": " + "Hello!");
    }
}