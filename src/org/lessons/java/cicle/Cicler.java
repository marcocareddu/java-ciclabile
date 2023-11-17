package org.lessons.java.cicle;

public class Cicler {
    private int[] elements;
    private int index;

//  Constructor 1
    public Cicler(int[] array) {
        this.elements = array;
        this.index = -1;
    }

//  Constructor 2
    public Cicler() {
        this.elements = new int[0];
        this.index = -1;
    }

//  Getters
    public int getNextElement() {
        this.index++;
        if (this.index >= this.elements.length) {
            this.index = 0;
        }
        return this.elements[this.index];
    }

//  Methods
    public boolean hasMoreElements() {
        return index < elements.length-1;
    }
}
