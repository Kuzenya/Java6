package task1;

public class StackOnQueueTest {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(10);
        stack.push(20);

        System.out.println("Вершина стека без удаления: " + stack.top());
        System.out.println("Вершина стека с удалением: " + stack.pop());
        System.out.println("Стек пуст? " + stack.empty());
        System.out.println("Все элементы: " + stack);

        System.out.println("Следующий элемент: " + stack.pop());
        System.out.println("Стек пуст после удаления всех элементов? " + stack.empty());
        System.out.println("Содержимое: " + stack);
    }
}
