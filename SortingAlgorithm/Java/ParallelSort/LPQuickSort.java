package ParallelSort;

import java.util.Comparator;
import java.util.concurrent.RecursiveTask;

import Utils.Convert;
import Utils.Order;

public class LPQuickSort {

	final static int THRESHOLD = 1 << 13;
	
	
	// ============= primitive type ============//

	/*
	 * ========================== 
	 *  sorting byte type array
	 * ==========================
	 */

	public static void sort(byte[] a) {
		new ParLPQuickByte(a, 0, a.length - 1).invoke();
	}
	

	private static final class ParLPQuickByte extends RecursiveTask<Void> {


		private static final long serialVersionUID = 1L;
		final byte[] a;
		final int lo;
		final int hi;
		
		ParLPQuickByte(byte[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickByte left = new ParLPQuickByte(a, lo, pivot - 1);
				ParLPQuickByte right = new ParLPQuickByte(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
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
	}

	
	

	/*
	 * ========================== 
	 *  sorting char type array
	 * ==========================
	 */

	public static void sort(char[] a) {
		new ParLPQuickChar(a, 0, a.length - 1).invoke();
	}
	


	private static final class ParLPQuickChar extends RecursiveTask<Void> {

		private static final long serialVersionUID = 1L;
		final char[] a;
		final int lo;
		final int hi;
		
		ParLPQuickChar(char[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickChar left = new ParLPQuickChar(a, lo, pivot - 1);
				ParLPQuickChar right = new ParLPQuickChar(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
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
	}
	
	
	

	/*
	 * ========================== 
	 *  sorting short type array
	 * ==========================
	 */

	public static void sort(short[] a) {
		new ParLPQuickShort(a, 0, a.length - 1).invoke();
	}
	

	private static final class ParLPQuickShort extends RecursiveTask<Void> {


		private static final long serialVersionUID = 1L;
		final short[] a;
		final int lo;
		final int hi;
		
		ParLPQuickShort(short[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickShort left = new ParLPQuickShort(a, lo, pivot - 1);
				ParLPQuickShort right = new ParLPQuickShort(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
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
	}

	
	
	
	
	
	/*
	 * ========================== 
	 *  sorting int type array
	 * ==========================
	 */
	
	public static void sort(int[] a) {
		new ParLPQuickInt(a, 0, a.length - 1).invoke();
		
	}
	
	private static final class ParLPQuickInt extends RecursiveTask<Void> {

		private static final long serialVersionUID = 1L;
		final int[] a;
		final int lo;
		final int hi;
		
		ParLPQuickInt(int[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickInt left = new ParLPQuickInt(a, lo, pivot - 1);
				ParLPQuickInt right = new ParLPQuickInt(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
		}
		
		private static void qsort(int[] a, int lo, int hi) {	

			if(lo >= hi) {
				return;
			}
			
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
	}

	

	
	
	

	/*
	 * ========================== 
	 *  sorting long type array
	 * ==========================
	 */

	public static void sort(long[] a) {
		new ParLPQuickLong(a, 0, a.length - 1).invoke();
	}
	
	private static final class ParLPQuickLong extends RecursiveTask<Void> {

		private static final long serialVersionUID = 1L;
		final long[] a;
		final int lo;
		final int hi;
		
		ParLPQuickLong(long[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickLong left = new ParLPQuickLong(a, lo, pivot - 1);
				ParLPQuickLong right = new ParLPQuickLong(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
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
	}
	

	/*
	 * ========================== 
	 *  sorting float type array
	 * ==========================
	 */

	public static void sort(float[] a) {
		new ParLPQuickFloat(a, 0, a.length - 1).invoke();
	}
	
	private static final class ParLPQuickFloat extends RecursiveTask<Void> {

		private static final long serialVersionUID = 1L;
		final float[] a;
		final int lo;
		final int hi;
		
		ParLPQuickFloat(float[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickFloat left = new ParLPQuickFloat(a, lo, pivot - 1);
				ParLPQuickFloat right = new ParLPQuickFloat(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
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
	}
	
	
	
	
	

	/*
	 * ========================== 
	 *  sorting double type array
	 * ==========================
	 */

	public static void sort(double[] a) {
		new ParLPQuickDouble(a, 0, a.length - 1).invoke();
	}
	

	private static final class ParLPQuickDouble extends RecursiveTask<Void> {

		private static final long serialVersionUID = 1L;
		final double[] a;
		final int lo;
		final int hi;
		
		ParLPQuickDouble(double[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickDouble left = new ParLPQuickDouble(a, lo, pivot - 1);
				ParLPQuickDouble right = new ParLPQuickDouble(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
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
			new ParLPQuickDComparator(a, 0, a.length - 1, c).invoke();
		}
	}
	
	public static void sort(Object[] a) {
		new ParLPQuickDComparable(a, 0, a.length - 1).invoke();
	}
	
	private static final class ParLPQuickDComparable extends RecursiveTask<Void> {

		private static final long serialVersionUID = 1L;
		final Object[] a;
		final int lo;
		final int hi;
		
		ParLPQuickDComparable(Object[] a, int lo, int hi) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1);
				qsort(a, pivot + 1, hi);
			}

			else {
				ParLPQuickDComparable left = new ParLPQuickDComparable(a, lo, pivot - 1);
				ParLPQuickDComparable right = new ParLPQuickDComparable(a, pivot + 1, hi);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
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
		
		private static void swap(Object[] a, int i, int j) {
			Object temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	

	
	private static final class ParLPQuickDComparator extends RecursiveTask<Void> {

		private static final long serialVersionUID = 1L;
		final Object[] a;
		final int lo;
		final int hi;
		final Comparator<?> c;
		
		ParLPQuickDComparator(Object[] a, int lo, int hi, Comparator<?> c) {
			this.a = a;
			this.lo = lo;
			this.hi = hi;
			this.c = c;
		}
		
		public final Void compute() {

			if(lo >= hi) {
				return null;
			}
			int pivot = partition(a, lo, hi, c);	
			if(hi - lo < THRESHOLD) {
				
				
				qsort(a, lo, pivot - 1, c);
				qsort(a, pivot + 1, hi, c);
			}

			else {
				ParLPQuickDComparator left = new ParLPQuickDComparator(a, lo, pivot - 1, c);
				ParLPQuickDComparator right = new ParLPQuickDComparator(a, pivot + 1, hi, c);
				
				left.fork();
				right.fork();
				left.join();
				right.join();
			}
			
			
			return null;
		}
		


		@SuppressWarnings("rawtypes")
		private static void qsort(Object[] a, int lo, int hi, Comparator c) {

			if(lo >= hi) {
				return;
			}

			int pivot = partition(a, lo, hi, c);	
			
			qsort(a, lo, pivot - 1, c);
			qsort(a, pivot + 1, hi, c);
		}
		

		@SuppressWarnings({ "rawtypes", "unchecked" })
		private static int partition(Object[] a, int left, int right, Comparator c) {
			
			int lo = left;
			int hi = right;
			Object pivot = a[left];
			
			while(lo < hi) {

				while(c.compare(pivot, a[hi]) < 0) --hi;
				while(c.compare(a[lo], pivot) <= 0 && lo < hi) ++lo;

				swap(a, lo, hi);
			}

			swap(a, left, lo);
			
			return lo;
		}
		
		

		private static void swap(Object[] a, int i, int j) {
			Object temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
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
