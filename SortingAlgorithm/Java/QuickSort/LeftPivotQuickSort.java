package QuickSort;

/**
 * This Quick sort is implemented with left element selected as the pivot
 * @see #qsort(int[] a, int lo, int hi)
 * 
 * @author kdgyun
 * 
 * @version 1.1.0
 * @since 1.0.0
 *
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.util.Comparator;
import Utils.Convert;
import Utils.Order;

/*
 * This Quick sort is implemented with right element selected as the pivot
 */

public class LeftPivotQuickSort {
	
	

	// ============= primitive type ============//

	/*
	 * ========================== 
	 *  sorting byte type array
	 * ==========================
	 */

	public static void sort(byte[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(byte[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	private static int partition(byte[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		byte pivot = a[left];	
		
		while(lo < hi) {
			
			while(a[hi] > pivot) --hi;
			while(a[lo] <= pivot && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;
	}
	
	private static void swap(byte[] a, int i, int j) {
		byte temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	

	/*
	 * ========================== 
	 *  sorting char type array
	 * ==========================
	 */

	public static void sort(char[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(char[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	private static int partition(char[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		char pivot = a[left];	
		
		while(lo < hi) {
			
			while(a[hi] > pivot) --hi;
			while(a[lo] <= pivot && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;
	}
	
	private static void swap(char[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	

	/*
	 * ========================== 
	 *  sorting short type array
	 * ==========================
	 */

	public static void sort(short[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(short[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	private static int partition(short[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		short pivot = a[left];	
		
		while(lo < hi) {
			
			while(a[hi] > pivot) --hi;
			while(a[lo] <= pivot && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;

	}
	
	private static void swap(short[] a, int i, int j) {
		short temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/*
	 * ========================== 
	 *  sorting int type array
	 * ==========================
	 */
	
	public static void sort(int[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(int[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}
		
		/*
		 * 
		 * [Process]
		 * 
		 * Before Partition:
		 *
		 *   a[left]          left part              right part
		 * +---------------------------------------------------------+
		 * |  pivot  |    element <= pivot    |    element > pivot   |
		 * +---------------------------------------------------------+
		 *    
		 *    
		 *  After Partition:
		 *  
		 *         left part          a[lo]          right part
		 * +---------------------------------------------------------+
		 * |   element <= pivot    |  pivot  |    element > pivot    |
		 * +---------------------------------------------------------+
		 *       
		 *       
		 *  result : pivot = lo     
		 *       
		 *
		 *  Recursion:
		 *  
		 * l_pivot_sort(a, lo, pivot - 1)     l_pivot_sort(a, pivot + 1, hi)
		 *  
		 *         left part                           right part
		 * +-----------------------+             +-----------------------+
		 * |   element <= pivot    |    pivot    |    element > pivot    |
		 * +-----------------------+             +-----------------------+
		 * lo                pivot - 1        pivot + 1                 hi
		 * 
		 */
		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	private static int partition(int[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		int pivot = a[left];	
		
		while(lo < hi) {
			
			while(a[hi] > pivot) --hi;
			while(a[lo] <= pivot && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	

	/*
	 * ========================== 
	 *  sorting long type array
	 * ==========================
	 */

	public static void sort(long[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(long[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	private static int partition(long[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		long pivot = a[left];	
		
		while(lo < hi) {
			
			while(a[hi] > pivot) --hi;
			while(a[lo] <= pivot && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;
	}
	
	private static void swap(long[] a, int i, int j) {
		long temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	

	/*
	 * ========================== 
	 *  sorting float type array
	 * ==========================
	 */

	public static void sort(float[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(float[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	private static int partition(float[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		float pivot = a[left];	
		
		while(lo < hi) {
			
			while(a[hi] > pivot) --hi;
			while(a[lo] <= pivot && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;
	}
	
	private static void swap(float[] a, int i, int j) {
		float temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	

	/*
	 * ========================== 
	 *  sorting double type array
	 * ==========================
	 */

	public static void sort(double[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(double[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	private static int partition(double[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		double pivot = a[left];	
		
		while(lo < hi) {
			
			while(a[hi] > pivot) --hi;
			while(a[lo] <= pivot && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}
		swap(a, left, lo);
		
		return lo;
	}
	
	private static void swap(double[] a, int i, int j) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	
	
	
	

	/*
	 * ========================== 
	 *  sorting Object type array
	 * ==========================
	 */

	public static <T> void sort(T[] a, Comparator<? super T> c) {
		if(c == null) {
			sort(a);
		}
		else {
			qsort(a, 0, a.length - 1, c);
		}
	}
	
	public static void sort(Object[] a) {
		qsort(a, 0, a.length - 1);
	}
	

	private static void qsort(Object[] a, int lo, int hi) {
		

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi);	
		
		qsort(a, lo, pivot - 1);
		qsort(a, pivot + 1, hi);
	}
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static int partition(Object[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		Comparable pivot = ((Comparable) a[left]);	
		
		while(lo < hi) {

			while(pivot.compareTo(a[hi]) < 0) --hi;
			while(pivot.compareTo(a[lo]) >= 0 && lo < hi) ++lo;
			
			swap(a, lo, hi);
		}

		swap(a, left, lo);
		
		return lo;
	}
	


	private static <T> void qsort(T[] a, int lo, int hi, Comparator<? super T> c) {

		if(lo >= hi) {
			return;
		}

		int pivot = partition(a, lo, hi, c);	
		
		qsort(a, lo, pivot - 1, c);
		qsort(a, pivot + 1, hi, c);
	}
	

	private static <T> int partition(T[] a, int left, int right, Comparator<? super T> c) {
		
		int lo = left;
		int hi = right;
		T pivot = a[left];
		
		while(lo < hi) {

			while(c.compare(pivot, a[hi]) < 0) --hi;
			while(c.compare(a[lo], pivot) <= 0 && lo < hi) ++lo;

			swap(a, lo, hi);
		}

		swap(a, left, lo);
		
		return lo;
	}
	
	
	
	
	
	private static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	

	/*
	 * ========================== 
	 *  reverse ordering
	 * ==========================
	 */
	
	
	public static void sort(byte[] a, boolean isReverse) {
		if(isReverse) {
			Byte[] b = Convert.toByteArray(a);
			sort(b, Order.reverseOrder());
			Convert.tobyteArray(b, a);
		}
		else {
			sort(a);
		}
	}
	
	public static void sort(char[] a, boolean isReverse) {
		if(isReverse) {
			Character[] b = Convert.toCharacterArray(a);
			sort(b, Order.reverseOrder());
			Convert.tocharArray(b, a);
		}
		else {
			sort(a);
		}
	}
	
	public static void sort(short[] a, boolean isReverse) {
		if(isReverse) {
			Short[] b = Convert.toShortArray(a);
			sort(b, Order.reverseOrder());
			Convert.toshortArray(b, a);
		}
		else {
			sort(a);
		}
	}
	
	public static void sort(int[] a, boolean isReverse) {
		if(isReverse) {
			Integer[] b = Convert.toIntegerArray(a);
			sort(b, Order.reverseOrder());
			Convert.tointtArray(b, a);
		}
		else {
			sort(a);
		}
	}
	
	
	public static void sort(long[] a, boolean isReverse) {
		if(isReverse) {
			Long[] b = Convert.toLongArray(a);
			sort(b, Order.reverseOrder());
			Convert.tolongArray(b, a);
		}
		else {
			sort(a);
		}
	}
	
	public static void sort(float[] a, boolean isReverse) {
		if(isReverse) {
			Float[] b = Convert.toFloatArray(a);
			sort(b, Order.reverseOrder());
			Convert.toflostArray(b, a);
		}
		else {
			sort(a);
		}
	}
	
	public static void sort(double[] a, boolean isReverse) {
		if(isReverse) {
			Double[] b = Convert.toDoubleArray(a);
			sort(b, Order.reverseOrder());
			Convert.todoubleArray(b, a);
		}
		else {
			sort(a);
		}
	}
	
}
