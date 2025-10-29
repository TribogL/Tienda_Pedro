package Objects;

public class ClsProducts {

    private String IDPro;
    private String NamePro;
    private String DescriPro;
    private int Stock;
    private double PriceMPro;
    private double PriceVPro;

    public ClsProducts() {
        this.IDPro = "";
        this.NamePro = "";
        this.DescriPro = "";
        this.Stock = 0;
        this.PriceMPro = 0;
        this.PriceVPro = 0;
    }

    public ClsProducts(String IDPro, String NamePro, String DescriPro, int Stock, double PriceMPro, double PriceVPro) {

        this.IDPro = IDPro;
        this.NamePro = NamePro;
        this.DescriPro = DescriPro;
        this.Stock = Stock;
        this.PriceMPro = PriceMPro;
        this.PriceVPro = PriceVPro;
    }

    public void setIDPro(String IDPro) {
        this.IDPro = IDPro;
    }

    public void setNamePro(String NamePro) {
        this.NamePro = NamePro;
    }

    public void setDescriPro(String DescriPro) {
        this.DescriPro = DescriPro;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setPriceMPro(double PriceMPro) {
        this.PriceMPro = PriceMPro;
    }

    public void setPriceVPro(double PriceVPro) {
        this.PriceVPro = PriceVPro;
    }
    
    
    public String getIDPro(){
        return this.IDPro;
    } 

    public String getNamePro() {
        return NamePro;
    }

    public String getDescriPro() {
        return DescriPro;
    }

    public int getStock() {
        return Stock;
    }

    public double getPriceMPro() {
        return PriceMPro;
    }

    public double getPriceVPro() {
        return PriceVPro;
    }
}
