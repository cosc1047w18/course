package javaapplication2;

public class TestGenericStack {

    public static void main(String[] args) {
        GenericStack<Integer> genStack = new GenericStack<Integer>();

        // test size
        System.out.println("Size of the Stack  : " + genStack.getSize());

        // test isEmpty()
        System.out.println("Stack isEmpty      : " + genStack.isEmpty());

        System.out.println("*** Stack push operations ***");

        // test push
        genStack.push(new Integer(10));
        genStack.push(new Integer(20));
        genStack.push(new Integer(30));
        genStack.push(new Integer(15));
        genStack.push(new Integer(99));

        // test isEmpty()
        System.out.println("Stack isEmpty      : " + genStack.isEmpty());

        // test peek
        System.out.println("Top of the Stack   : " + genStack.peek());

        // test size
        System.out.println("Size of the Stack  : " + genStack.getSize());

        // test pop
        System.out.println("Pop from the Stack : " + genStack.pop());

        // test peek
        System.out.println("Top of the Stack   : " + genStack.peek());

        // test size
        System.out.println("Size of the Stack  : " + genStack.getSize());
    }

}
