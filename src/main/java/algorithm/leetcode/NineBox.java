package algorithm.leetcode;

import java.util.Scanner;

public class NineBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int j=0;scanner.hasNext()&&j<500;j++)
        {
            String n =scanner.next();
            int length = n.length();
            char c = n.charAt(0);
            switch (c)
            {
                case '0':
                    if(length%2==1) {System.out.print("0");}
                    if(length%2==0) {System.out.print(" ");}
                    break;
                case '1':
                    if(length%5==1) {System.out.print("1");}
                    if(length%5==2) {System.out.print(",");}
                    if(length%5==3) {System.out.print(".");}
                    if(length%5==4) {System.out.print("?");}
                    if(length%5==0) {System.out.print("!");}
                    break;
                case '2':
                    if(length%4==1) {System.out.print("2");}
                    if(length%4==2) {System.out.print("A");}
                    if(length%4==3) {System.out.print("B");}
                    if(length%4==0) {System.out.print("C");}
                    break;
                case '3':
                    if(length%4==1) {System.out.print("3");}
                    if(length%4==2) {System.out.print("D");}
                    if(length%4==3) {System.out.print("E");}
                    if(length%4==0) {System.out.print("F");}
                    break;
                case '4':
                    if(length%4==1) {System.out.print("4");}
                    if(length%4==2) {System.out.print("G");}
                    if(length%4==3) {System.out.print("H");}
                    if(length%4==0) {System.out.print("I");}
                    break;
                case '5':
                    if(length%4==1) {System.out.print("5");}
                    if(length%4==2) {System.out.print("J");}
                    if(length%4==3) {System.out.print("K");}
                    if(length%4==0) {System.out.print("L");}
                    break;
                case '6':
                    if(length%4==1) {System.out.print("6");}
                    if(length%4==2) {System.out.print("M");}
                    if(length%4==3) {System.out.print("N");}
                    if(length%4==0) {System.out.print("O");}
                    break;
                case '7':
                    if(length%5==1) {System.out.print("7");}
                    if(length%5==2) {System.out.print("P");}
                    if(length%5==3) {System.out.print("Q");}
                    if(length%5==4) {System.out.print("R");}
                    if(length%5==0) {System.out.print("S");}
                    break;
                case '8':
                    if(length%4==1) {System.out.print("8");}
                    if(length%4==2) {System.out.print("T");}
                    if(length%4==3) {System.out.print("U");}
                    if(length%4==0) {System.out.print("V");}
                    break;
                case '9':
                    if(length%5==1) {System.out.print("9");}
                    if(length%5==2) {System.out.print("W");}
                    if(length%5==3) {System.out.print("X");}
                    if(length%5==4) {System.out.print("Y");}
                    if(length%5==0) {System.out.print("Z");}
                    break;
                default:
                    break;
            }
        }
    }
}
