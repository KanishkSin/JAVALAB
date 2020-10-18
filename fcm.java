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

  public void display()
  {
    System.out.println("Club ID: " + this.club_id[token]);
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
  public void remove_player()
  {
    this.club_plyrs = club_plyrs;
    System.out.println("Enter the name of the player you want to remove: ");
    String rem = sc.nextLine();
    List<String> list = new ArrayList<String>(Arrays.asList(club_plyrs));
    list.remove(rem);
    club_plyrs = list.toArray(new String[0]);
    System.out.println(list);
  }

  public void add_player()
  {
    this.club_plyrs = club_plyrs;
    System.out.println("Enter the name of the player you want to add: ");
    String add = sc.nextLine();
    List<String> list1 = new ArrayList<String>(Arrays.asList(club_plyrs));
    list1.add(add);
    club_plyrs = list1.toArray(new String[0]);
    System.out.println(list1);
  }
}

class fcm
{
  //Scanner sc = new Scanner(System.in);

  // public static void menu1() {
  //   System.out.println("MENU\n" + "1.Create a new club\n" + "2.Modify an existing club\n" + "3.Exit\n" + "Enter your choice:");
  //   int ch = sc.nextInt();
  //
  //   switch (ch) {
  //     case 1:
	// 			club obj = new club();
  //       obj.display();
  //       break;
  //     case 2:
  //       menu_op2();
  //       break;
  //     case 3:
  //       return;
  //
  //     default:
  //       System.out.println("Invalid Choice!");
  //   }
  // }
  // public static void menu2() {
  //   Scanner sc = new Scanner(System.in);
  //   int ch = sc.nextInt();
  //   switch (ch) {
  //     case 1: // remove_player();
  //       System.out.println("hello");
  //       break;
  //     // case 2 : ();
  //     // break;
  //     // case 3 : ();
  //     // break;
  //     // case 4 : return;
  //
  //     default:
  //       System.out.println("Invalid Choice!");
  //   }
  // }

  public static void main(String[] args)
  {
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter Club ID:");
    int ch = sc.nextInt();
		club obj = new club(ch - 1);
    for(int i = 0; i < obj.club_id.length; i++)
    {
      if(ch == obj.club_id[i])
      obj.display();
      modify_club obj1 = new modify_club();
      obj1.remove_player();
      obj1.add_player();
    }
  }
}
//}
//  }
