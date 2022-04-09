package data_structures;

import java.util.Scanner;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {
        String name = "Marwa";
        String [] names = new String[5];

        String name2 = "Marz";

        readFromConsole(name);

        readFromConsole(name2);


//        names = new String[]{"Marwa", "Marzuk", "Mas", "Sam", "Emon", "Mikaela", "Sam's GF"};
//        int age = 30;
//        boolean isValid = true;

//        System.out.println("Enter new name here: ");
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();

//        System.out.println("Enter new age here: ");
//        int a = in.nextInt();

//        name = s;

        System.out.println(names[6]);
    }

    public static void readFromConsole(String name){
        System.out.println("Enter new name here: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        name =s;
    }

}
