//********************************************************************
//  Tunes.java       Java Foundations
//
//  Demonstrates the use of an array of objects.
//********************************************************************

public class Tunes
{
   //-----------------------------------------------------------------
   //  Creates a CDCollection object and adds some CDs to it. Prints
   //  reports on the status of the collection.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      CDCollection music = new CDCollection ();
      
      music.addCD("Storm Front", 14.95, 10, "Billy O Joel", "Shania Twain", "Garth Brooks");
      music.addCD("Come On Over", 14.95, 16, "Shania Twain");
      music.addCD("Soundtrack", 17.95, 33, "Les Miserables","Shania Twain");
      music.addCD("Graceland", 13.90, 11, "Paul Simon", "Garth Brooks");
      music.addCD("Double Live", 19.99, 26, "Garth Brooks");
      music.addCD("Greatest Hits", 15.95, 13, "Jimmy Buffet", "Billy O Joel");
      
      System.out.println(music);
   }
}
