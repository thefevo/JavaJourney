package chapter5;

import java.util.Scanner;

public class Autopolicy {
    //public static void main(String[] args) {
       // Scanner input=new Scanner(System.in);

    private int accountnumber;
    private String makeandModel;
    private String state;

    public Autopolicy(int accountnumber,String makeandModel,String state){
        this.accountnumber=accountnumber;
        this.makeandModel=makeandModel;
        this.state=state;
    }
    public void setAccountnumber(int accountnumber){
        this.accountnumber=accountnumber;
    }
      public int getAccountnumber(){
          return accountnumber;
      }

    public void setMakeandModel(String makeandModel) {
        this.makeandModel = makeandModel;
    }

    public String getMakeandModel() {
        return makeandModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    public boolean isnotfaultstate(){
        boolean nofaultstate;

        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
                nofaultstate=true;
                break;
            default:
                nofaultstate=false;
                break;
        }
        return nofaultstate;
    }
}

