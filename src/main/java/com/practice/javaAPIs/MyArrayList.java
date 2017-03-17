package com.practice.javaAPIs;
class MyArrayList<E>{

    Object[] array;
    
    int size = 0;
    
    int cursor;
    
    final int INITIAL_SIZE = 16;
    
    MyArrayList(){
        array = new Object[INITIAL_SIZE];
    }
    
    MyArrayList(int startSize){
        array = new Object[startSize];
    }
    
    void add(E el){
        ensureCapacity();
        array[cursor++]=el;
        size++;
    }
    
    void put(E el, int index){
        ensureCapacity();
        array[index]=el;
    }
    
    @SuppressWarnings("unchecked")
	E get(int index){
        validate(index);
        return (E) array[index];
    }
    
    /**
    * do nothing if index in invalid
    */
    void delete(int index){
        if(index <0)
            return;
    }
    
    void delete(E el){
        delete(getIndex(el));
    }
    
    /**
    * returns first occurrence of the el in the array
    */
    int getIndex(E el){
        for(int i=0;i<array.length;i++){
            if(el.equals(array[i]))
                return i;
        }
        return -1;
    }
    
    void ensureCapacity(){
        if (cursor+1>=size){
            int currLength = array.length;
            Object[] newArray = new Object[currLength*2];
            System.arraycopy(array, 0, newArray, 0, currLength);
            array = newArray;
        }
    }
    
    void validate(int index){
        if(index>size)
        	throw new IndexOutOfBoundsException("");
    }
}