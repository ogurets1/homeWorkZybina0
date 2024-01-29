package dialogGraphicaInterface;

public class Human {
    public double w = 0; // Bec (weight)
    public double h = 0; // Рост (height)
    public String name = "";

    // Конструктор
    public Human(double w, double h, String name) {
        this.w = w;
        this.h = h;
        this.name = name;
    }

    //Вывод приветствия
    public String hello() {
        return (name + " : " + "Hi!");
    }

    /**
     * Вывод приветствия с указанием имени собеседника
     *
     * @param namePerson
     * @return
     */
    public String hello(String namePerson) {
        return (name + " : " + "Hi, " + namePerson + "!");
    }
}