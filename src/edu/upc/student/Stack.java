package edu.upc.student;

/**
 * Created by Muarc12 on 19/09/2016.
 */
public interface Stack <E> {
    public void push (E e) throws Fullstack;
    public E pop () throws Emptystack;
    public int size ();
}
