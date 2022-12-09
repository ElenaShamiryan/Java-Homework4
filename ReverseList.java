package DZ5;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов в списке: ");
        int size = input.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int num = rnd.nextInt(101);
            linkedList.add(num);
        }
        System.out.println("Исходный список: " + linkedList);
        linkedList2(linkedList);
        System.out.print("Перевернутый список:" + linkedList);
    }

    public static LinkedList<Integer> linkedList2(LinkedList<Integer> linkedList) {
        int count = 0;
        for (int i = linkedList.size() - 1; i >= linkedList.size() / 2; i--) {
            int n = linkedList.get(count);
            int m = linkedList.get(i);
            linkedList.set(i, n);
            linkedList.set(count, m);
            count++;
        }
        return linkedList;
    }
}
    

