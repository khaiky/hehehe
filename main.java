

import java.util.Scanner;

public class main{

    
    

        public static void main(String[] args) {

        linkedlist list = new linkedlist();

     Scanner sc = new Scanner (System.in);
     
            // Adding elements to the list
            System.out.println("Enter 5 elements that you want to add: ");
            
            int item1 = sc.nextInt();
            int item2 = sc.nextInt();
             int item3 = sc.nextInt();
             int item4 = sc.nextInt();
              int item5 = sc.nextInt();
              
              
            list.add(item1);
            list.add(item2);
            list.add(item3);
            list.add(item4);
            list.add(item5);
            System.out.println("Current Linked List:");
            list.printList();
            
            //Delete
            System.out.println();
            System.out.println("Deleting 1 from the list...");
            System.out.println("Enter a node that you want to delete: ");
            int item6 = sc.nextInt();
            System.out.println("Current Linked List:");
            list.deleteByValue(20);
            list.printList();
            
            //Move/Swap Pointer
            System.out.println();
            System.out.println("Movingn/Swapping node from index 1 to index 0");
            System.out.println("Enter a node that you want to swap: ");
            int item7 = sc.nextInt();
            int item8 = sc.nextInt();
            list.moveNodePointer(item7, item8);
            list.printList();
        }
    }
        
        
    
    


