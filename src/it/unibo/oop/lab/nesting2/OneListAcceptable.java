package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

    private final List<T> list;
    
    public OneListAcceptable(final List<T> list) {
        this.list = list;
    }
    
    @Override
    public Acceptor<T> acceptor() {
        final Iterator<T> it = this.list.iterator();
        return new Acceptor<T>() {

            @Override
            public void accept(T newElement) throws ElementNotAcceptedException {
                try {
                    if(newElement.equals(it.next())) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                throw new Acceptor.ElementNotAcceptedException(newElement);
            }

            @Override
            public void end() throws Acceptor.EndNotAcceptedException {
                try {
                    if (!it.hasNext()) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("2" + e.getMessage());
                }
                throw new Acceptor.EndNotAcceptedException();
            }
            
            
        };
    }

}
