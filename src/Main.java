import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       int number;
       boolean check=true;
       Scanner input=new Scanner(System.in);
       System.out.println("nhap vao mot so");
       number=input.nextInt();
       if(number<2) System.out.print("khong phai so nguyen to");
       else {
           int count=2;
           while (count<Math.abs(number)){
               if(Math.abs(number)%count==0){
                   check=false;
                   break;
               }
               count++;
           }
           if (check) System.out.println("la so nguyen to");
           else System.out.println("khong phai so nguyen to");
       }
    }
}