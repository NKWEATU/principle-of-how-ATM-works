/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atmuserprogram;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ATMUserProgram {

    public static void main(String[] args) {
   int balance = 100000, withdraw,deposit;
   
   // create a scanner class to get choice from user
   Scanner sc = new Scanner(System.in);
   
   while(true){
   System.out.println("Automated teller machine");
   System.out.println("choose 1 for wihdraw");
   System.out.println("choose 2 for deposit");
   System.out.println("choose 3 for balance check");
   System.out.println("choose 4 for exit");
   System.out.println("choose the operation you want to perform");
   
   
   //get choice from user
   int choice = sc.nextInt();
   switch (choice){
       case 1:
   System.out.println("Enter money to be withdrawn ");
   withdraw = sc.nextInt();// to get wihdrawal money from user
   balance = balance - withdraw;
   System.out.println("please collect your money : " + withdraw);
   if(balance >= withdraw)// to check if the balance is greater or equal to the wihdrawal amount
   {
       balance = balance - withdraw;
    System.out.println( "your available balance is:" + balance);
   
   }else
   
   {
         System.out.println("insufficient balance, you dont have money oga");   
           }
   
     System.out.println("");
     break;
    
     case 2:
     System.out.println("Enter money to be deposited");
     
     //get deposit from user
      deposit = sc.nextInt();
      balance = balance + deposit;
      System.out.println("Your money has been successfully deposited" +balance);
      System.out.println("");
       
       break;
       
       
       case 3:// displaying the total balance of the user
       System.out.println("Your available balance is :" +balance);
       System.out.println("");
        
        case 4: // to exit from menu
        
        System.exit(0);
        
        
   }}}}
   
   
   
    

