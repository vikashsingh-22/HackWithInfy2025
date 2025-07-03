package GreedyApproach;
import java.util.*;
class item{
        int value , weight;
        item(int v , int w){
            value=v;
            weight=w;
        }
    }

public class Problem2_Fractional_Knapsack {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No Of Item :");
        int n=sc.nextInt();

        item[] items=new item[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter value and weight for item "+ (i+1) + ":");
            int v=sc.nextInt();
            int w=sc.nextInt();
            items[i]=new item(v, w);
        }

        System.out.println("Enter knapsack problem :");
        int capacity=sc.nextInt();

        Arrays.sort(items , (a , b) -> Double.compare(
            (double) b.value /b.weight ,
            (double) a.value / a.weight
            
        ));

        Double total_value=0.0;

        for(int i=0; i<items.length; i++){
            if(capacity >= items[i].weight){
                capacity-=items[i].weight;
                total_value+=items[i].value;
            }else{
                total_value+=items[i].value * (double) capacity/items[i].weight;
                break;
            } 
        }
        System.out.println("Maximum Value :"+ total_value);
    }
    
}
