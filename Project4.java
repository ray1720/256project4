import java.util.*; 

public class Project4 {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    System.out.println("basic RPG character sheet");
    System.out.println("Do you want to be a fighter or a wizard?");
    if (user_input.nextLine().equals("fighter")) {
      Fighter sheet = new Fighter();
      sheet.statInput(); 
    } else if (user_input.nextLine().equals("wizard")) {
      Wizard sheet = new Wizard();
      sheet.statInput();     
    } else {
      System.out.println("bad input");
    }
    System.out.println("What do you want to name your file?");
    //makefile(user_input.nextLine());
    }

    
  }