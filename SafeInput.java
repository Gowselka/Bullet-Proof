
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @param pipe a scanner opened to read from System.in
 * @param prompt prompt for the user input. 
 * @return a String response that is not zero in length
 */
public class SafeInput 
{
    public static String getNonZeroLenString (Scanner pipe, String prompt)
    {
      String retString = "";
      
      do
      {
          System.out.print("\n" + prompt + ":");
          retString = pipe.nextLine();
      }
      while(retString.length()==0);
      
      return retString;
    }
    
    public static int getRangedInt(Scanner pipe, String prompt)
    {
        int value = 0;
        String trash = "";
        
        do
        {
        System.out.print("\n" + prompt + ":");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                return value;
            }
            else
            {
                System.out.print("You must enter an integer. Try again");
                trash = pipe.nextLine();
            }
        }
        while(value>0);
         
        return value;
        
    }
    
    public static double getRangedDouble (Scanner pipe, String prompt)
    {
        double value = 0;
        String trash = "";
        String numbervalue = "";
        
        do
        {
            System.out.print("\n" + prompt + ":");
                if(pipe.hasNextDouble())
                {
                    value = pipe.nextDouble();
                    
                }
                else
                {
                    System.out.println("You must enter a valid number. Try again.");
                    trash = pipe.nextLine();
                }
        }
        while(value!=0);
                
        return value;
    }
    
    public static boolean getYNCConfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean Yesorno = false;
        
        
        while(!done)
        {
            System.out.print("\n" + prompt + ":");
            if(pipe.hasNext("Y"))
            {
               done = true;
               Yesorno = true;
            }
            if(pipe.hasNext("y"))
            {
                done = true;
                Yesorno = true;
            }
            if(pipe.hasNext("N"))
            {
                done = true;
                Yesorno = false;
            }
            if(pipe.hasNext("n"))
            {
                done = true;
                Yesorno = false;
            }
            else
            {
                done = false;
                System.out.println("Please enter [Y/N]");
            }
        }
        return Yesorno;
    }
    
    
    
    
}
