package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

    private final List<T> list;
    
    public OneListAcceptable(final List<T> list) {
        this.list = list;
    }
    
    @Override
    public Acceptor<T> acceptor() {
        
        return new AcceptorImpl<T>();
    }

}
