package Constructer;

public class User {
    String user_name;
    String password;
    //-----------------Default Constructor---------
    User(){
        user_name= "root";
        password = "kasde";

    }
   // ------------------Parameterized Constructor------------
      User (String user_name, String password){
          //this(); Default Constructor
          //this(); Parameterized constructor
          this.user_name = user_name;
          this.password = password;
          /*
             -> "this" keyword represents current object;
             -> we can call following using 'this'
                        * Instance variables.
                        * Instance methods
                        * Constructors

           */

      }
    User (String user_name){

        this.user_name = user_name;
        this.password = password;

    }
    // -----------having two or more than two constructor in the same class is known as "Constructor Overloading"--

    void printUser(){
        System.out.println("UserName : " +user_name);
        System.out.println("Password : " +password);

    }

    public static void main(String[] args) {
        User u = new User("ram","2eqd");

        u.printUser();


    }
}
