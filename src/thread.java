public class thread extends Thread
{
  public void run()
    {
      try
      {
        System.out.println ("Loading...");
      }
      catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
