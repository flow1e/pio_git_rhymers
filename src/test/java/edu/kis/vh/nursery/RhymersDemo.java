package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static final int SIZE1 = 15;
    public static final int SIZE2 = 3;
    public static final int BOUND = 20;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = testRhymers(factory);

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[SIZE2]).reportRejected());

    }

    private static DefaultCountingOutRhymer[] testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};

        for (int i = 1; i < SIZE1; i++)
            for (int j = 0; j < SIZE2; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < SIZE1; i++)
            rhymers[3].countIn(rn.nextInt(BOUND));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        return rhymers;
    }

}