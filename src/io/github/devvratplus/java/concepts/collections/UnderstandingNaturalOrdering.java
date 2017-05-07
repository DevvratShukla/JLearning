package io.github.devvratplus.java.concepts.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnderstandingNaturalOrdering {

	public static void main(String[] args) {
		List<MobileApps> listOfMobileApps = new ArrayList<MobileApps>();
		SortedSet<MobileApps> setOfMobileApps = new TreeSet<MobileApps>();

		
		addElement(listOfMobileApps);
		addElement(setOfMobileApps);
		
		//sorting the ArrayList
		Collections.sort(listOfMobileApps);
				
		showElement(listOfMobileApps);
		System.out.println();
		//TreeSet automatically sorts the set based on defined
		// natural order
		showElement(setOfMobileApps);
	}

	public static void addElement(Collection<MobileApps> someCollection) {

		someCollection.add(new MobileApps(1, "Inbox"));
		someCollection.add(new MobileApps(11, "WhatsApp"));
		someCollection.add(new MobileApps(4, "Instagram"));
		someCollection.add(new MobileApps(2, "Facebook"));
		someCollection.add(new MobileApps(99, "Webx"));
		someCollection.add(new MobileApps(9, "Dropbox"));

	}

	public static void showElement(Collection<MobileApps> someCollection) {
		for (MobileApps mobileApp : someCollection) {
			System.out.println(mobileApp);
		}
	}

}

class MobileApps implements Comparable<MobileApps> {
	private int serialNo;
	private String name;
	
	// enum that defines the natural order 
	SetNaturalOrder naturalOrder = SetNaturalOrder.SORT_BY_SERIALNO;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + serialNo;
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
		MobileApps other = (MobileApps) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (serialNo != other.serialNo)
			return false;
		return true;
	}

	public MobileApps(int serialNo, String name) {
		this.serialNo = serialNo;
		this.name = name;
	}

	public String toString() {
		return "[ " + serialNo + " : " + name + " ]";
	}

	@Override
	public int compareTo(MobileApps mobileApp) {

		switch (naturalOrder) {

		case SORT_BY_SERIALNO:
			if (serialNo > mobileApp.serialNo) {
				return 1;
			} else if (serialNo < mobileApp.serialNo) {
				return -1;
			} else {
				return 0;
			}

		case SORT_BY_STRING_LENGTH:
			if (name.length() > mobileApp.name.length()) {
				return 1;
			} else if (name.length() < mobileApp.name.length()) {
				return -1;
			} else {
				return name.compareTo(mobileApp.name);
			}

		case SORT_BY_ALPHA_ORDER:
			return name.compareTo(mobileApp.name);

		case SORT_BY_REVERSE_ALPHA_ORDER:
			return -name.compareTo(mobileApp.name);

		default:
			return 0;
		}
	}
}

enum SetNaturalOrder {
	 SORT_BY_SERIALNO,
	 SORT_BY_ALPHA_ORDER,
	 SORT_BY_REVERSE_ALPHA_ORDER,
	 SORT_BY_STRING_LENGTH 
}