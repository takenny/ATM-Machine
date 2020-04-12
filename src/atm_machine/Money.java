package atm_machine;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class Money {
private Map<Integer, Integer> bills = new TreeMap<Integer, Integer>();
	
	public Money() {
		bills.put(1, 0);
		bills.put(2, 0);
		bills.put(5, 0);
		bills.put(10, 0);
		bills.put(20, 0);
		bills.put(50, 0);
		bills.put(100, 0);
	}
	
	public Money(Map<Integer, Integer> bills) {
		this.bills = bills;
	}
	
	public void updateMoney(int billValue, int amount) {
		if (bills.containsKey(billValue)) {
			bills.put(billValue, bills.get(billValue) + 1);
		} else {
			bills.put(billValue, amount);
		}
	}
	
	public void updateMoney(Map<Integer, Integer> bills) {
		for (Map.Entry<Integer, Integer> entry : bills.entrySet()) {
			updateMoney(entry.getKey().intValue(), entry.getValue().intValue());
		}
	}
	
	public double moneyToValue() {
		double total = 0;
		for (Map.Entry<Integer, Integer> entry : bills.entrySet()) {
			total += entry.getKey().intValue() * entry.getValue().intValue();
		}
		return total;
	}
	
	public void valueToMoney(double value) {
		Map<Integer, Integer> reverse = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		reverse.putAll(bills);
		int divides = 0;
		int amount = 0;
		for (Map.Entry<Integer, Integer> entry : reverse.entrySet()) {
			amount = entry.getKey().intValue();
			divides = (int) (value / amount);
			
			if (divides > 0) {
				reverse.put(entry.getKey(), entry.getValue().intValue() + divides);
				value -= amount*divides;
			}
		}
		bills.putAll(reverse);
	}
	
	public String toString() {
	  Map<Integer, Integer> reverse = new TreeMap<Integer, Integer>(Collections.reverseOrder());
	  reverse.putAll(bills);
    
	  String listing = "";
	  for (Map.Entry<Integer, Integer> entry : reverse.entrySet()) {
		  if (entry.getValue() > 0) {
			  listing += entry.getValue().toString() + " $" + entry.getKey().toString() + ", ";
		  }
	  }
	  listing = listing.substring(0, listing.lastIndexOf(','));
	  return listing.substring(0, listing.lastIndexOf(", ")+2) + "and " + listing.substring(listing.lastIndexOf(", ")+2);
  }
}
