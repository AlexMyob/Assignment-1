public class Company {
    private String name;
    private String date;
    private String type;
    private String symbol;
    private String shares;
    private String currency;
    private double price;
    private double costs;
    private double total;
    private boolean cashAffected;


    public Company(String date, String type, String symbol, String shares, double price, double costs,
                   double total, String currency, boolean cashAffected, String name) {
        super();
        this.name = name;
        this.date = date;
        this.type = type;
        this.symbol = symbol;
        this.shares = shares;
        this.currency = currency;
        this.price = price;
        this.costs = costs;
        this.total = total;
        this.cashAffected = cashAffected;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getSymbol() {
        return symbol;
    }


    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public String getShares() {
        return shares;
    }


    public void setShares(String shares) {
        this.shares = shares;
    }


    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public double getCosts() {
        return costs;
    }


    public void setCosts(double costs) {
        this.costs = costs;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public boolean isCashAffected() {
        return cashAffected;
    }


    public void setCashAffected(boolean cashAffected) {
        this.cashAffected = cashAffected;
    }


    @Override
    public String toString() {
        return "Company [name=" + name + ", date=" + date + ", type=" + type + ", shares=" + shares + ", currency="
                + currency + ", price=" + price + ", costs=" + costs + ", total=" + total + ", cashAffected="
                + cashAffected + "]";
    }
}
