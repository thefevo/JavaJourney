package chapter3;

import java.time.LocalDate;
import java.time.Period;

public class CHRclass {
 private String firstname;
 private String lastname;
 private int gender;
 private int birthmonth;
 private int birthday;
 private int birthyear;
    private double heightInInches;
    private double weightInPounds;

 public CHRclass(String firstname, String lastname, int gender, int birthmonth, int birthday, String birthyear, double heightInInches, double weightInPounds){
     this.firstname=firstname;
     this.lastname=lastname;
     this.gender=gender;
     this.birthmonth=birthmonth;
     this.heightInInches=heightInInches;
     this.weightInPounds=weightInPounds;
 }
public String getFirstname(){
     return firstname;
    }
    public void setFirstname(String firstname){
     this.firstname = firstname;
    }
    public String getLastname(){
     return lastname;
    }
    public void setLastname(String lastname){
     this.lastname= lastname;
    }
    public int getGender(){
     return gender;
    }
    public void setGender(int gender){
     this.gender=gender;
    }
    public int getbirthmonth(){
     return birthmonth;
    }
    public void setBirthmonth(int birthmonth){
     this.birthmonth=birthmonth;
    }
    public int getbirthday(){
     return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    public int getage(){
        LocalDate birthdate=LocalDate.of(birthyear,birthday,birthmonth);
        LocalDate currentdate=LocalDate.now();
        return Period.between(birthdate,currentdate).getYears();
    }
    public double calculateBMI(){
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }
    public int getmaxhearthrate(){
     return 220 - getage();
    }
    public String gettargetheartraterange() {
        double lowerBound = getmaxhearthrate() * 0.5;
        double upperBound = getmaxhearthrate() * 0.85;
        return String.format("%.0f - %.0f bpm", lowerBound, upperBound);
    }
}
