package chapter10;

/**
 * Created by God of Chris on 2016/11/22 0022.
 */
public class Queue {
    private int[] element;//store the value in queue
    private int size;//store the amount of queue's element
    //construct method with default capacity 8
    public Queue(){
        element = new int[8];
    }

    //method for entering the queue(push)
    public void enqueue(int value){
        if (size >= element.length) {
            int[] temp = new int[element.length * 2];
            System.arraycopy(element, 0, temp, 0, element.length);
            element = temp;
        }
        element[size++] = value;
    }

    //method for deleting the element and return this element
    public int dequeue() {
        int v = element[0];//store the bottom value

        // Shift all elements in the array left
        for (int i = 0; i < size - 1; i++) {
            element[i] = element[i + 1];
        }

        size--;

        return v;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }


    
}
