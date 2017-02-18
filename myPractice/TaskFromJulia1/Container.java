package myPractice.TaskFromJulia1;


import java.util.*;

public class Container implements List<Item> {

    private int size;
    private Item[] elements;

    public Container(int size) {
        this.size = size;
        this.elements = new Item[size];
    }

    public Container() {
        this.size = 0;
        this.elements = new Item[size];
    }
    public int getSize(){
        return size;
    }

    public Item[] getElements() {
        return elements;
    }

    public void setElements(Item[] elements) {
        this.elements = elements;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (this.size == 0){
            return false;
        }
        for(Item item : this.elements){
            if (item.equals(o)){
                return true;
            }
        }return false;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ItemIterator(this);
    }

    @Override
    public Object[] toArray() {
        Object[] allElements = new Objects[0];
        for(Item item : this.elements){
            if(item != null){
                allElements = Arrays.copyOf(allElements, allElements.length + 1);
                allElements[allElements.length - 1] = item;
            }
        }
        return allElements;
    }

    @Override
    public <Item> Item[] toArray(Item[] a) {
        if (this.size == 0){
            return null;
        }
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if( this.elements[i] != null && count < a.length){
                a[count] = (Item) this.elements[i];
            }
            else if(this.elements[i] != null && count == a.length){
                a = Arrays.copyOf(a, a.length + 1);
                a[count] = (Item) this.elements[i];
            }
        }
        return a;
    }

    @Override
    public boolean add(Item item) {
        if(!(item instanceof Item) || item.equals(null)){
            return false;
        }
        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
        this.elements[this.elements.length + 1] = item;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if(o.equals(elements[i])){
                int numMoved = elements.length - i - 1;
                if (numMoved > 0){
                    System.arraycopy(elements, i + 1, elements, i, numMoved);
                }
                elements[elements.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for(Object element : elements){
            element = null;
        }
    }

    @Override
    public Item get(int index) {
        return elements[index];
    }

    @Override
    public void add(int index, Item element) {
        if (index > elements.length || index < 0){
            return;
        }
        elements[index] = element;
    }

    @Override
    public Item set(int index,Item element) {
        if (index > elements.length || index < 0){
            throw new IndexOutOfBoundsException("index is out");
        }
        Item tmp =elements[index];
        elements[index] = element;
        return tmp;
    }

    @Override
    public Item remove(int index) {
        if (index > elements.length || index < 0){
            throw new IndexOutOfBoundsException("index is out");
        }
        Item tmp = elements[index];
        this.remove(elements[index]);
        return tmp;
    }


    @Override
    public int indexOf(Object o) {
        if(o == null){
            throw new NullPointerException("it's null");
        }
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if(o == null){
            throw new NullPointerException("it's null");
        }
        for (int i = elements.length - 1; i > -1 ; i--) {
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }


    /**
     *  I don't know how to work with collections yet. So now i'm not override all net methods.
     *
     *
     *
     *
     *
     *
     *
     *
     * Returns <tt>true</tt> if this list contains all of the elements of the
     * specified collection.
     *
     * @param c collection to be checked for containment in this list
     * @return <tt>true</tt> if this list contains all of the elements of the
     * specified collection
     * @throws ClassCastException   if the types of one or more elements
     *                              in the specified collection are incompatible with this
     *                              list
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified collection contains one
     *                              or more null elements and this list does not permit null
     *                              elements
     *                              (<a href="Collection.html#optional-restrictions">optional</a>),
     *                              or if the specified collection is null
     * @see #contains(Object)
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator (optional operation).  The behavior of this
     * operation is undefined if the specified collection is modified while
     * the operation is in progress.  (Note that this will occur if the
     * specified collection is this list, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
     *                                       is not supported by this list
     * @throws ClassCastException            if the class of an element of the specified
     *                                       collection prevents it from being added to this list
     * @throws NullPointerException          if the specified collection contains one
     *                                       or more null elements and this list does not permit null
     *                                       elements, or if the specified collection is null
     * @throws IllegalArgumentException      if some property of an element of the
     *                                       specified collection prevents it from being added to this list
     * @see #add(Object)
     */
    @Override
    public boolean addAll(Collection<? extends Item> c) {
        return false;
    }

    /**
     * Inserts all of the elements in the specified collection into this
     * list at the specified position (optional operation).  Shifts the
     * element currently at that position (if any) and any subsequent
     * elements to the right (increases their indices).  The new elements
     * will appear in this list in the order that they are returned by the
     * specified collection's iterator.  The behavior of this operation is
     * undefined if the specified collection is modified while the
     * operation is in progress.  (Note that this will occur if the specified
     * collection is this list, and it's nonempty.)
     *
     * @param index index at which to insert the first element from the
     *              specified collection
     * @param c     collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
     *                                       is not supported by this list
     * @throws ClassCastException            if the class of an element of the specified
     *                                       collection prevents it from being added to this list
     * @throws NullPointerException          if the specified collection contains one
     *                                       or more null elements and this list does not permit null
     *                                       elements, or if the specified collection is null
     * @throws IllegalArgumentException      if some property of an element of the
     *                                       specified collection prevents it from being added to this list
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       (<tt>index &lt; 0 || index &gt; size()</tt>)
     */
    @Override
    public boolean addAll(int index, Collection<? extends Item> c) {
        return false;
    }


    /**
     * Removes from this list all of its elements that are contained in the
     * specified collection (optional operation).
     *
     * @param c collection containing elements to be removed from this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>removeAll</tt> operation
     *                                       is not supported by this list
     * @throws ClassCastException            if the class of an element of this list
     *                                       is incompatible with the specified collection
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if this list contains a null element and the
     *                                       specified collection does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
     *                                       or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this list all of its elements that are not contained in the
     * specified collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>retainAll</tt> operation
     *                                       is not supported by this list
     * @throws ClassCastException            if the class of an element of this list
     *                                       is incompatible with the specified collection
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if this list contains a null element and the
     *                                       specified collection does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
     *                                       or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }






    /**
     * Inserts the specified element at the specified position in this list
     * (optional operation).  Shifts the element currently at that position
     * (if any) and any subsequent elements to the right (adds one to their
     * indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws UnsupportedOperationException if the <tt>add</tt> operation
     *                                       is not supported by this list
     * @throws ClassCastException            if the class of the specified element
     *                                       prevents it from being added to this list
     * @throws NullPointerException          if the specified element is null and
     *                                       this list does not permit null elements
     * @throws IllegalArgumentException      if some property of the specified
     *                                       element prevents it from being added to this list
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       (<tt>index &lt; 0 || index &gt; size()</tt>)
     */


    /**
     * Next 3 methods we can not overload (Julia said so :D )
     */
    @Override
    public ListIterator<Item> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Item> listIterator(int index) {
        return null;
    }

    @Override
    public List<Item> subList(int fromIndex, int toIndex) {
        return null;
    }


}

