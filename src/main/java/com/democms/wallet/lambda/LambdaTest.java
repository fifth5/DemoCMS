package com.democms.wallet.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Simon on 2015/11/10.
 */
public  class LambdaTest    implements InterfaceA{



    public static void main(String args[]){

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);


//        for (String player : players) {
//            System.out.print(player + "; ");
//        }

        players.forEach((player) -> System.out.println(player + "; "));

        new LambdaTest().testInterface();
//        players.forEach(System.out::println);


        players.forEach(i -> {
            System.out.print("hello world");
        });


    }

    @Override
    public void testInterface() {

        System.out.println(this.i);
    }

    public void testLambda(String m){
        System.out.println(m);

    }
}
