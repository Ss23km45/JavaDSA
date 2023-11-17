package custom;

import java.util.Arrays;

public class MyArrayList {
    private int size = 0;

    private static final int default_size = 10;

    private static final int Capacity = 10;

    private Object[] myObject;

    public MyArrayList(){
        super();
        myObject = new Object[default_size];
    }

    public Object add(Object o){



        if(size >= Capacity){
            increseSize();
            myObject[size] = o;
            size++;
        }

        if(size<Capacity) {
            myObject[size] = o;
            size++;
        }

        return o;
    }

    private void increseSize() {
        Object[] objects = new Object[default_size*2];
        for (int i=0;i<myObject.length;i++) {
            objects[i] = myObject[i];
        }

        myObject = objects;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        int chat=0;
        for (int i = 0; i < size; i++) {
            sb.append(myObject[i] + ",");
            chat=i;
        }
        sb.deleteCharAt(sb.toString().length()-1);

        sb.append("]");

        return sb.toString();
    }

    public int length() {
        return size;
    }

    public Object get(int i){
        return myObject[i];
    }

    public Object append(Object obj, int position){

            insert(obj, position);
        return obj;
    }

    private void insert(Object obj, int position) {
        if(size<Capacity) {
           increseSize();
        }


        if( (size>position)){
            for (int i = size; i > position; i--) {
                myObject[i] = myObject[i-1];
            }
            myObject[position] = obj;
            size++;

        }
    }

    public boolean isEmpty(){
        return size==0;
    }

    private boolean contains(Object obj, int start, int end) {
       if(obj == null){
           return false;
       }
        for (int i = 0; i < size; i++) {
            if(myObject[i] == obj){
                return true;
            }
        }

        return false;
    }

    public Object delete(Object obj){
        int k = 0 ;
        boolean isfound= false;
        for (int i = 0; i < size-1; i++) {
            if(myObject[i] == obj){
                k = i;
                isfound = true;
                myObject[i] = myObject[i+1];
            } else if ((i > k) && isfound) {
                myObject[i] = myObject[i+1];
            }
        }

        size--;
        return  obj;
    }

    public int search(Object obj){
        for (int i = 0; i < size-1; i++) {
            if (myObject[i] == obj) {
                return i;
            }
        }

        return -1;
    }
}
