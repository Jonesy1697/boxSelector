package Interface;


/*
REMOVE ME BEFORE SUBMITION
*/

//import core.Interface.Interface;
import Box.BoxV;
import Box.BoxIV;
import Box.BoxIII;
import Box.BoxII;
import Box.BoxI;
import Box.Box;
import Libary.BoxLib;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class Sandbox {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Box> orderList = new ArrayList<>();
    static ArrayList<Integer> arrList = new ArrayList<>();
    static int height;
    static int width;
    static int length;
    static int grade;
    static int colour;
    static boolean sealable;
   
   
    /*
        TODO
    Add interaction between interface and core
    Implement quantity
    Create a list of products
    */
    
    public static void main(String arg[]){
        //System.out.println("BoxV no top: " + (new BoxV(1,1,1,1,false).getPercent() + 100));
        //System.out.println("BoxV w/ top: " + (new BoxV(1,1,1,1,true).getPercent() + 100));
        //Box box = BoxLib.calculateBoxType(5, 5, 5, 5,2, true, true, false);
        //box.printType();
        //System.out.println("Box's total percent: " + (.getPercent() + 100));
        //System.out.println("Box's total price: " + (BoxLib.calculateBoxType(5, 5, 5, 1, 0, false, false, false).getTotalPrice() + BoxLib.calculateBoxType(5, 5, 5, 3, 2, false, false, false).getTotalPrice() + BoxLib.calculateBoxType(height, length, width, grade, colour, sealable, sealable, sealable)));
    }
    
    
    
        
}

    