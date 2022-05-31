package sg.edu.np.mad.practical2;

public class User {
    public String Name;
    public String Description;
    public int Id;
    public boolean Followed;

    public User(String name, String description, int id, boolean followed) {
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }
}