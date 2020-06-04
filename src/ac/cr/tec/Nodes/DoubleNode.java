package ac.cr.tec.Nodes;

import java.util.Objects;

public class DoubleNode<T extends Comparable> {
    private T Storage;
    private DoubleNode<T> Front;
    private DoubleNode<T> Back;
    public DoubleNode(T info){
        this.Storage=info;
        this.Front=null;
        this.Back=null;
    }
    public void setStorage(T info){
        this.Storage=info;
    }
    public void setFront(DoubleNode<T> node){
        this.Front=node;
    }
    public void setBack(DoubleNode<T> node){
        this.Back=node;
    }

    public T getStorage() {
        return Storage;
    }

    public DoubleNode<T> getFront() {
        return Front;
    }

    public DoubleNode<T> getBack() {
        return Back;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "Storage=" + Storage +
                ", Front=" + Front +
                ", Back=" + Back +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleNode<?> that = (DoubleNode<?>) o;
        return Storage.equals(that.Storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Storage, Front, Back);
    }
}
