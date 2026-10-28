package task2;


public class Main {
    public static void main(String[] args) {
        Order fullOrder = new OrderBuilder()
                .setMainDish("Стейк")
                .setSideDish("Картофель по-деревенски")
                .setDrink("Морс")
                .setDessert("Чизкейк")
                .build();

        Order lightOrder = new OrderBuilder()
                .setMainDish("Овощная паста")
                .setDrink("Вода")
                .build();

        System.out.println("Первый заказ:");
        System.out.println(fullOrder);

        System.out.println("\nВторой заказ:");
        System.out.println(lightOrder);
    }
}
