package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int DEFAULT_RETURN_VALUE = -1;

	private static final int EMPTY_RHYMER_INDICATOR = -1;

	private static final int MAX_NUMBERS_COUNT = 12;

	private static final int COUNT_WHEN_FULL = MAX_NUMBERS_COUNT - 1;

	private int[] numbers = new int[MAX_NUMBERS_COUNT];

	private int total = EMPTY_RHYMER_INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_RHYMER_INDICATOR;
	}

	public boolean isFull() {
		return total == COUNT_WHEN_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return numbers[total--];
	}

}
