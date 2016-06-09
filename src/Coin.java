import java.util.*;

public class Coin{   
    
    public static void main(String[] args){
        BiasedCoin Coin1, Coin2, Coin3;
        int flipCount = 0;
        int Coin1Count = 0, Coin2Count = 0, Coin3Count = 0;
        double bias2, bias3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Enter bias for second Coin: ");
        bias2 = scan.nextDouble();
        
        System.out.println ("Enter bias for third Coin: ");
        bias3 = scan.nextDouble();
        
        
        Coin1 = new BiasedCoin(); // Fair coin
        Coin2 = new BiasedCoin(bias2); // A little unfair coin
        Coin3 = new BiasedCoin(bias3); // Always head coin
        
        while (flipCount < 100){
            Coin1.flip();
            Coin2.flip();
            Coin3.flip();
            
            if (Coin1.isHeads() == 0)
                Coin1Count++; // Adding up how many heads for coin 1
            
            if (Coin2.isHeads() == 0)
                Coin2Count++; // Adding up how many heads for coin 2
            
            if (Coin3.isHeads() == 0)
                Coin3Count++; // Adding up how many heads for coin 3
            
            flipCount++;                
        }
        
        System.out.println ("The first coin flipped heads " + Coin1Count + " times");       
        System.out.println();
        System.out.println ("The second coin flipped heads " + Coin2Count + " times");
        System.out.println();
        System.out.println ("The third coin flipped heads " + Coin3Count + " times");
        System.out.println();
        
    }
}
