package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            System.out.println("(a)dd, (g)et, (d)elete, (p)rint, (q)uit");
            String input = scanner.nextLine();

            switch (input.charAt(0)) {
                case 'a':
                    System.out.println("Enter a number to add:");
                    int dataToAdd = scanner.nextInt();
                    scanner.nextLine();
                    binarySearchTree.add(dataToAdd);
                    System.out.println("Added element");
                    break;
                case 'd':
                    System.out.println("Enter an index to delete:");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine();
                    binarySearchTree.delete(indexToDelete);
                    System.out.println("Deleted element");
                    break;
                case 'g':
                    System.out.println("Enter an index to get:");
                    int indexToGet = scanner.nextInt();
                    scanner.nextLine();
                    int gotElement = binarySearchTree.get(indexToGet);
                    System.out.println("Element:");
                    System.out.println(gotElement);
                    break;
                case 'p':
                    System.out.println("Linked list:");
                    binarySearchTree.print();
                    break;
                case 'q':
                    System.out.println("Quitting");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
