package io.aguru.exercise.model;

public class FirstModel {

	private String str;
	private int i;
	private char c;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "FirstModel [str=" + str + ", i=" + i + ", c=" + c + "]";
	}

}