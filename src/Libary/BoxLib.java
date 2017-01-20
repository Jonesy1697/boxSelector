/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libary;

import Box.Box;
import Box.BoxI;
import Box.BoxII;
import Box.BoxIII;
import Box.BoxIV;
import Box.BoxV;

/**
 *
 * @author Chris
 */
public class BoxLib {
    private static String errMsg;
    
    public static Box calculateBoxType(int height, int length, int width, int grade, int colour, boolean refBot, boolean refCor, boolean sealable){
        switch (colour) {
            case 0:
                if(grade > 3 || grade < 1){
                    System.out.println("ERROR: Can only select grade 1-3 for box type BoxI");
                    errMsg = "ERROR: Can only select grade 1-3 for box type BoxI";
                }
                else{
                    return new BoxI(height,length,width,grade,sealable);
                }   break;
            case 1:
                // BoxII
                if(grade > 4 || grade < 2){
                    System.out.println("ERROR: Can only select grade 2-4 for box type BoxII");
                    errMsg = "ERROR: Can only select grade 2-4 for box type BoxII";
                }
                else{
                    return new BoxII(height,length,width,grade,sealable);
                }   break;
            case 2:
                if(refBot){ // If it has reinforced bottom and it's colour 2  then...
                    if(refCor){ // If it has reinforced bottm, reinforced corners and it's colour 2 then...
                        if(grade > 5 || grade < 3){ // Must be between grade 3 and 5 for BoxV
                            System.out.println("ERROR: Can only select grade 3-5 for box type BoxV"); // TODO Change from console -> alert box.
                            errMsg = "ERROR: Can only select grade 3-5 for box type BoxV";
                            break;
                        }
                        else{
                            return new BoxV(height,length,width,grade,sealable);
                        }
                    }
                    else{
                        if(grade > 4 || grade < 2){
                            System.out.println("ERROR: Can only select grade 2-4 for box type BoxIV");
                            errMsg = "ERROR: Can only select grade 2-4 for box type BoxIV";
                            break;
                        }
                        else{
                            return new BoxIV(height, length, width, grade, sealable);
                        }
                    }
                }
                else{
                    if(grade > 4 || grade < 2){
                        System.out.println("ERROR: Can only select grade 2-4 for box type III");
                        errMsg = "ERROR: Can only select grade 2-4 for box type III";
                        break;
                    }
                    else{
                        return new BoxIII(height, length, width, grade, sealable);
                    }
                } 
            default:
                break;
        }
        //System.out.println("NO BOX WAS SELECTED ERROR IN IF BLOCK");
        return null; // Interface uses null to check if box is valid selection
    }
    
    public static String getError(){
        return errMsg;
    }
}
