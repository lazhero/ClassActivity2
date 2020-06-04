package ac.cr.tec.SortingAlgorithms;

import ac.cr.tec.Nodes.DoubleNode;

public class DoubleListSelectionSort<T extends Comparable>  extends  DoubleSorting<T>{
    @Override
    public void Sort() {
        if(List==null || List.getLen()<2)return;
        DoubleNode<T> temp=List.getNode(0);
        int reference=0;
        while(reference<List.getLen()-1){
            swap(temp,getMin(reference));
            reference++;
            temp=temp.getFront();
        }

    }
    private DoubleNode<T> getMin(int pos){
        DoubleNode Focus=List.getNode(pos);
        DoubleNode<T> Temp=Focus;
        for(;pos<List.getLen();pos++){
            if(Temp.getStorage().compareTo(Focus.getStorage())>0){
                Temp=Focus;
            }
            Focus=Focus.getFront();
        }
        return Temp;

    }

}
