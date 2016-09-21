package edu.upc.student;

/**
 * Created by Muarc12 on 19/09/2016.
 */
public class StackImpl<E> implements Stack<E> {

    private E[] elems;
    private int p;

    public StackImpl (int length) {
        this.elems = (E[]) new Object[length];
    }

    @Override
    public void push(E e) throws Fullstack {
        if (p>10) throw new Fullstack();
        this.elems[this.p++] = e;

        //System.out.print("push"+e);
    }

    @Override
    public E pop() throws Emptystack {
        if (p<1) throw new Emptystack();
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
