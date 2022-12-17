import  java.util.Scanner;  
import java.time.LocalDate;
public class ATM 
{   
    public static void main(String args[] )  
    {    
        int balance = 50000, withdraw, deposit;    
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("Auomated Teller Machine");  
            System.out.println("Step 1 for Withdraw");  
            System.out.println("Step 2 for Deposit"); 
            System.out.println("Step 3 for Check Balance"); 
            System.out.println("Step 4 for Transactional Details");  
            System.out.println("Step 5 for Quit");  
            System.out.print("Choose the operation you want to perform:");  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");    
        withdraw = sc.nextInt();    
        if(balance >= withdraw)  
        {    
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {     
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
         case 2:  
                      
        System.out.print("Enter money to be deposited:");   
        deposit = sc.nextInt();    
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
               case 3:   
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;
               case 4:
        System.out.println("Your Transactional Details:");
        LocalDate date=LocalDate.now();
        System.out.println("Date:"+date);
        System.out.println("Time:"+java.time.LocalTime.now());
        long R=(long)(Math.random()*Math.pow(10,10));
        System.out.println("Your Transaction Id:"+R);
        System.out.println("Available Balance:"+balance);
        System.out.println("***Thank You***");
        System.out.println("");
        break;   
                case 5:    
        System.exit(0);  
            }  
        }  
    }  
}  

