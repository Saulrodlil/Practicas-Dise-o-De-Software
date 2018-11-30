package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class TacoBase extends Taco {
    public TacoBase(){
        description = "Taco normal";
    }
    @Override
    public double cost() {
        return 8.00;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
