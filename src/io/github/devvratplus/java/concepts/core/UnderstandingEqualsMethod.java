package io.github.devvratplus.java.concepts.core;

public class UnderstandingEqualsMethod {

	public static void main(String[] args) {

		Money m1 = new Money(91, "India");
		Money m2 = new Money(44, "UK");
		Money m3 = new Money(91, "India");
		Money m4 = m1;

		System.out.println("m1.equals(m2) >" + m1.equals(m2));
		System.out.println("m1.equals(m3) >" + m1.equals(m3));

		// this only check whether two variables are pointing to the same object
		System.out.println("m1 == m2 >" + (m1 == m2));
		System.out.println("m1 == m4 >" + (m1 == m4));

	}

}

class Money {
	private int countryCode;
	private String countryName;

	public Money(int countryCode, String countryName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Money [countryCode=" + countryCode + ", countryName="
				+ countryName + "]";
	}

	@Override
	public int hashCode() { // unique ids for each object
		final int prime = 31;
		int result = 1;
		result = prime * result + countryCode;
		result = prime * result
				+ ((countryName == null) ? 0 : countryName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (countryCode != other.countryCode)
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}

}