class Book{
    int id;
    String name;
    String author;
    boolean isIssuesd;

}

public class library{
    public static void main(String[] args) {
        Book[] books = new Book [100];
        int count = 0;

        // create 1st book manually
        books[count] = new Book();
        books[count].id = 1;
        books[count].name = "Data Structure & System Design with Java";
        books[count].author = "Dr. Neha Verma and Dr. Dheeraj Malhotra";
        books[count].isIssuesd = false;

        count++;

        // Display books
        for(int i=0;i<count;i++){
            System.out.println();
            System.out.println("ID: "+books[i].id);
            System.out.println("Book Name: "+books[i].name);
            System.out.println("Book Author: "+books[i].author);
            System.out.println("Book Issued: "+books[i].isIssuesd);
            System.out.println();
        }

    }
}