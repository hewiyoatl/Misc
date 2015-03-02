package mx.hashmap;

public class MyHashMap<V, E> {
  private static final int SIZE = 16;
  private Object[] table = new Object[SIZE];

  public MyEntry<V, E> get(V key) {
    int hash = key.hashCode() % SIZE;
    MyEntry<V, E> entry = (MyEntry<V, E>) table[hash];

    while(entry != null) {
      if(entry.key.equals(key)) {
        return entry;
      }

      entry = entry.next;
    }

    return null;
  }

  public void put(V key, E value) {
    int hash = key.hashCode() % SIZE;

    MyEntry<V, E> entry = (MyEntry<V, E>) table[hash];

    if(entry != null) {
      // we are trying to insert duplicate
      if(entry.key.equals(key)) {
        entry.value = value;
      }
      else {
        //traverse and insert new element;
        while(entry.next != null) {
          entry = entry.next;
        }
        MyEntry<V, E> oldEntry = new MyEntry<V, E>(key, value);
        entry.next = oldEntry;
      }
    }
    else {
      MyEntry<V, E> newEntry = new MyEntry<V, E>(key, value);
      table[hash] = newEntry;
    }
  }


  public static void main(String[] args) {
    MyHashMap<String, String> tmhm = new MyHashMap<String, String>();

    tmhm.put("Niranjan", "SMTS");
    tmhm.put("Ananth", "SSE");
    tmhm.put("Niranjan", "SMTS1");
    tmhm.put("Chandu", "SSE");

    MyEntry<String, String> e = tmhm.get("Niranjan");
    System.out.println("" + e.getValue());
  }
}

class MyEntry<V, E> {
  V key;
  E value;
  MyEntry<V, E> next;


  public MyEntry(V key, E value) {
    this.key = key;
    this.value = value;
  }

  public V getKey() {
    return key;
  }

  public void setKey(V key) {
    this.key = key;
  }

  public E getValue() {
    return value;
  }

  public void setValue(E value) {
    this.value = value;
  }

}

