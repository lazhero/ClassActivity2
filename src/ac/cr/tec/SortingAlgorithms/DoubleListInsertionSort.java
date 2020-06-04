package ac.cr.tec.SortingAlgorithms;

import ac.cr.tec.Nodes.DoubleNode;

public class DoubleListInsertionSort<T extends Comparable> extends DoubleSorting<T> {

    @Override
    public void Sort() {
        if(List==null || List.getLen()<2)return;
        int i=0;
        DoubleNode<T> Temp=List.getNode(0);
        DoubleNode<T> Header;
        while(i<List.getLen()){
            for(Header=Temp;Header.getBack()!=null && Header.getStorage().compareTo(Header.getBack().getStorage())<0;Header=Header.getBack()){
                swap(Header,Header.getBack());
            }
            i++;
            Temp=Temp.getFront();
        }

    }
}
