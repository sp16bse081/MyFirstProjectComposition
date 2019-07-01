/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author sp16-bse-081
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Author auth=new Author("Abdul Jalil","Abduljalilayubi311@gmail.com",'M');
        System.out.println(auth);
        /*
        Book dummyBook = new Book("Java for dummy", auth, 19.95, 99); 
        System.out.println(dummyBook);
        dummyBook.setbookprice(29.45);
dummyBook.setbookqnt(28);
System.out.println("name is: " + dummyBook.getbookname());
System.out.println("price is: " + dummyBook.getbookprice());
System.out.println("qty is: " + dummyBook.getbookqnt());
System.out.println("Author is: " + dummyBook.getauthor()); 
// Author's toString()
System.out.println("Author's name is: " + dummyBook.getauthor().toString());
System.out.println("Author's email is: " + dummyBook.getauthor().toString());
*/
Author[] authors = new Author[2];
authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance


Book anotherBook = new Book("more Java",authors, 29.95);
System.out.println(anotherBook); // toString()

    }
    
}
