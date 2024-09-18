package chapter3;

public class Carclass {
    private String carmodel;

    private  String yearofcar;

    int priceofcar;

    private double discount;



    public Carclass(String carmodel, String yearofcar, String priceofcar, double discount) {
        this.carmodel = carmodel;

        this.yearofcar = yearofcar;

        this.priceofcar = Integer.parseInt(priceofcar);

        this.discount = discount;

    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getCarmodel() {
        return carmodel;
    }




    public void setYearofcar(String yearofcar) {
        this.yearofcar = yearofcar;
    }

    public String getYearofcar() {
        return yearofcar;
    }


    public void setPriceofcar(String priceofcar) {
        this.priceofcar = Integer.parseInt(priceofcar);
    }


    public int getPriceofthecar() {
        return  priceofcar;
    }

    public void setGetDiscount(double getDiscount) {
        this.discount = discount;
    }

    public double getGetDiscount() {
        return discount;
    }


    //public double getdiscountoncar() {
      //  double totalcost = priceofcar * getDiscount;
       // double discounttotalcost = totalcost * (getDiscount / 100);
       // return totalcost - discounttotalcost;

    public double getdiscountoncar() {
        double grossAmount= priceofcar * discount;
        double discountAmount = grossAmount * (discount / 100);
        return grossAmount - discountAmount;

    }
}
