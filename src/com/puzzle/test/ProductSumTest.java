package com.puzzle.test;

import com.puzzle.ProductSum;

import java.math.BigInteger;

public class ProductSumTest {



    public static void main(String[] args) {

        ProductSum productSum = new ProductSum();

        // for simple problem where n = 5 and c = 2
        long startTime = System.currentTimeMillis();
        long n = 5,c=2;
        BigInteger sum = productSum.calculateSumOfProducts(n, c);
        System.out.println("sum of productElements for n = " + n + " and c = " + c + " is " + sum);
        System.out.println("Total time taken for n = " + n + " and c = " + c + " is " +
                (System.currentTimeMillis() - startTime)/1000 + " seconds\n" );


        // for simple problem where n = 100 and c = 10
        startTime = System.currentTimeMillis();
        n =100;c=10;
        sum = productSum.calculateSumOfProducts(n, c);
        System.out.println("sum of productElements for n = " + n + " and c = " + c + " is " + sum);
        System.out.println("Total time taken for n = " + n + " and c = " + c + " is " +
                (System.currentTimeMillis() - startTime)/1000 + " seconds\n" );


        // problem with larger data where n = 1000000 and c = 200
        startTime = System.currentTimeMillis();
        n =1000000;c=200;
        sum = productSum.calculateSumOfProducts(n, c);
        System.out.println("sum of productElements for n = " + n + " and c = " + c + " is " + sum);
        System.out.println("Total time taken for n = " + n + " and c = " + c + " is " +
                (System.currentTimeMillis() - startTime)/1000 + " seconds\n" );
        // 4876116127317978755731357827750324258198152034112500967562513636619100036936684812989451641586872711144897223910945432996565260927444970434341751181069846806035413935036849768233333056995297839546987556514137209634510462520098420637699122339150135182336136343710133666277873058791705786865172269505137348053072138083039879594822827363049313266638167969278996668128689537007027256375312439259756963378414674923338559662872664630830473868844780514858035026724948605282302145282924362435477685770948854908568552575590262317036471687656087729795369566602222613158544956594630758919558839490389685877537107146938624305312410352805240021534303354075104449242854817709239419566186643324364485619839724438068872130809826576025107299021708751358587712196989115611745764936650199174040410120012977020177891702305788835974404793078619886693921589490810020682287541450768124222593617753502950448413400068069839575506281609611700039096644528048520573952064700692432979185292498572446344530804462471767505921755829674711688765439056157222401212017883032535501314332340039385928056085145060700217900637020812413411308610121928026123701441848386741142775717387490509972541107994804323593105039052556442336528920420940313


        // problem with larger data where n = 10000000 and c = 200
        startTime = System.currentTimeMillis();
        n =10000000;c=200;
        sum = productSum.calculateSumOfProducts(n, c);
        System.out.println("sum of productElements for n = " + n + " and c = " + c + " is " + sum);
        System.out.println("Total time taken for n = " + n + " and c = " + c + " is " +
                (System.currentTimeMillis() - startTime)/1000 + " seconds\n" );

    }
}
