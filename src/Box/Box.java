package Box;

/**
 *
 * @author Chris
 */
public abstract class Box { // The perant to all box children. Includes many core methods and fields such as getPrice()
    
    // Fields
    protected int height; // Height of box
    protected int length; // Length of box
    protected int width; // Width of Box
    protected double price; // Price of box given it's grade
    protected int percent; // The percent multiplyer that'll be added ontop of the base price to give the true price
    protected boolean sealTop; // Will be inherited so children can assign this varable without having to initlize it in every child
    
    /*
    Many varables are not required in the Box classes, such as reinforced corners, as they'll be used when deciding what Box to select
    in the the method "calculateBoxType" located in the "core" package under "core"
    */
    
    public Box(int height, int length, int width, int grade){
        this.height = height;
        this.length = length;
        this.width = width;
        
        switch(grade){ // The grade of material equates to the base price
            case 1: price = 0.5;
                    break;
            case 2: price = 0.6;
                    break;
            case 3: price = 0.72;
                    break;
            case 4: price = 0.9;
                    break;
            case 5: price = 1.4;
                    break;
        }
    }
    // *** Getters ***
    public int getHeight(){ // Return Height
        return this.height;
    }
    
    public int getLength(){ // Return Length
        return this.length;
    }
    
    public int getWidth(){ // Return Width
        return this.width;
    }
    
    public int getArea(){ // Returns area
        return  this.width * this.height * this.length;
    }
    
    public int getPercent(){ // Return total percent to be added to price
        return percent;
    }
    
    public double getBasePrice(){ // Get's the price of the box (grade price x area)
        return price * getArea();
    }
    
    public double getPercentCost(){ // Gets the percent value that should be added to the base price
        return (getBasePrice() / 100) * percent;
    }
    
    public double getTotalPrice(){ // Returns total cost (base price + percent cost) = total price
        return getPercentCost() + getBasePrice();
    }
    
    // This abstract method will be required by all children as it will be used to take into account if percent will need to be increase due...
    // to sealtops as well as to initilize the base percentage multiplyer for that speisific type of box
    protected abstract void setupPercent();
    
    public abstract void printType();
}
