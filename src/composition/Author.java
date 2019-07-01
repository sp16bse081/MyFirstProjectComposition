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
public class Author {
    private String Authorname;
    private String Authoremail;
    private char Authorgender;
    
  public Author(String Authorname, String Authoremail,char Authorgender)
    {
        this.Authorname=Authorname;
        this.Authoremail=Authoremail;
        this.Authorgender=Authorgender;
    }
  public String getName()
  {
      return Authorname;
  }
  public String getEmail()
  {
      return Authoremail;
  }
  public char getGender()
  {
      return Authorgender;
  }
  public void setEmail(String Authoremail)
  {
      this.Authoremail=Authoremail;
  }
  public String toString()
  {
      return"Author[Name=>"+Authorname+" Email=>"+Authoremail+"Gender=>"+Authorgender+"]";
  }
}          
