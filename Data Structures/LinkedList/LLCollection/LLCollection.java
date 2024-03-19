package LLCollection;
import java.util.*;

class LLCollection {

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(20);
        list.addLast(30);
        System.out.println(list);

        list.addFirst(10);
        list.addLast(40);
        System.out.println(list);

        System.out.println(list.size());

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.addFirst(10);
        list.addLast(40);
        System.out.println(list);

        list.remove(0); //Index as argument
        System.out.println(list);


        // Print
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " => ");
        }
        System.out.println("NULL");
    }
}