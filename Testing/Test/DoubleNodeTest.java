package Test;

import ac.cr.tec.Nodes.DoubleNode;
import org.junit.Assert;
import org.junit.Test;

public class DoubleNodeTest {

    @Test
    public void setStorage() {
    }

    @Test
    public void setFront() {
    }

    @Test
    public void setBack() {
    }

    @Test
    public void GetSetStorage() {
        int i=67;
        DoubleNode<Integer> node=new DoubleNode<>(44);
        node.setStorage(i);
        int p=node.getStorage();
        Assert.assertEquals(i,p);
    }

    @Test
    public void SetGetFront() {
        DoubleNode<Integer> node1=new DoubleNode<>(55);
        DoubleNode<Integer> node2=new DoubleNode<>(55);
        node1.setFront(node2);
        Assert.assertEquals(node2,node1.getFront());
    }

    @Test
    public void getBack() {
        DoubleNode<Integer> node1=new DoubleNode<>(55);
        DoubleNode<Integer> node2=new DoubleNode<>(55);
        node1.setBack(node2);
        Assert.assertEquals(node2,node1.getBack());
    }
}