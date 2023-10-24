package com.nazeem.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

     BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);  //calling the parent class constructor
        //used to initialise the values present in parent class

//        System.out.println(super.weight); // directly Calling the weight property present in Superclass
        this.weight = weight;   // this.weight will call the weight property present in subclass
    }

    BoxWeight( double side, double weight){
        super(side);
        this.weight=weight;
    }

    BoxWeight(BoxWeight old){
        this.weight= old.weight;
    }


}
