package com.iteso.factory.stores;
import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.Menudo;
import com.iteso.factory.pozoles.PozolePescado;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/27/13
 * Time: 7:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class PescadoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new PozolePescado();
        return pozole;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
