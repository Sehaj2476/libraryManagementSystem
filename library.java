import java.util.*;
class Book{
    int id;
    String name;
    String author;
    boolean isIssued;
    Book(int id,String name,String author){
        this.id = id;
        this.name = name;
        this.author = author;
        this.isIssued = false;
    }
}

public class Library{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book [100];
        int count = 0;
        int choice;
        // Menu Driven
        do{
            System.out.println("--------Library Menu--------");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter the id of the book: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the name of the book: ");
                    String name = sc.nextLine();

                    System.out.println("Enter the author of the book: ");
                    String author = sc.nextLine();

                    books[count] = new Book(id, name, author);
                    count++;
                    System.out.println("Book added Successfully: ");
                    break;
                case 2:
                    for(int i=0;i<count;i++){
                    System.out.println();
                    System.out.println("ID: "+books[i].id);
                    System.out.println("Book Name: "+books[i].name);
                    System.out.println("Book Author: "+books[i].author);
                    System.out.println("Book Issued: "+books[i].isIssued);
                    System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice!=3);
        
        // System.out.println("3. Search Book");
        // System.out.println("4. Issue Book");
        // System.out.println("5. Return Book");
        // create 1st book manually
        // Display books
        

    }
}
