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
public class BoxIV extends Box {
    // Type I,Grade 2-5, Color 2, refBot true, RefCor false
    public BoxIV(int height, int length, int width, int grade, boolean sealTop) {
        super(height, length, width, grade);
        this.sealTop = sealTop;
        setupPercent();
    }
    
    public BoxIV(int height, int length, int width, int grade) {
        super(height, length, width, grade); 
        this.sealTop = false;
        setupPercent();
    }
    @Override
    protected final void setupPercent() {
        percent = percent + 30;
        if(sealTop == true){
            percent = percent + 8;
        }
    }
    
    @Override
    public void printType(){
        System.out.println("BoxIV");
    }
}
