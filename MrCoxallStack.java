/*
 * This program pushes and prints a stack.
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2021-12-12
 */

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class contains the contents of a stack.
 *
 * @param <T> generic type class
 * */
public class MrCoxallStack<T> {

    /**
     * ArrayList signifying a stack.
     * */
    private ArrayList<T> stackAsArray = new ArrayList<T>();

    /**
     * Pushes the input into the stack.
     *
     * @param pushElement element to push
     * */
    public void push(final T pushElement) {
        this.stackAsArray.add(0, pushElement);
    }

    /**
     * Removes the top element in the stack.
     *
     * @return the removed element
     * @throws EmptyStackException if the stack is empty
     * */
    public T pop() {
        if (stackAsArray.size() == 0) {
            throw new EmptyStackException();
        } else {
            return this.stackAsArray.remove(0);
        }
    }

    /** Prints out the stack. */
    public void showStack() {
        this.stackAsArray.forEach(System.out::println);
    }
}

