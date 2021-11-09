/*Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50. Now make two constructors of this class as follows:
        1 - without any parameter - no amount will be added to the Piggie Bank
        2 - having a parameter which is the amount that will be added to Piggie Bank
        Create object of the 'AddAmount' class and display the final amount in Piggie Bank.*/
        import java.util.Scanner;

        public class AddAmount {
        
            int amount=50;
            AddAmount(int amount1){
                this.amount= this.amount + amount1 ;
            }
            public void display(){
                System.out.println(amount);
            }
            public static void main(String[] args) {
                System.out.println("enter a amount to be added-");
                Scanner sc = new Scanner(System.in);
                int add_amount = sc.nextInt();
                AddAmount obj3 =new AddAmount(add_amount);
                obj3.display();
            }
        }