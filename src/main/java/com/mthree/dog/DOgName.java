/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.dog;

/**
 *
 * @author Nur
 */
import java.util.Scanner;
import java.util.Random;

public class DOgName {
    public static void main (String [] args){
        Scanner DG = new Scanner(System.in);
        Random r = new Random();       

        String dogname;
        int totalpercent =100;
      System.out.println("What is the name of your Dog?");
      dogname = DG.next();
       System.out.println("Well then, I have this highly reliable report on " + dogname + " prestigious background right here. ");
       
      System.out.println(dogname + " is:");
      int pitbull =  r.nextInt(totalpercent);
      int Chihuahua = r.nextInt(totalpercent-pitbull);
      int Commoncur =r.nextInt(totalpercent-pitbull-Chihuahua);
      int stbernard = r.nextInt(totalpercent-pitbull-Chihuahua-Commoncur);
      int yellownose = r.nextInt(totalpercent-pitbull-Chihuahua-Commoncur-stbernard);
      
      System.out.println(pitbull+ "% Pitbull");
      System.out.println(Chihuahua + "% Chihuahua");
      System.out.println(Commoncur + "% Common Cur");
      System.out.println(stbernard + "% St. Bernard");
        System.out.println(yellownose +"% YellowNose");
      System.out.println("Wow, Thats Quite the dog!");
    }
}
