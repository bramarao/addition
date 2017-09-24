import java.util.*;
class addition
{
  public static void main(String args[])
    {
  System.out.println("Enter first number");
  Scanner sc = new Scanner(System.in);
  int numb1 = sc.nextInt();
  System.out.println("Enter second number");
  //Scanner sc = new Scanner(System.in);
  int numb2 = sc.nextInt();
  int sum = numb1 + numb2;
  System.out.println("The sum of two number:" +sum);
  
}
}