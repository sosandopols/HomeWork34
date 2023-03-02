package oop;

import java.util.ArrayList;
import java.util.List;

public class BouquetList {
    private List<bouquetOfFlowers> BouquetList = new ArrayList<>();
    public void addFlower(bouquetOfFlowers a){
        BouquetList.add(a);
    }
    public void bouquetPrintf(){

        for(bouquetOfFlowers bouquetOfFlowers:BouquetList)
            System.out.println(bouquetOfFlowers.toString());
    }
    public void getTotalPrice(){

        double totalPrice=0;
        for(bouquetOfFlowers bouquetOfFlowers:BouquetList)
            totalPrice+= bouquetOfFlowers.getPrice();
        System.out.println("Total price  of the bouquet " + totalPrice);
    }
    public void findFlower(double a,double b){
        System.out.printf("flowers in lengths range (%f,%f)\n",a,b);
        for(bouquetOfFlowers bouquetOfFlowers:BouquetList)
            if(a<bouquetOfFlowers.getLengths() && b>bouquetOfFlowers.getLengths())
                System.out.println(bouquetOfFlowers.getName());

    }

}
