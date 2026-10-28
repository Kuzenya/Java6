package task1;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackOnQueue {
    private final Queue<Integer> firstQueue = new LinkedList<>();
    private final Queue<Integer> secondQueue = new LinkedList<>();

    public void push(int x) {
        while (!firstQueue.isEmpty()) {
            secondQueue.add(firstQueue.poll());
        }

        firstQueue.add(x);

        while (!secondQueue.isEmpty()) {
            firstQueue.add(secondQueue.poll());
        }
    }

    public int pop() {
        Integer value = firstQueue.poll();
        if (value == null) {
            throw new NoSuchElementException("Стек пуст");
        }
        return value;
    }

    public int top() {
        Integer value = firstQueue.peek();
        if (value == null) {
            throw new NoSuchElementException("Стек пуст");
        }
        return value;
    }

    public boolean empty() {
        return firstQueue.isEmpty();
    }

    @Override
    public String toString() {
        if (firstQueue.isEmpty()) {
            return "Стек пуст";
        }

        StringBuilder result = new StringBuilder("Стек (с вершины): [");
        int count = firstQueue.size();

        for (int i = 0; i < count; i++) {
            int value = firstQueue.poll();
            if (i > 0) {
                result.append(", ");
            }
            result.append(value);
            firstQueue.add(value);
        }

        result.append(']');
        return result.toString();
    }
}
