package io.aguru.exercise;

public class Rational {

	private int numerator;
	private int denominator;

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		if(denominator != 0 ){
			this.denominator = denominator;
		}
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if(denominator != 0 ){
			this.denominator = denominator;
		}
	}

	public void printDecimal() {
		System.out.println(numerator / denominator);
	}

	public void printFraction() {
		System.out.println(numerator + "/" + denominator);
	}

	public double addRational(Rational r1, Rational r2) {
		int a = r1.getNumerator();
		int b = r1.getDenominator();
		int c = r2.getNumerator();
		int d = r2.getDenominator();
		return ((a * d + b * c) / (b * d));
	}

	public double subRational(Rational r1, Rational r2) {
		int a = r1.getNumerator();
		int b = r1.getDenominator();
		int c = r2.getNumerator();
		int d = r2.getDenominator();
		return ((a * d - b * c) / (b * d));
	}

	public double mulRational(Rational r1, Rational r2) {
		int a = r1.getNumerator();
		int b = r1.getDenominator();
		int c = r2.getNumerator();
		int d = r2.getDenominator();
		return ((a * c) / (b * d));
	}

	public double divRational(Rational r1, Rational r2) {
		int a = r1.getNumerator();
		int b = r1.getDenominator();
		int c = r2.getNumerator();
		int d = r2.getDenominator();
		return ((a * d) / (b * c));
	}

	public boolean equals(Rational r) {
		int a = this.getNumerator();
		int b = this.getDenominator();
		int c = r.getNumerator();
		int d = r.getDenominator();
		if ((a * d) == (b * c)) {
			return true;
		} else {
			return false;
		}
	}
}