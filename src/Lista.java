public class Lista {
    private Object[] elements;
    private int size;
    private int capacity;

    public Lista(){
    capacity = 5;
    elements = new Object[capacity];
    size=0;
    }
    public Lista(int capacity){
        this.capacity=capacity;
        elements= new Object[capacity];
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
return (size==0);
    }
    public void print(){
        if (size == 0) {
            System.out.println("lista vazia");
        }else {
            System.out.println("inicio");
            for (int i =0; i<size;i++){
                System.out.println(elements[i]);
            }
            System.out.println("fim");
        }
    }
    public boolean add(Object element){
        aumenteCapacidadeSeNecessario();
        elements[size]= element;
        size++;
        return true;
    }

    private void aumenteCapacidadeSeNecessario() {
        if (size==capacity){
            Object[] newElements= new  Object[capacity*=2];
            for (int i = 0; i < size; i++) {
                newElements[i]=elements[i];
                elements=newElements;
            }
        }
    }

    public void add (int index, Object element){
        if (index<0 || index>size-1)
            throw new IndexOutOfBoundsException("index="+index+"size="+size);

        aumenteCapacidadeSeNecessario();
        for (int i = size; i >index; i++)
            elements[i]=elements[i-1];
        elements[index]=element;
        size++;

    }
    public Object get(int index){
    if (index<0 || index>size-1)
        throw new IndexOutOfBoundsException("index="+index+"size="+size);
    else {
        return elements[index];
    }
    }
    public int indexOf(Object element){
        for (int i = 0; i < size; i++)
            if (elements[i].equals(element))
                return i;
        return -1;

    }
    public boolean remove(Object element){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)){
                elements[i]=elements[i+1];
                size--;
                return true;
            }
        }
   return false;
    }
    public Object remove(int index){
        if (index<0 || index>size-1)
            throw new IndexOutOfBoundsException("index="+index+"size="+size);
        for (int i = 0; i < size; i++) {
            if (i==index){
               elements[i]= elements[i+1];
                size--;
                return elements;
            }
        }
        return elements;
    }
    public void clear(){
        for (int i = 0; i <size; i++)
            elements[i]=null;
        size=0;

    }
}
