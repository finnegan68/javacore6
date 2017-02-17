package myPractice.TaskFromJulia1;


import java.util.Iterator;
import java.util.NoSuchElementException;


public class ItemIterator implements Iterator<Item> {
    Container myContainer;

    int cursor;
    int lastReturnedElement;

    public ItemIterator(Container myContainer) {
        this.myContainer = myContainer;
        this.cursor = 0;
        this.lastReturnedElement = -1;
    }

    @Override
    public boolean hasNext() {
        return cursor != myContainer.getSize();
    }

    @Override
    public Item next() {
        if(this.hasNext()) {
            cursor++;
            lastReturnedElement++;
            return myContainer.get(cursor);
        }
        else if(cursor >= myContainer.getSize()){
            throw new NoSuchElementException();
        }
        cursor = 0; //Here if we have not next element, we must return our cursor back to the start
        lastReturnedElement = -1;
        return null; //I don't know what to return here.Can u help me?
    }

    @Override
    public void remove() {
        if (lastReturnedElement < 0){
            throw new IllegalStateException();
        }
        Container newContainer = new Container(myContainer.size() - 1);
        for (int i = 0; i < myContainer.size(); i++) {
            if(i != lastReturnedElement) {
                newContainer.add(myContainer.get(i));
            }continue;
        }
        myContainer.setElements(newContainer.getElements());
        myContainer.setSize(myContainer.getSize());
    }
}