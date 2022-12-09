package DZ5;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class AddDelNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов в списке: ");
        int size = input.nextInt();    
        LinkedList<Integer>linkedList = new LinkedList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int num = rnd.nextInt(101);
            linkedList.add(num);
        }
        System.out.println("Исходный список: " + linkedList);
        
        enqueue(linkedList);
        dequeue(linkedList);
        first(linkedList);
        System.out.println("Новый список: " + linkedList);
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList){
        System.out.print("Введите число для добавления в конец списка: ");
        Scanner num = new Scanner(System.in);
        int numb = num.nextInt();
        linkedList.addLast(numb);
        return linkedList;
    }
    public static void first(LinkedList<Integer> linkedList) {
        System.out.println(linkedList.get(0));
    }
    public static void dequeue(LinkedList<Integer> linkedList){
        System.out.println(linkedList.get(0));
        linkedList.removeFirst();
    }
}
    

