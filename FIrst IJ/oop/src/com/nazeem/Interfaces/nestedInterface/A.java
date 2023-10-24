package com.nazeem.Interfaces.nestedInterface;

public class A {
    //nested interface
    //In nested interface the top level interface should be defined as Public or Default
    public interface NestedInterface{
        boolean isodd( int num);
    }
    // Whereas the nested one can Public, Private or Protected
}

class B implements A.NestedInterface{
    @Override
    public boolean isodd(int num) {
        return (num &1)==1;
    }
}