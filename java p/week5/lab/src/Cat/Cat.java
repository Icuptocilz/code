package Cat;
public class Cat {
    private String name ;
    private String color;
    public double height;
    public double weight;
    private void setWeight (double w){
        if (w < 0) {
            System.out.println("Error");
        }
        else {
            weight = w ;
        }
    }
    private void setHeight(double h){
        if (h < 0){
            System.out.println("Error");
        }
        else {
            height = h ;
        }
    }
    private void setName(String n){
        n = name;
    }
    private void setColor(String c){
        c = color;
    }
    public void upWeight(double w){
         if (w < 0) {
            System.out.println("Error");
        }
         else{
            w += weight;
            setWeight(w);
         }
        
    }
    public void downWeight(double w){
        if (w < 0) {
            System.out.println("Error");
        }
         else{
            w -= weight;
            setWeight(w);
        }
    }
    public void upHeight(double h){
        if (h < 0) {
            System.out.println("Error");
        }
         else{
            h += height;
            setHeight(h);
        }
    }
    public void defineCat(String n,String c){
        name = n;
        setName(n);
        color = c;
        setColor(c);
    }
    public void speak(){
        System.out.println("Name : "+name);
        System.out.println("Color : "+color);
        System.out.println("Height : "+height);
        System.out.println("Weight : "+weight);
    }
}
