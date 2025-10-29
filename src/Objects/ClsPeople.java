
package Objects;

public abstract class ClsPeople {
    private String IDDNI;
    private String Name;
    private String LastName;
    private String Email;
    private String Phone;
    
    public ClsPeople() {
        this.IDDNI = IDDNI;
        this.Name = Name;
        this.LastName = LastName;
        this.Email = Email;
        this.Phone = Phone;
    }
    public ClsPeople(String IDDNI, String Name, String LastName, String Email, String Phone) {
        this.IDDNI = IDDNI;
        this.Name = Name;
        this.LastName = LastName;
        this.Email = Email;
        this.Phone = Phone;
    }

    public String getIDDNI() {
        return IDDNI;
    }

    public void setIDDNI(String IDDNI) {
        this.IDDNI = IDDNI;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
}
