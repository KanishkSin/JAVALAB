import java.util.* ;
class collection
{
    public static void main(String[] args)
    {
      ArrayList<String> a1 = new ArrayList<String>();
      a1.add("1.Admin");
      a1.add("2.Club President");
      a1.add("3.Exit");
      for (String s : a1)
      {
          System.out.println(s);
      }
    }
}
