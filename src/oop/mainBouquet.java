package oop;

public class mainBouquet {
    public static void main(String[] args) {

        rose rose1 = new rose("rose1",250,"red", true, 150,3);
        rose rose2 = new rose("rose2",300,"white", true, 150,3);
        rose rose3 = new rose("rose3",300,"white", true, 200,2);
        peonie peonie1 = new peonie("peonie1",500,"orange", false, 150,3);
        peonie peonie2 = new peonie("peonie2",700,"pink", true, 150,0);
        peonie peonie3 = new peonie("peonie3",950,"grey", false, 200,1);
        gladiolus gladiolus1 = new gladiolus("gladiolus1",200,"white", true, 100,3);
        gladiolus gladiolus2 = new gladiolus("gladiolus2",150,"red", true, 100,2);
        gladiolus gladiolus3 = new gladiolus("gladiolus3",200,"blue", false, 100,1);

        BouquetList bouquetList=new BouquetList();
        bouquetList.addFlower(rose1);
        bouquetList.addFlower(rose2);
        bouquetList.addFlower(rose3);

        bouquetList.addFlower(peonie1);
        bouquetList.addFlower(peonie2);
        bouquetList.addFlower(peonie3);

        bouquetList.addFlower(gladiolus1);
        bouquetList.addFlower(gladiolus2);
        bouquetList.addFlower(gladiolus3);

        bouquetList.bouquetPrintf();

        bouquetList.getTotalPrice();//цена за букет

        bouquetList.findFlower(50,110); // диапазон длины стебеля
        //  bouquetList. sortByFreshness();


    }
}