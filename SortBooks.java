import java.util.Scanner;

public class SortBooks {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       Book[] books = new Book[2];
       Book[] sortedBooks = new Book[2];
       for (int i = 0; i < books.length; i++) {
           books[i] = new Book();
           sortedBooks[i] = new Book();  
}

       for (int i = 0; i < books.length; i++) {
           books[i].id = sc.nextInt();
           books[i].title = sc.next();
           books[i].author = sc.next();
           books[i].price = sc.nextDouble();
       }
       sortedBooks = sortBooksByPrice(books);
       for (int i = 0; i < sortedBooks.length; i++) {
    System.out.println(sortedBooks[i].id+" "+sortedBooks[i].author+" "+sortedBooks[i].title+" "+sortedBooks[i].price);
    
}

   }

   public static Book[] sortBooksByPrice(Book[] books) {
       int len = books.length;
       
       for (int i = 0; i < len; i++) {
           for (int j = 0; j < len - i - 1; j++) {
               if (books[j].price > books[j + 1].price) {
                   Book tempBook = books[j+1];
                   books[j + 1] = books[j];
                   books[j] = tempBook;                
            }
            
        }
        
       }

       return books;
    
   }
}

class Book {
    int id;
    String title, author;
    double price;

}