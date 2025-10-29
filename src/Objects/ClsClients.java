package Objects;

public class ClsClients extends ClsPeople{
    private String DireCli;
    private String DateCli;
    
    

    public ClsClients() {
        this.DireCli = "";
        this.DateCli = "";
    }

    public ClsClients(String DireCli, String DateCli) {
        this.DireCli = DireCli;
        this.DateCli = DateCli;
    }

    public ClsClients(String DireCli, String DateCli, String IDDNI, String Name, String LastName, String Email, String Phone) {
        super(IDDNI, Name, LastName, Email, Phone);
        this.DireCli = DireCli;
        this.DateCli = DateCli;
    }
    
    public String getDireCli() {
        return DireCli;
    }

    public void setDireCli(String DireCli) {
        this.DireCli = DireCli;
    }

    public String getDateCli() {
        return DateCli;
    }

    public void setDateCli(String DateCli) {
        this.DateCli = DateCli;
    }
    
}

