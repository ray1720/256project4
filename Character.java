import java.util.*; 
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter;
public class Character {
  int strength;
  int dexterity;
  int constitution;
  int wisdom;
  int intelligence;
  int charisma;


  public int getStr() {
    return strength;
  }
  public void setStr(int newStr) {
    this.strength = newStr;
  }


  public int getDex() {
    return dexterity;
  }
  public void setDex(int newDex) {
    this.dexterity = newDex;
  }


  public int getCon() {
    return constitution;
  }
  public void setCon(int newCon) {
    this.constitution = newCon;
  }


  public int getWis() {
    return wisdom;
  }
  public void setWis(int newWis) {
    this.wisdom = newWis;
  }


  public int getInt() {
    return intelligence;
  }
  public void setInt(int newInt) {
    this.intelligence = newInt;
  }


  public int getCha() {
    return charisma;
  }
  public void setCha(int newCha) {
    this.charisma = newCha;
  }

  static int mod(int ability) {
    int x = (int) Math.floor((ability - 10)/2);
    return x;
  }

  public void statInput(){
    Scanner user_input = new Scanner(System.in);
    System.out.println("input Strength");
    setStr(user_input.nextInt());
    System.out.println("input dexterity");
    setDex(user_input.nextInt());
    System.out.println("input constitution");
    setCon(user_input.nextInt());
    System.out.println("input wisdom");
    setWis(user_input.nextInt());
    System.out.println("input intelligence");
    setInt(user_input.nextInt());
    System.out.println("input charisma");
    setCha(user_input.nextInt());
  }

   public void makeFile(String filename) {
    try {
      File myObj = new File(filename + ".txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
        
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
