package com.nazeem.Inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

     BoxPrice() {
         super();
        this.cost = -1;
    }

    BoxPrice ( BoxPrice other){
         super( other);
         this.cost= other.cost;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super( side, weight);
        /* Here this super will call the super in Class BoxWeight
           and assign the code to the object

           Then similarly the super in BoxWeight will call another for
           Class Box and assign the Weight to the object

           and the side will be assigned in Class Box by Constructor with
           side argument which will be called by super in BoxWeight
         */
        this.cost = cost;


//        This order of calling Super of classes is/ will moves in upward direction of classes
    }


}
