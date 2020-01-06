package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > checkIn())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//wiersze 5 12 14 17
//komenda ta zmienia klasy
//alt + ← i alt + → umozliwia przelaczanie sie pomiedzy otwartymi klasami