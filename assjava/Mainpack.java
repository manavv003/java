import org.gvp.dcs.ds.Stack;
import org.gvp.dcs.ds.Queue;
import org.gvp.dcs.shapes.Sphere;
import org.gvp.dcs.shapes.Cube;

public class Mainpack {
    public static void main(String[] args) {
        System.out.println("Demonstrating Stack:");
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("\nDemonstrating Queue:");
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Dequeued element: " + queue.dequeue());
        queue.display();

        System.out.println("\nDemonstrating Sphere:");
        Sphere sphere = new Sphere(5);
        sphere.display();

        System.out.println("\nDemonstrating Cube:");
        Cube cube = new Cube(4);
        cube.display();
    }
}
