package arraylist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ItemManager list = new ItemManager();

        //Initializing variables
        String item1, item2, item3, newItem, finditem;
        int index;

        //to display items first
        list.displayItems();

        //User input
        System.out.println("Enter 3 items you want to add: ");
        item1 = sc.nextLine();
        item2 = sc.nextLine();
        item3 = sc.nextLine();

        //inputs will be added to the arraylist
        list.addItems(item1, item2, item3);
        System.out.println("-----------------------------");

    }

}
