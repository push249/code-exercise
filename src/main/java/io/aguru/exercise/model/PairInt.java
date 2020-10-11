package io.aguru.exercise.model;

public class PairInt implements java.lang.Comparable<PairInt> {
	public int first;
	public int second;

	public PairInt(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int compareTo(PairInt pI) {
		if (Math.sqrt(Math.pow(this.first, 2) + Math.pow(this.second, 2)) < Math
				.sqrt(Math.pow(pI.first, 2) + Math.pow(pI.second, 2))) {
			return -1;
		} else if (Math.sqrt(Math.pow(this.first, 2) + Math.pow(this.second, 2)) > Math
				.sqrt(Math.pow(pI.first, 2) + Math.pow(pI.second, 2))) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		PairInt pI = (PairInt) o;
		if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
		if(this.first == pI.first && this.second == pI.second) {
			return true;
		}else {
			return false;
		}
		
	}

}