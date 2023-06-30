/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author prerna
 */
public class HCF {
    public static void main(String[] args) {
    int input1;
    int input2;
    Scanner sc=new Scanner(System.in);
    input1=sc.nextInt();
    input2=sc.nextInt();
    int result=gcd(input1,input2);
    System.out.println("HCF of "+input1 +" and "+input2+" is: "+ result);
            
        
    }
    public static int gcd(int a,int b)
    { 
      int res=Math.min(a,b);
      while(true)
      {
          if(a%res==0 && b%res==0)
          {
              return res;
          }
          res--;
      }
 
     
    }
}


