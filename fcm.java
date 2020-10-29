import java.util.*;
import java.io.*;
import java.lang.*;
import java.io.File;

class club
{
  int[] club_id = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  String[] club_nm = new String[] { "Arsenal", "Barcelona", "Bayern", "Chelsea", "Dortmund", "Juventus", "Liverpool","Man_U", "PSG", "Real_Madrid" };
  String[] club_pres = new String[] { "Friar", "Bartomeu", "Hainer", "Granovskaia", "Rauball", "Agnelli", "Werner","Glazer", "Khelaifi", "Perez" };
  String[] club_man = new String[] { "Arteta", "Koeman", "Flick", "Lampard", "Favre", "Pirlo", "Klopp", "Solskjær","Tuchel", "Zidane" };
  String[] club_plyrs = new String[] { "Leno", "Macey", "Martinez", "Kolasinac", "Luiz", "Papastathopoulos", "Mustafi","Chambers", "Bellerin", "Holding", "Nenny", "Ulreich", "Fein", "Cuisance", "Tolisso", "Kimmich", "Lewandowski",
  "Muller", "Neuer", "Alaba", "Gnabry", "Hernandez", "Stegen", "Firpo", "Lenglet", "Pique", "Semedo", "Pjanic","Coutinho", "Jong", "Fati", "Griezmann", "Dembele", "Hitz","Mendy","Azpilicueta","Silva","Zouma",
  "Chilwell","Kante","Jorginho","Hudson-Odoi","Havertz","Werner","Abraham", "Can", "Hummels", "Akanji", "Meunier", "Bellingham","Witsel", "Guerreiro", "Reus", "Reyna", "Haland", "Szczesny", "Cuadrado", "Chiellini", "Bonucci", "Danilo",
  "Ramsey", "McKennie", "Rabiot", "Kulusevski", "Ronaldo", "Morata", "Adrian", "Robertson", "Dijk", "Gomez","Arnold", "Wijnaldum", "Fabinho", "Keita", "Jota", "Firmino", "Salah", "Gea", "Bissaka", "Bailly",
  "Maguire","Shaw", "Matic", "Pogba", "Greenwood", "Fernandes", "Rashford", "Martial", "Navas", "Florenzi", "Marquinhos","Kimpembe", "Bakker", "Draxler", "Paredes", "Verratti", "Neymar", "Icardi", "Mbappe", "Curtois", "Mendy", "Ramos",
  "Varane", "Nacho", "Modric", "Casemiro", "Valverde", "Junior", "Benzema", "Asensio" };

  int token;
  club()
  {
  }

  club(int id)
  {
    token = id;
  }

  public void display(int token)
  {
    System.out.println("Club ID: " + club_id[token]);
    System.out.println("Club Name: " + this.club_nm[token]);
    System.out.println("Club President: " + this.club_pres[token]);
    System.out.println("Club Manager: " + this.club_man[token]);
    System.out.println("Club Players:");
    for (int i = (token)*11; i < (token+1)*11; i++)
    {
      System.out.println(this.club_plyrs[i]);
    }
  }
}
class modify_club extends club
{
  Scanner sc = new Scanner(System.in);
  public void remove_player(int x)
  {
    List<String> list = new ArrayList<String>();
    this.club_plyrs = club_plyrs;
    for (int i = (x)*11; i < (x+1)*11; i++)
    {
      list.add(club_plyrs[i]);
    }
    System.out.println("Enter the name of the player you want to remove: ");
    String rem = sc.nextLine();
    list.remove(rem);
    System.out.println(list);
  }

  public void add_player(int x)
  {
    List<String> list1 = new ArrayList<String>();
    this.club_plyrs = club_plyrs;
    for (int i = (x)*11; i < (x+1)*11; i++)
    {
      list1.add(club_plyrs[i]);
    }
    System.out.println("Enter the name of the player you want to add: ");
    String add = sc.nextLine();
    list1.add(add);
    System.out.println(list1);
  }
}
class fcm
{
  public static void pres_login()
  {
    club obj = new club();
    modify_club obj1 = new modify_club();
    Scanner sc = new Scanner(System.in);
    String password = "777";
    System.out.println("Enter Username: ");
    String username = sc.nextLine();
    System.out.println("Enter Password: ");
    String pass = sc.nextLine();
    int count = 0;
    for(int i = 0; i < obj.club_pres.length; i++)
    {
      if(username.equals(obj.club_pres[i]) && pass.equals(password))
      {
        count = 1;
        System.out.println("Access Granted! Welcome " + username +"! \n\n");
        while (true)
        {
          System.out.println("MENU");
          System.out.println("1.Display Club Status");
          System.out.println("2.Change the Club Manager");
          System.out.println("3.Add a player");
          System.out.println("4.Remove a player");
          System.out.println("5.Exit");
          int ch1 = sc.nextInt();
          switch(ch1)
          {
            case 1:obj.display(i);
                    break;
            case 2:
                    break;
            case 3:obj1.add_player(i);
                    break;
            case 4:obj1.remove_player(i);
                    break;
            case 5:return;
            default:System.out.println("Invald choice!");
          }
        }
      }
    }
    if(count == 0)
    {
      System.out.println("Invalid Credentials!");
    }
  }
  public static void man_login()
  {
    club obj = new club();
    modify_club obj1 = new modify_club();
    Scanner sc = new Scanner(System.in);
    String password1 = "777";
    System.out.println("Enter Username: ");
    String username1 = sc.nextLine();
    System.out.println("Enter Password: ");
    String pass1 = sc.nextLine();
    int count = 0;
    for(int i = 0; i < obj.club_man.length; i++)
    {
      if(username1.equals(obj.club_man[i]) && pass1.equals(password1))
      {
        count = 1;
        System.out.println("Access Granted! Welcome " + username1 +"! \n\n");
        System.out.println("MENU");
        System.out.println("1.Display Club Status");
        System.out.println("2.Add a player");
        System.out.println("3.Remove a player");
        System.out.println("4.Exit");
        int ch2 = sc.nextInt();
        switch(ch2)
        {
          case 1:obj.display(i);
                  break;
          case 2:obj1.add_player(i);
                  break;
          case 3:obj1.remove_player(i);
                  break;
          case 4:return;
          default:System.out.println("Invald choice!");
        }
      }
    }
    if(count == 0)
    {
      System.out.println("Invalid Credentials!");
    }
  }
  public static void main(String[] args)
  {
    club obj = new club();
    Scanner sc = new Scanner(System.in);
    System.out.println("LOGIN");
    System.out.println("1.Club President");
    System.out.println("2.CLub Manager");
    System.out.println("3.Exit");
    int ch = sc.nextInt();
    switch(ch)
    {
      case 1:pres_login();
              break;
      case 2:man_login();
              break;
      case 3:return;
      default:System.out.println("Invald choice!");
    }
  }
}
