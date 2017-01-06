// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr.Haddad
// Assignment: 14

public class MyInteger {
	
	// data field
	private int value;
	
	// constructor for specified int value
	public MyInteger(int value) {
		this.value = value;
	}

	// getter that returns value
	public int getValue() {
		return value;
	}
	
	// no-args
	public boolean isEven() {
        return (value % 2) == 0;
    }

    public boolean isOdd() {
        return (value % 2) == 1;
    }

    public boolean isPrime() {
        if (value % 2 == 0) {
        	return false;
        }
        for (int i = 3; i * i < value; i += 2) {
        	if (value % i == 0) {
            	return false;
            }
        }
        return true;
    }
	
    // args
	public static boolean isEven(int myValue) {
		return (myValue % 2) == 0;
	}
	
	public static boolean isOdd(int myValue) {
		return (myValue % 2) == 1;
	}
	
	public static boolean isPrime(int myValue) {
		if (myValue == 1 || myValue == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myValue; i++) {
                if (i % myValue == 0) return false;
            }
        }
        return true;
	}
	
	public static boolean isEven(MyInteger integer) {
		return integer.isEven();
	}
	
	public static boolean isOdd(MyInteger integer) {
		return integer.isOdd();
	}
	
	public static boolean isPrime(MyInteger integer) {
		return integer.isPrime();
	}
	
	// returns true if value equals integer
	public boolean equals(int integer) {
        if (integer == value) 
            return true;
        return false;
    }

	// returns true if value equals another value
    public boolean equals(MyInteger integer) {
        if (integer.value == this.value) 
            return true;
        return false;
    }
    
    // changes array of chars to integer
    public static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    // changes string to integer
    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
