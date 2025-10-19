package org.saaras;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
            //SingletonThreadSafeLazy obj=SingletonThreadSafeLazy.getInstance();
        //}

        //SingletonThreadSafeLazy obj=SingletonThreadSafeLazy.getInstance();
        //SingletonThreadSafeLazy obj1=SingletonThreadSafeLazy.getInstance();

        //GFG_RightAngle obj1=new GFG_RightAngle(8);
        //obj1.printResult();

        // Lambda expression
        /*
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("apple");
        list.add("aaaa");
        list.add("zzzzzzz");

        ChatGPTLamda obj=new ChatGPTLamda(list);
        obj.sortedList();
        obj.printList();
        */

        //String reverse class
        /*StringReverse obj=new StringReverse();
        obj.reverseString("AMANDIP");
        obj.printString();
         */


        List<Employee> obj=new ArrayList<>();
        obj.add(new Employee(1, "Aman", 22));
        obj.add(new Employee(2, "Varan", 25));
        obj.add(new Employee(3, "Akshay", 30));
        obj.add(new Employee(4, "Amaneee", 1237));
        obj.add(new Employee(5, "Amanwww", 12365));
        obj.add(new Employee(6, "Amansss", 123990));
        obj.add(new Employee(7, "Amandfd", 123776));

        // Declared priority queue.
        PriorityQueue<Employee> queue=new PriorityQueue<>((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        // Insert element into queue
        for(Employee emp:obj){
            queue.offer(emp);
            if(queue.size() > 3){
                queue.poll();
            }
        }

        // Print
        for(Employee emp:queue){
            System.out.println((emp));
        }

    }
}