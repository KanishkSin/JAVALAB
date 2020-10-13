import java.util.*;
import java.io.*;

class club
{
  public void club_create()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("<<<<Create a new club>>>>\n");
    System.out.println("Enter the name of the Club\n");
    String club = sc.nextLine();
    System.out.println("Enter the name of the Club President\n");
    String club_pres = sc.nextLine();
    System.out.println("Enter the name of the Club Manager\n");
    String club_man = sc.nextLine();
    String[] players = new String[16];
    System.out.println("Enter the name of the players\n");//After adding players, how should i add or remove players by user input?
    for(int i = 0; i < players.length; i++)
    {
      players[i] = sc.nextLine();
    }
  }
}
class modify_club extends club
{
  public void remove_player()
  {
    System.out.println("Enter the name of the player you want to remove: ");
    String rem = sc.nextLine();
    for (int i = 0; i < players.length; i++)
    {
        String temp = players[i];
      	 if (rem.equals(temp))
         {
           isExists = true;
      	   break;
         }
    }
  }
}
class football_club_man 
{
  public static void menu_op1()
  {
    System.out.println("MENU\n"+"1.Create a new club\n"+"2.Modify an existing club\n"+"3.Exit\n"+"Enter your choice:");
  }
  public static void menu1()
  {

    int ch1 = sc.nextInt();
    switch(ch)
    {
      case 1 : club_create();
                break;
      case 2 : menu_op2();
                break;
      case 3 : return;

      default : System.out.println("Invalid Choice!");
    }
  }
  public static void menu_op2()
  {
    System.out.println("<<<<Modify an existing club>>>>\n"+"1.Change the Club President\n"+"2.Change the Club Manager"+"3.Add a player\n"+"4.Remove a player\n"+"5.Exit\n"+"Enter your choice: ");
  }
  public static void menu2()
  {
    Scanner sc = new Scanner(System.in);
    int ch2 = sc.nextInt();
    switch(ch)
    {
      case 1 : remove_player();
                break;
      //case 2 : ();
                //break;
      //case 3 : ();
                //break;
      //case 4 : return;

      default : System.out.println("Invalid Choice!");
    }
  }
  public static void main(String[] args)
  {
    menu_op1();
  }
}
