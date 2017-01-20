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
public class BoxI extends Box {
    // Type I,Grade 1-3, Color 1, refBot false, RefCor false
    public BoxI(int height, int length, int width, int grade, boolean sealTop) {
        super(height, length, width, grade); 
        this.sealTop = sealTop;
        setupPercent();
    }
    
    public BoxI(int height, int length, int width, int grade) {
        super(height, length, width, grade); 
        this.sealTop = false;
        setupPercent();
    }

    @Override
    protected final void setupPercent() {
        percent = percent + 0;
        if(sealTop == true){
            percent = percent + 8;
        }
    }
    
    @Override
    public void printType(){
        System.out.println("BoxI");
    }
    
    
}
