package listaCircularDoble;

public class nodoDC {

    private String name;
    private int age;
    private nodoDC next, prev;

    public nodoDC() {
        this.name = "";
        this.age = 0;
        this.next = null;
        this.prev = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public nodoDC getNext() {
        return next;
    }

    public void setNext(nodoDC next) {
        this.next=next;
    }

    public nodoDC getPrev() {
        return prev;
    }

    public void setPrev(nodoDC prev) {
        this.prev=prev;
    }

}
