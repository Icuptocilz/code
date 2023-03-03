package week6;
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
  
    public static void  setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public static String getNationality(){
        return Employee.nationality;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public Wallet getWallet(){
        return this.wallet;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public int getEnergy(){
        return this.energy;
    }
    
}
