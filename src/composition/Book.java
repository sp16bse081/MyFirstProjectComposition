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
public class Book {
    private String bookname;
  //  private Author author;
    private double bookprice;
    private int bookqnt;
    private Author[]author;
    public Book(String bookname,Author[] author,double bookprice)
    {
        this.bookname=bookname;
        this.author=author;
        this.bookprice=bookprice;
    }
     public Book(String bookname,Author[] author,double bookprice,int bookqnt)
    {
        this.bookname=bookname;
        this.author=author;
        this.bookprice=bookprice;
        this.bookqnt=bookqnt;
    }
     public String getbookname()
     {
         return bookname;
     }
      public Author[] getauthor()
     {
         return author;
     }
       public double getbookprice()
     {
         return bookprice;
     }
        public int getbookqnt()
     {
         return bookqnt;
     }
        public void setbookprice(double bookprice)
        {
            this.bookprice=bookprice;
        }
        public void setbookqnt(int bookqnt)
        {
            this.bookqnt=bookqnt;
        }
        
         public String toString()
  {
      return"Book[Bookname=>"+bookname+"Author[name=>"+author.toString()+" Email=>"+author.toString()+"Gender=>"+author.toString()+"]\nBook price=>"+bookprice+"Book Quantity=>"+bookqnt+"]";
  }
}
