import java.util.*;
import java.io.*;
import java.lang.*;

class club
{
  String clubn;
  String pres;
  String man;
  ArrayList<String> players = new ArrayList<String>();
  ArrayList<club> o;
  club()
  {
    this.clubn = "";
    this.pres = "";
    this.man = "";
    o = new ArrayList<>();
  }
  public void display()
  {
    for (int i = 0; i < o.size(); i++)
    {
      System.out.println((i + 1) + ". " + "Club name: " + o.get(i).clubn);
      System.out.println("President: " + o.get(i).pres);
      System.out.println("Manager: " + o.get(i).man);
      System.out.println("Players: ");
      //for(int j = 0; j < players.length; j++)
      //{
        System.out.println(o.get(i).players);
      //}
    }
  }
  public void display_p(String name)
  {
    for (int i = 0; i < o.size(); i++)
    {
      club ne = o.get(i);
      if ((ne.pres).equalsIgnoreCase(name))
      {
        System.out.println((i + 1) + ". " + "Club name: " + o.get(i).clubn);
        System.out.println("President: " + o.get(i).pres);
        System.out.println("Manager: " + o.get(i).man);
        System.out.println("Players: ");
        System.out.println(o.get(i).players);
      }
    }
  }
}
class modify extends club implements intrfce
{
  Scanner sc = new Scanner(System.in);
  public void add_club()
  {
    try
    {
      club obj = new club();
      System.out.println("<<<<Create a new club>>>>\n");
      System.out.println("Enter the name of the Club\n");
      obj.clubn = sc.nextLine();
      System.out.println("Enter the name of the Club President\n");
      obj.pres = sc.nextLine();
      System.out.println("Enter the name of the Club Manager\n");
      obj.man = sc.nextLine();
      System.out.println("Enter the name of the players\n");
      for(int i = 0; i < 11; i++)
      {
        obj.players.add(sc.nextLine());
      }
      o.add(obj);
    }
    catch (Exception e)
    {
			e.printStackTrace();
		}
  }
  public void remove_club()
  {
    try{
      String rem;
      System.out.println("Enter club name :");
      rem = sc.nextLine();
      for (int i = 0; i < o.size(); i++)
      {
        club del = o.get(i);
        if ((del.clubn).equalsIgnoreCase(rem))
        {
          o.remove(i);
        }
      }
    }
    catch (Exception e)
    {
			e.printStackTrace();
		}
  }
  public void add_player(String name)
  {
    try
    {
      for (int i = 0; i < o.size(); i++)
      {
        club ne_w = o.get(i);
        if ((ne_w.pres).equalsIgnoreCase(name))
        {
          System.out.println("Enter player to add :");
          String r = sc.nextLine();
          o.get(i).players.add(r);
        }
      }
    }
    catch (Exception e)
    {
			e.printStackTrace();
		}
  }
  public void remove_player(String name)
  {
    try
    {
      for (int i = 0; i < o.size(); i++)
      {
        club del = o.get(i);
        if ((del.pres).equalsIgnoreCase(name))
        {
          System.out.println("Enter player to remove :");
          String r = sc.nextLine();
          for (int j = 0; j < del.players.size(); j++)
          {
            if((del.players.get(j)).equalsIgnoreCase(r))
            {
              o.get(i).players.remove(j);
            }
          }
        }
      }
    }
    catch (Exception e)
    {
			e.printStackTrace();
		}
  }
  public void change_man(String name)
  {
    try
    {
      for (int i = 0; i < o.size(); i++)
      {
        club ne_w = o.get(i);
        if ((ne_w.pres).equalsIgnoreCase(name))
        {
          System.out.println("Enter new Manager :");
          String r = sc.nextLine();
          o.get(i).man = r;
        }
      }
    }
    catch (Exception e)
    {
			e.printStackTrace();
		}
  }
  public void admin_login() throws InvalidException
  {

    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer("777");
    String password = sb.toString();
    System.out.println("Enter Username: ");
    String username = sc.nextLine();
    System.out.println("Enter Password: ");
    String pass = sc.nextLine();
    if(username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase(password))
    {
      System.out.println("Access Granted! Welcome " + username +"! \n");
      while (true)
      {
        System.out.println("\n");
        System.out.println("MENU");
        System.out.println("1.Display Club Status");
        System.out.println("2.Add a club");
        System.out.println("3.Remove a club");
        System.out.println("4.Logout\n");
        int ch1 = sc.nextInt();
        switch(ch1)
        {
          case 1:display();
                  break;
          case 2:System.out.println("\nEnter the number of  teams to add:");
                 int n = sc.nextInt();
                 for (int i = 0; i < n; i++)
                 {
                   add_club();
                 }
                  break;
          case 3:remove_club();
                  break;
          case 4:return;
        }//throw new InvalidException("Not a valid choice!");
      }
    }
    else
    {
      System.out.println("Invalid Credentials!");
    }
  }
  public void pres_login() throws InvalidException
  {

    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer("777");
    String password = sb.toString();
    System.out.println("\nEnter Username of President: ");
    String username = sc.nextLine();
    System.out.println("\nEnter Password of President: ");
    String pass = sc.nextLine();
    int count = 0;
    for (int i = 0; i < o.size(); i++ )
    {
      if(username.equalsIgnoreCase(o.get(i).pres) && pass.equalsIgnoreCase(password))
      {
        count = 1;
        System.out.println("Access Granted! Welcome " + username +"! \n");
        while (true)
        {
          System.out.println("\n");
          System.out.println("MENU");
          System.out.println("1.Display Club Status");
          System.out.println("2.Change Club Manager");
          System.out.println("3.Add a player to the club");
          System.out.println("4.Remove a player from the club");
          System.out.println("5.Logout \n");
          int ch1 = sc.nextInt();
          switch(ch1)
          {
            case 1:display_p(o.get(i).pres);
                    break;
            case 2:change_man(o.get(i).pres);
                    break;
            case 3:add_player(o.get(i).pres);
                    break;
            case 4:remove_player(o.get(i).pres);
                    break;
            case 5:return;
          }//throw new InvalidException("Not a valid choice!");
        }
      }
    }
    if(count == 0)
    {
      System.out.println("Invalid Credentials!");
    }
  }
}
// }admin.main(new String[]{})
class InvalidException extends Exception
{
  InvalidException(String s)
  {
    super(s);
  }
}
class main
{

  public static void main(String[] args)
  {
    modify obj1 = new modify();
    try
    {
      thread t = new thread();
      //generic g = new generic();
      generic<String> gs = new generic<>("LOGIN");
      Scanner sc = new Scanner(System.in);
      while(true)
      {
        //t.start();
        //t.sleep(300);
        System.out.println(gs.getData());
        collection.main(new String[]{});
        int ch = sc.nextInt();
        switch(ch)
        {
          case 1:obj1.admin_login();
                  break;
          case 2:obj1.pres_login();
                  break;
          case 3:return;
          default:System.out.println("Invalid choice!");
        }
      }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
