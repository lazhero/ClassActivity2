package ac.cr.tec.SortingAlgorithms;

import ac.cr.tec.Nodes.DoubleNode;

public class DoubleListBubbleSort<T extends Comparable> extends DoubleSorting<T> {
    @Override
    public void Sort() {
        if(List==null || List.getLen()<=1)return;
        int reference=List.getLen()-1;
        DoubleNode<T> temp;
        T saved;
        while(reference>0){
            for(int i=0;i<reference;i++){
                temp=List.getNode(i);
                if(temp.getStorage().compareTo(temp.getFront().getStorage())>0){
                    swap(temp,temp.getFront());
                }
            }
            reference--;
        }



    }


}
