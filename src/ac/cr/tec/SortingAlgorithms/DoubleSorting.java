package ac.cr.tec.SortingAlgorithms;

import ac.cr.tec.LinkedList.DoubleList;
import ac.cr.tec.LinkedList.List;
import ac.cr.tec.Nodes.DoubleNode;
import org.jetbrains.annotations.NotNull;

public abstract class DoubleSorting<T extends Comparable> implements Sorting<T> {
    protected DoubleList<T> List;
    @Override
    public void setList(List<T> List) {
        if(List!=null){
            try{
                this.List=(DoubleList)List;
            }
            catch (Exception e){}
        }
    }
    @NotNull
    public void swap( DoubleNode<T> a, DoubleNode<T> b){
        T saved=a.getStorage();
        a.setStorage(b.getStorage());
        b.setStorage(saved);
    }

}
