/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package summative;

import java.util.Scanner;
/**
 *
 * @author thbar7035
 */
public class Summative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        String name1;
        String name2;
        double nameVal1 = 0;
        double nameVal2 = 0;
        String name1letter2="";
        String name2letter2="";
        
        String [] alphabet = new String [26];
        alphabet[0]="a";
        alphabet[1]="b";
        alphabet[2]="c";
        alphabet[3]="d";
        alphabet[4]="e";
        alphabet[5]="f";
        alphabet[6]="g";
        alphabet[7]="h";
        alphabet[8]="i";
        alphabet[9]="j";
        alphabet[10]="k";
        alphabet[11]="l";
        alphabet[12]="m";
        alphabet[13]="n";
        alphabet[14]="o";
        alphabet[15]="p";
        alphabet[16]="q";
        alphabet[17]="r";
        alphabet[18]="s";
        alphabet[19]="t";
        alphabet[20]="u";
        alphabet[21]="v";
        alphabet[22]="w";
        alphabet[23]="x";
        alphabet[24]="y";
        alphabet[25]="z";
        
        
        System.out.println("Please enter 2 names, if they aren't already in alphabetical order, they will be");
        name1 = keyedInput.nextLine();
        name2 = keyedInput.nextLine();
        
        
        
        for (int i = 0; i <= 25; i = i + 1)
        {
            if (name1.startsWith(alphabet[i])){
                nameVal1 = i;
            }
            if (name2.startsWith(alphabet[i])){
                nameVal2 = i;
            }
        }
        
        
        
        name1letter2=name1.substring(1, 2);
        name2letter2=name2.substring(1, 2);
        
        
        if (nameVal1<nameVal2){
            System.out.println(name1);
            System.out.println(name2);
        }
        else if (nameVal1>nameVal2){
            System.out.println(name2);
            System.out.println(name1);
        }
        else {
            for (int x = 0; x <= 25; x = x + 1)
        {
            if (name1letter2.equals(alphabet[x])){
                 ;  
            }
            if (name2letter2.equals(alphabet[x])){
                 nameVal2=x;
            }
        }
            if (nameVal1<nameVal2){
            System.out.println(name1);
            System.out.println(name2);
        }
             else if (nameVal1>nameVal2){
            System.out.println(name2);
            System.out.println(name1);
        }
             else {
                 System.out.println("Why you gotta be like that?");
             }
            
        }
        
        
        
        
    }
    
}
