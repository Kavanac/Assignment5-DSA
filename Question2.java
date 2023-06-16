public class Question2 {
	
	    public static int arrangeCoins(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Input Number is invalid. Only positive numbers are allowed");
	        }

	        int mask = 1 << 15;
	        long result = 0;

	        while (mask > 0) {
	            long temp = result | mask;
	            long coinsFilled = temp * (temp + 1) / 2;
	            if (coinsFilled == n) {
	                return (int) temp;
	            }
	            if (coinsFilled < n) {
	                result = temp;
	            }
	            mask >>= 1;
	        }

	        return (int) result;
	    }
	    public static void main(String[] args)
		{
			int n=5;

			
			System.out.println(arrangeCoins(n));
			}
	}
	

