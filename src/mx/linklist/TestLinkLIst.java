package mx.linklist;

/**
 * Created by admin on 2/10/15.
 */
class Nodo {

  private int data;
  private Nodo next;

  public Nodo() {
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Nodo getNodo() {
    return this.next;
  }

  public void setNodo(Nodo next) {
    this.next = next;
  }

  public String toString() {
    return "" + data;
  }
}

class LinkedList {
  private Nodo root;

  public LinkedList() {
    root = null;
  }

  public void addElement(int data) {
    //caso para el nodo raiz
    if (root == null) {
      root = new Nodo();
      root.setData(data);
    } else {
      Nodo temporal = root.getNodo();
      Nodo temporal2 = root;
      while (temporal != null) {
        temporal2 = temporal;
        temporal = temporal.getNodo();
      }
      temporal = new Nodo();
      temporal.setData(data);
      temporal2.setNodo(temporal);
    }
  }

  public Nodo findMiddle() {

    Nodo middle = null;
    int contador = 0;
    Nodo temporal = root;
    while (temporal != null) {
      contador++;
      if (contador % 2 == 0) { // si es elemento par
        if (middle == null) { //el caso para el primer conteo
          middle = root;
        } else {
          middle = middle.getNodo();
        }
      }
      temporal = temporal.getNodo();
    }

    return middle;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    if (root != null) {
      Nodo temporal = root;
      sb.append(temporal.getData());
      while (temporal.getNodo() != null) {
        temporal = temporal.getNodo();
        sb.append("," + temporal.getData());
      }
      sb.append(".");
    } else {
      sb.append("No elements in the list");
    }
    return sb.toString();
  }
}

public class TestLinkLIst {

  public static void main(String[] args) {

    LinkedList lista = new LinkedList();
    lista.addElement(5);
    lista.addElement(1);
    lista.addElement(4);
    lista.addElement(3);
    lista.addElement(13);
    lista.addElement(15);
    lista.addElement(17);


    Nodo middle = lista.findMiddle();

    System.out.println(middle);
    System.out.println(lista);
  }
}