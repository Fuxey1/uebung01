package ueb01;

public class Element {
    char value;
    Element next;

    Element(char v, Element e) {
        value = v;
        next = e;
    }
}
