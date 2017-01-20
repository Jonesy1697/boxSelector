package Box;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class BoxIII extends Box{
    // Type III,Grade 2-5, Color 2, refBot false, RefCor false
   
    public BoxIII(int height, int length, int width, int grade, boolean sealTop) {
        super(height, length, width, grade);
        this.sealTop = sealTop;
        setupPercent();
    }
    
    public BoxIII(int height, int length, int width, int grade) {
        super(height, length, width, grade); 
        this.sealTop = false;
        setupPercent();
    }
    
    @Override
    protected final void setupPercent(){
        percent = percent + 16;
        if(sealTop == true){
            percent = percent + 8;
        }
    }
    
    @Override
    public void printType(){
        System.out.println("BoxIII");
    }
}
