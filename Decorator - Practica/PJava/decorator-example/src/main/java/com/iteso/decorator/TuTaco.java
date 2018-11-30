package com.iteso.decorator;

import com.iteso.decorator.condiments.Cebolla;
import com.iteso.decorator.condiments.Cilantro;
import com.iteso.decorator.condiments.TortillaHarina;
import com.iteso.decorator.condiments.TortillaMaiz;
import com.iteso.decorator.condiments.meat.*;
import com.iteso.decorator.tacos.Burrito;
import com.iteso.decorator.tacos.Quesadilla;
import com.iteso.decorator.tacos.TacoBase;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class TuTaco {
    public static void main(String[] args){
        Taco taco = new TacoBase();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);

        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        Taco taco2 = new Burrito();

        taco2 = new TortillaHarina(taco2);
        taco2 = new Lengua(taco2);
        taco2 = new Sesos(taco2);

        taco2 = new Cilantro(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");

        Taco taco3 = new Quesadilla();

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        Taco taco4 = new TacoBase();

        taco4 = new TortillaMaiz(taco4);
        taco4 = new Cecina(taco4);
        taco4 = new Cebolla(taco4);

        System.out.println();
        System.out.println();
        System.out.println(taco4.getDescription());
        System.out.println("$" + taco4.cost() + " MXN");

    }
}
