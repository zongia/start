public class user extends person {
    public String username;
    public String password;
    public user(int id,  String username, String password,String firstname,String lastname)
    {
    super(id,firstname,lastname);
    this.username = username;
    this.password = password;


    }
}
