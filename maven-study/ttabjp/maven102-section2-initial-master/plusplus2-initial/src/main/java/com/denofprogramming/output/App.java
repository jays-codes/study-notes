package com.denofprogramming.output;

/**
 *
 * 
 */
public class App
{
    public static void main(String... args) {
        System.out.println("|++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|");
        System.out.println("|");
        if (args.length == 0){
            System.out.println("|   Hello, I'm created by Apache Maven! ");
        }else{
        	System.out.println("|   Arg passed in ... " + args[0]);
        }            
        System.out.println("|");
        System.out.println("|");
        System.out.println("|++++++++++++++++++++++++++++++++++++++++");
    }
    
}
