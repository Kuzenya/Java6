package task2;


public class Order {
    private final String mainDish;
    private final String sideDish;
    private final String drink;
    private final String dessert;

    Order(String mainDish, String sideDish, String drink, String dessert) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    @Override
    public String toString() {
        return "Заказ:\n"
                + "  Основное блюдо: " + display(mainDish) + "\n"
                + "  Гарнир: " + display(sideDish) + "\n"
                + "  Напиток: " + display(drink) + "\n"
                + "  Десерт: " + display(dessert);
    }

    private String display(String value) {
        return value == null ? "не выбран" : value;
    }
}
