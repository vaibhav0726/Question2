// Create a class Car having properties manufacturer and price. 
// Create three instances of the class and display the details of each car sorted with respect to the price.
import java.util.Arrays;
import java.util.Scanner;

class Car {
    public String Car_name;
    public int Car_No;
    public int price;
    public Car(String Car_name,int Car_No,int price)
    {
        this.Car_name=Car_name;
        this.Car_No=Car_No;
        this.price=price;
    }
    public static void Display(Car[] obj){
        //Arrays.sort(obj);
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj.length-1; j++) {
            if(obj[j].price < obj[j+1].price){
                Car t = obj[j];
                obj[j]= obj[j+1];
                obj[j+1]= t;
            }
            }
            
        }
        for (int i=0; i< obj.length; i++){
            System.out.println(obj[i].Car_name+" "+ obj[i].Car_No);

        }


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int size = s.nextInt();
        Car obj[] = new Car[size];
        for(int i=0; i<obj.length; i++){
            System.out.println("enter the Details");
            obj[i]=new Car(s.next(),s.nextInt(),s.nextInt());
        }
        Car.Display(obj);
    }
}