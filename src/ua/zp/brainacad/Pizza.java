package ua.zp.brainacad;

public class Pizza {
    public Circle basis;
    public String composition;
    public String name;
    int cost;

    @Override
    public String toString() {
        return "Пицца " + name + ". " +
                "Размер пиццы: " + basis + "." +
                " Состав: " + composition + "." +
                " Цена: " + cost + " грн. " + "\n";
    }

    public Pizza(double radius, String composition, String name, int cost) {
        this.basis = new Circle(radius * 2);
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        Circle diameter = new Circle(2);




 /**
  @author Илья Горипавловский
  @version v1.0
  @return метод возвращает размер пиццы, состав, название и цену
 */
    }
}

