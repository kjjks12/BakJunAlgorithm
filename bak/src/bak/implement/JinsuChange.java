package bak.implement;
import java.util.Scanner;

public class JinsuChange {

   public String binary(int decimal) {
      StringBuffer sb = new StringBuffer();

      while (decimal != 0) {
         sb.insert(0, decimal % 2);
         decimal /= 2;
      }
      return sb.toString();
   }
   
   public String octal(int decimal){
      StringBuilder sb= new StringBuilder();
      
      while(decimal!=0){
         sb.insert(0, decimal%8);
         decimal/=8;
      }
      return sb.toString();
   }
   
   public String hex(int decimal){
      StringBuilder sb= new StringBuilder();
      
      while(decimal!=0){
         if(decimal%16>=10){
            sb.insert(0,(char)(decimal%16+55));
         }
         else{
         sb.insert(0, decimal%16);
         }
         decimal/=16;
      }
      return sb.toString();
   }
   
   public String thirtytwo(int decimal){
      StringBuilder sb= new StringBuilder();
      
      while(decimal!=0){
         if(decimal%32>=10){
            sb.insert(0,(char)(decimal%32+55));
         }
         else{
         sb.insert(0, decimal%32);
         }
         decimal/=32;
      }
      return sb.toString();
   }

   public int binaryToDecimal(String binary){
      int result=0;
      int b=0;
      for(int i=binary.length()-1; i>=0;i--){
         int index=Integer.parseInt(binary.charAt(i)+"");
         int temp=index*(int)(Math.pow(2,b++));
         result+=(temp);
      }
      
      return result;
   }
   public int octalToDecimal(String octal){
      int result=0;
      int b=0;
      for(int i=octal.length()-1; i>=0;i--){
         int index=Integer.parseInt(octal.charAt(i)+"");
         int temp=index* (int)(Math.pow(8,b++));
         result+=(temp);
      }
      
      return result;
   }
   
   public int hexToDecimal(String hex){
      int result=0;
      int b=0;
      for(int i=hex.length()-1; i>=0;i--){
         int index=0;
         if(hex.charAt(i)>='A' && hex.charAt(i)<='Z'){
            index=hex.charAt(i);
            index-=55;
         }
         else{
            index=Integer.parseInt(hex.charAt(i)+"");
         }
         System.out.println(index);
         int temp=index* (int)(Math.pow(16,b++));
         result+=(temp);
      }
      
      return result;
   }
   
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int decimal = scan.nextInt();
      scan.close();

      JinsuChange js = new JinsuChange();

      System.out.println("10진수->2진수 :"+js.binary(decimal));
      System.out.println("10진수->8진수 :"+js.octal(decimal));
      System.out.println("10진수->16진수 :"+js.hex(decimal));
      System.out.println("10진수->32진수 :"+js.thirtytwo(decimal));
      System.out.println("======================================");
      System.out.println("2진수->10진수 :"+js.binaryToDecimal(js.binary(decimal)));
      System.out.println("8진수->10진수 :"+js.octalToDecimal(js.octal(decimal)));
      System.out.println("16진수->10진수 :"+js.hexToDecimal(js.hex(decimal)));
      

   }

}