package chapter10;

/**
 * Created by God of Chris on 2016/11/22 0022.
 */
public class testQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i <= 20; i++)
            queue.enqueue(i);

        while (!queue.empty())
            System.out.print(queue.dequeue() + " ");
    }
}

