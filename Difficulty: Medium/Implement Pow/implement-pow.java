class Solution {
	double power(double b, int e) {
		// code here
		long exe = e;
		if (exe<0) {
			exe = -exe;
			b = 1/b;
		}
		
		return pow(b, exe);
	}
	
	static double pow(double b, long exe) {
		if (exe == 0) {
			return 1.0;
		}
		
		double half = pow(b, exe/2);
		
		if (exe%2 == 0) {
			return half*half;
		} else {
			return half*half*b;
		}
	}
}
