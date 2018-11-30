package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.IrregularIBounce;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        iBounceBehavior =  new IrregularIBounce();
        iDeflateBehavior = new Deflatable();
        type = "American Football ball";
    }

}
