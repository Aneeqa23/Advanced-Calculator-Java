import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("+========== ADVANCE CALCULATOR===========+");
        System.out.println("|1.sum                                   |");
        System.out.println("|2.difference                            |");
        System.out.println("|3.multiply                              |");
        System.out.println("|4.divide                                |");
        System.out.println("|5.even odd check                        |");
        System.out.println("|6.average                               |");
        System.out.println("|7.Prime number check                    |");
        System.out.println("|8.Sum of first n numbers                |");
        System.out.println("|9.Print table of a number               |");
        System.out.println("|10.Min and max number Finder            |");
        System.out.println("|11.Fibanocci series                     |");
        System.out.println("|12.Sum of odd numbers                   |");
        System.out.println("+========================================+");
        System.out.println("Enter choice(0 to exit): ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                sum(input); 
                break;
            case 2:
                 difference(input); 
                 break;
            case 3:
                 multiply(input);
                 break;
            case 4:
                 divide(input);
                 break;
            case 5:
                 evenodd(input);
                 break;
            case 6:
                 average(input);
                 break;
            case 7:
                 isprime(input);
                 break;
            case 8:
                 sumMany(input);
                 break;
            case 9:
                 table(input);
                 break;
            case 10:
                 minMaxFind(input);
            case 11:
                 fibanocci(input);
            case 12:
                 sumodd(input);
            case 0:
            System.out.println("Exiting program");
            break;
            default:
            System.out.println("Invalid choice");

        }
    }
}

//method for sum
public static void sum(Scanner input){
    System.out.println("enter two numbers : ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int sum = num1 + num2;
    System.out.println("Sum is : "+ sum);
}

//method for difference
public static void difference(Scanner input){
    System.out.println("enter two numbers : ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    if(num1 != 0 && num2 !=0){
        if(num1 > num2){
            int difference = num1 - num2;
            System.out.println("difference is : "+ difference);}
        else{
        int difference = num2 - num1;
        System.out.println("difference is : "+ difference);
    }
   }
}

//method for division
public static void divide(Scanner input){
 System.out.println("enter two numbers : ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    if(num1 != 0 && num2 !=0){
      if(num1 > num2){
        int divide = num1 /num2;
        System.out.println("division gives : "+ divide);
        }
      else{
        int divide = num2 / num1;
        System.out.println("division gives : "+ divide);   
    }
  }
}

//method for multiplication
public static void multiply(Scanner input){
    System.out.println("enter two numbers : ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int multiply = num1 * num2;
    System.out.println("Multiplying gives: "+ multiply);
}

//method for computing average
public static void average(Scanner input){
     System.out.println("enter three numbers : ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int average = (num1 + num2 + num3) / 3;
    System.out.println("Average is : "+ average);
}

//method for even odd check
public static void evenodd(Scanner input){
        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        if(num%2==0){
            System.out.println("Numbr is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }

//method to check for prime numbers
public static void isprime(Scanner input){
    System.out.println("Enter a number: ");
    int num = input.nextInt();

    if (num <= 1) {
        System.out.println(num + " is not a prime number.");
        return;
    }

    boolean isPrime = true;

    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            isPrime = false;
            break; // no need to check further
        }
    }

    if (isPrime) {
        System.out.println(num + " is a prime number.");
    } else {
        System.out.println(num + " is not a prime number.");
    }
}


//method to print sum of first n numbers
public static void sumMany(Scanner input){
     System.out.println("Enter till which number u wish to sum: ");
     long n = input.nextInt();
     long sum = 0;
     for(long i = 0;i<=n;i++){
        sum+=i;
     }
     System.out.println("sum is : "+ sum);
 }

//method to print table
public static void table(Scanner input){
    System.out.println("Enter number : ");
     int n = input.nextInt();
     for(int i = 1;i<=10;i++){
        int num= n*i;
        System.out.println(n+" * " +i+" = " + num);
     }
}

// finding minimum and maximum number
public static void minMaxFind(Scanner input) {
    System.out.println("Enter how many numbers you want to input:");
    int count = input.nextInt();

    if (count <= 0) {
        System.out.println("Invalid choice.");
        return;
    }

    System.out.print("Enter number 1: ");
    int num = input.nextInt();
    int min = num;
    int max = num;

    for (int i = 2; i <= count; i++) {
        System.out.print("Enter number " + i + ": ");
        num = input.nextInt();

        if (num < min) {
            min = num;
        }

        if (num > max) {
            max = num;
        }
    }

    System.out.println("Minimum number is: " + min);
    System.out.println("Maximum number is: " + max);
}
//method for fibanocci
public static void fibanocci(Scanner input){
    System.out.println("Enter a number for which u wish to find fibanocci: ");
    int n =input.nextInt();
    int a =0;
    int b=1;
    for(int i=1;i<=n;i++){
        System.out.println(a);
        int sum = a + b;
        a = b;
        b=sum;
    }
}
public static void sumodd(Scanner input){
    System.out.println("Enter the number till which u want to get sum");
    int n =input.nextInt();
    //checking if the user entered number is odd or not
    if(n%2==0){
        System.out.println("Enter an odd number");
}
}
}
