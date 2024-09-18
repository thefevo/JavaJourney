package chapter3;

import java.time.LocalDate;
import java.time.Period;

public class THRclass {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;


    public THRclass(String firstname, String lastname, int birthmonth, int birthday, int birthyear) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setBirthmonth(int birthmonth){
        this.birthmonth=birthmonth;
    }
    public void setBirthday(int birthday){
        this.birthday=birthday;
    }
    public void setBirthyear(){
        this.birthyear=birthyear;
    }
    public void getfirstname(String firstname){
        this.firstname=firstname;
    }
    public CharSequence getlastname(){
        this.lastname=lastname;
        return null;
    }
    public void getbirthmonth(int birthmonth){
        this.birthmonth=birthmonth;
    }
    public void getbirthday(int birthday){
        this.birthday=birthday;
    }
    public void getbirthyear(int birthyear){
        this.birthyear=birthyear;
    }
    public int getage() {
        LocalDate birthdate = LocalDate.of(birthyear,birthmonth,birthday);
        LocalDate currentdate = LocalDate.now();
        return Period.between(birthdate,currentdate).getYears();
    }
    public int getmaxhearthrate(){
        return 220-getage();
    }
    public String  getTargetHeartRateRange(){
        int maxHeartRate = getMaxHeartRate();
        int lowerRange = (int) (maxHeartRate * 0.50);
        int upperRange = (int) (maxHeartRate * 0.85);
        return lowerRange + " - " + upperRange + " beats per minute";
    }

    private int getMaxHeartRate() {
        return 0;
    }


    public String getfirstname() {
        return null;
    }


    public String getbirthmonth() {
        return null;
    }

    public Object getbirthday() {
        return null;
    }

    public Object getbirthyear() {
        return null;
    }
}
