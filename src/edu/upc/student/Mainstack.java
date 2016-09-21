package edu.upc.student;

/**
 * Created by Muarc12 on 19/09/2016.
 */
public class Mainstack {
    public static void main (String[] args) {
        Stack <Integer> s = new StackImpl<Integer>(10);
        try{
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);
            s.push(7);
            s.push(8);
            s.push(9);
            s.push(10);
            s.push(11);
        }
        catch(Fullstack e){
            System.out.println(e.getMessage());
        }
        try{
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        }
        catch(Emptystack e){
            System.out.println(e.getMessage());
        }

    }

}
