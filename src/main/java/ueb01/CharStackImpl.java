package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private Element first = null;
    private Element it;

    @Override
    public void push(char c) {
       first = new Element (c, first);
    }

    @Override
    public char pop(){
        if (first == null){
            throw new NoSuchElementException ("keine Elemente vorhanden");
        } else {
            it = first;
            first = it.next;
            return it.value;
        }
    }

    @Override
    public int size() {
        it = first;
        int i = 0;

        while (it != null){
            i++;
            it = it.next;
        }
        return i;
    }
}
