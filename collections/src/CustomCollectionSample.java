import java.util.Iterator;

public class CustomCollectionSample {

  public static void main(String[] args) {
    CustomCollection<Property> propertyCollection =  new CustomCollection<>();
    propertyCollection.add(new Property("name","prabhakaran"));
    propertyCollection.add(new Property("id","1144"));
    propertyCollection.add(new Property("email","prss0001@sync.com"));
    /*Iterator<Property> propertyIterator = propertyCollection.iterator();
    while (propertyIterator.hasNext()) {
      Property property = propertyIterator.next();
      System.out.println("KEY:"+property.key+",VALUE:"+property.value);
    }*/
    propertyCollection.forEach(property -> System.out.println("KEY:"+property.key+",VALUE:"+property.value));
  }

  static class Property {
    String key;
    String value;

    public Property(String key, String value) {
      this.key = key;
      this.value = value;
    }

    public String getKey() {
      return key;
    }

    public void setKey(String key) {
      this.key = key;
    }

    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }
  }
}

class CustomCollection<E> implements Iterable<E> {

  Object[] elements = {};

  @Override
  public Iterator<E> iterator() {
    return new CustomerIterator<E>();
  }

  public void add(E element) {
    Object[] tempElements = new Object[this.elements.length+1];
    /*for (int i=0;i<this.elements.length;i++) {
      tempElements[i] = this.elements[i];
    }*/
    System.arraycopy(this.elements,0,tempElements,0,this.elements.length);
    tempElements[this.elements.length] = element;
    this.elements = tempElements;
  }

  private class CustomerIterator<E> implements Iterator<E> {

    int cursor = -1;

    @Override
    public boolean hasNext() {
      return (this.cursor+1) < CustomCollection.this.elements.length;
    }

    @Override
    public E next() {
      this.cursor++;
      return (E)CustomCollection.this.elements[this.cursor];

    }
}


}
