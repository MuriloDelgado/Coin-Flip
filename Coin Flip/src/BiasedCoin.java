import java.util.*;

public class BiasedCoin implements MyCoinInterface{
    
    private final int HEADS = 0;
    private final int TAILS = 1;
    private double bias;
    Random rand = new Random();
    
    private double face;
    
    // Constructor
    public BiasedCoin(){
        bias = 0.5;
        flip();
    }
    
    // Constructor with parameter to change bias of coin
    public BiasedCoin(double unfair){
        if (unfair <=1) 
            bias = unfair;
        else
            bias = 0.5;
        flip();
    }
    
    // Coin flip method
    @Override
    public void flip(){
        face = Math.random();
        
        if (face <= bias) // Checks flip compared to bias
            face = HEADS; // If greater than, coin is heads
        else
            face = TAILS; // If less than coin is tails
    }
    
    // Method to determine if coin flip is heads
    @Override
    public double isHeads(){
        return face;
    }
    
    // To string method for object
    @Override
    public String toString(){
        String faceName;
        
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        
        return faceName;
    }
}
