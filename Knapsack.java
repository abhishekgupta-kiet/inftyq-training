Knapsack algo 

class Knapsack {
	static int max(int a, int b)
	{
	return (a > b) ? a : b;
	}
                static int knapSack(int W, int wt[], int val[], int n)
	{
		// Base Case
		if (n == 0 || W == 0)
			return 0;
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);
		
		else
			return max(val[n - 1]
					+ knapSack(W - wt[n - 1], wt,
								val, n - 1),
					knapSack(W, wt, val, n - 1));
	}

	public static void main(String args[])
	{
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
}
Unbounded knapsack
class Knapsack {
	static int max(int a, int b) { return (a > b) ? a : b; }
	static int unboundedKnapsack(int W, int wt[], int val[],int idx)
	{
		if (idx == 0) {
			return (W / wt[0]) * val[0];
		}
		int notTake
			= 0 + unboundedKnapsack(W, wt, val, idx - 1);
		int take = Integer.MIN_VALUE;
		if (wt[idx] <= W) {
			take = val[idx]
				+ unboundedKnapsack(W - wt[idx], wt, val,
									idx);
		}
		return max(take, notTake);
	}
	public static void main(String args[])
	{
		int W = 100;
		int val[] = { 10, 30, 20 };
		int wt[] = { 5, 10, 15 };
		int n = val.length;
		System.out.println(
			unboundedKnapsack(W, wt, val, n - 1));
	}
}
Output-300
 

Longest Common Subsequence algo
1.	Suppose X and Y are the two given sequences  
2.	Initialize a table of LCS having a dimension of X.length * Y.length  
3.	XX.label = X  
4.	YY.label = Y  
5.	LCS[0][] = 0  
6.	LCS[][0] = 0  
7.	Loop starts from the LCS[1][1]  
8.	Now we will compare X[i] and Y[j]  
9.	   if X[i] is equal to Y[j] then  
10.	     LCS[i][j] = 1 + LCS[i-1][j-1]  
11.	     Point an arrow LCS[i][j]  
12.	Else  
13.	   LCS[i][j] = max(LCS[i-1][j], LCS[i][j-1])  
MATRIX CHAIN MULTIPLICATION
Begin   -  define table minMul of size n x n, initially fill with all 0s
   for length := 2 to n, do
      fir i:=1 to n-length, do
         j := i + length – 1
         minMul[i, j] := ∞
         for k := i to j-1, do
            q := minMul[i, k] + minMul[k+1, j] + array[i-1]*array[k]*array[j]
            if q < minMul[i, j], then minMul[i, j] := q
         done
   done
   done
   return minMul[1, n-1]
End
Longest Increasing Subsequence 
class LIS {
	static int max_ref; // stores the LIS
	static int _lis(int arr[], int n)
	{
		if (n == 1)
			return 1;
		int res, max_ending_here = 1;

		/* Recursively get all LIS ending with arr[0],
		arr[1] ... arr[n-2]. If arr[i-1] is smaller
		than arr[n-1], and max ending with arr[n-1] needs
		to be updated, then update it */
		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;
		return max_ending_here;
	}

	static int lis(int arr[], int n)
	{
	
		max_ref = 1;

		
		_lis(arr, n);

		// returns max
		return max_ref;
	}

	
	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n)
						+ "\n");
	}
}


