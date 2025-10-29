package Objects;

public class ClsAdmin extends ClsPeople {

    private String UserAdmin;
    private String PassAdmin;
    
    public ClsAdmin() {
        this.UserAdmin = "";
        this.UserAdmin = "";
    }
    
    public ClsAdmin(String UserAdmin, String PassAdmin) {
        this.UserAdmin = UserAdmin;
        this.PassAdmin = PassAdmin;
    }

    public ClsAdmin(String IDDNI, String Name, String LastName, String Email, String Phone, String UserAdmin, String PassAdmin) {
        super(IDDNI, Name, LastName, Email, Phone);
        this.UserAdmin = UserAdmin;
        this.PassAdmin = PassAdmin;
    }

    public String getUserAdmin() {
        return UserAdmin;
    }

    public void setUserAdmin(String UserAdmin) {
        this.UserAdmin = UserAdmin;
    }

    public String getPassAdmin() {
        return PassAdmin;
    }

    public void setPassAdmin(String PassAdmin) {
        this.PassAdmin = PassAdmin;
    }
    

}
