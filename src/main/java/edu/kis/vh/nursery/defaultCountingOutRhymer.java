package edu.kis.vh.nursery;


public class defaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int TOTAL = -1;
	public static final int FULLSIZE = 11;

	private int[] NUMBERS = new int[SIZE];
	public int total = TOTAL;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == TOTAL;
		}
		
			public boolean isFull() {
				return total == FULLSIZE;
			}
		
				protected int checkIn() {
					if (callCheck())
						return TOTAL;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return TOTAL;
						return NUMBERS[total--];
					}

}
