package defaultt;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
public class abscla1<E> extends AbstractCollection<E> {
// Underlying storage
private ArrayList<E> elements;
public abscla1() {
elements = new ArrayList<>();
}
// Required method 1: add element
@Override
public boolean add(E e) {
return elements.add(e);
}
// Required method 2: return number of elements
@Override
public int size() {
return elements.size();
}
// Required method 3: return iterator for traversal
@Override
public Iterator<E> iterator() {
return elements.iterator();}
//Optional: just to visualize
public static void main(String[] args) {
abscla1<String> myList = new abscla1<>();
myList.add("Java");
myList.add("Python");
myList.add("C++");
System.out.println("Size: " + myList.size()); // 3
System.out.println("Elements:");
for (String lang : myList) {
System.out.println(lang);
}
}
}