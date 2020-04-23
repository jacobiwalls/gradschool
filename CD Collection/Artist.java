
public class Artist 
{
	private String firstname, middlename, lastname;
	
	public Artist(String firstname, String middlename, String lastname)
	{
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}
	
   //-----------------------------------------------------------------
   //  Returns a string description of the artist.
   //-----------------------------------------------------------------
   public String toString()
   {
      String artistFullName;

      artistFullName = firstname + " " + middlename + " " + lastname;

      return artistFullName;
   }

}
