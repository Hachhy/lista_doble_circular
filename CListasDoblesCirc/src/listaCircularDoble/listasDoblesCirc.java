package listaCircularDoble;

import java.util.Random;

public class listasDoblesCirc {

    private final Random r = new Random();
    private nodoDC first, last;
    private int size;

    public listasDoblesCirc() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public int randomNumber() {
        int randomNumber = (int) r.nextInt(50) + 10;
        return randomNumber;
    }

    public void addxFirst(String n) {
        nodoDC newElement = new nodoDC();
        newElement.setName(n);
        newElement.setAge(randomNumber());
        if (isEmpty()) {
            first = newElement;
            last = newElement;
        } else {
            newElement.setNext(first);
            newElement.setPrev(last);
            first.setPrev(newElement);
            last.setNext(newElement);
            first = newElement;
        }
        size++;
        System.out.println("Dato insertado al inicio");
    }

    public void addxLast(String n) {
        nodoDC newElement = new nodoDC();
        newElement.setName(n);
        newElement.setAge(randomNumber());
        if (isEmpty()) {
            first = newElement;
            last = newElement;
        } else {
            newElement.setNext(first);
            newElement.setPrev(last);
            first.setPrev(newElement);
            last.setNext(newElement);
            last = newElement;
        }
        size++;
        System.out.println("Dato insertado al final");

    }

    public void showList() {
        if (!isEmpty()) {
            nodoDC aux = first;
            System.out.println("");
            do {
                System.out.print(aux.getName() + "(" + aux.getAge() + ")" + "| ");
                aux = aux.getNext();
            } while (aux != first);
            System.out.println("");
            aux = last;
            do {
                System.out.print(aux.getName() + "(" + aux.getAge() + ")" + "| ");
                aux = aux.getPrev();
            } while (aux != last);
            System.out.println("");
        } else {
            emptyLine();
        }

    }

    public void removexFirst() {
        if (!isEmpty()) {
            if (first == last) {
                first = null;
                last = null;
            }
            nodoDC aux = first;
            last.setNext(aux.getNext());
            first = aux.getNext();
            first.setPrev(last);
            System.out.println("Eliminado: " + aux.getName() + aux.getAge());
            showList();
        } else {
            emptyLine();
        }

    }

    public void search(String n) {
        nodoDC aux = last;
        do {
            if (aux.getName().equalsIgnoreCase(n)) {
                System.out.println("Dato encontrado: " + aux.getName() + aux.getAge());
                return;
            }
            aux = aux.getPrev();
        } while (aux != last);
        System.out.println("Dato no encontrado");
    }

    public void editName(String n, String nn, int age) {
        nodoDC aux = last;
        do {
            if (aux.getName().endsWith(n)) {
                System.out.println("\nDato encontrado: " + aux.getName() + aux.getAge());
                System.out.println("Dato modificado: " + nn + age);
                aux.setName(nn);
                aux.setAge(age);
                showList();
                return;
            }
            aux = aux.getPrev();
        } while (aux != last);
        System.out.println("Dato no encontrado");
    }

    public void sortList() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                nodoDC aux = first, aux2 = aux.getNext();
                String auxName;
                do {
                    if (aux.getName().compareToIgnoreCase(aux2.getName()) > 0) {
                        auxName = aux.getName();
                        aux.setName(aux2.getName());
                        aux2.setName(auxName);
                    }
                    aux = aux2;
                    aux2 = aux2.getNext();
                } while (aux2 != first);
            }
            showList();
        } else {
            emptyLine();
        }

    }

    public boolean isEmpty() {
        return first == null;
    }

    void emptyLine() {
        System.out.println("La lista esta vacia");
    }

    int getSize() {
        return size;
    }

}
