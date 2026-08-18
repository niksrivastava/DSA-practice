package OOP.Generics;

import java.util.Arrays;

// here t should either be a Number or its subclasses.
public class CustomGenericsArrayList<T> {
    
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList(int[] data){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        Object[] temp = new Object[data.length * 2];

        // copy the current item to the new array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }


    public static void main(String[] args) {
        
        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>(null);
        

        for (int i = 0; i < 14; i++) {
            list.add(i*2);
        }
        System.out.println(list);
    }
}
