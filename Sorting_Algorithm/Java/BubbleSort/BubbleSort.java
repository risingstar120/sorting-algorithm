package BubbleSort;


/**
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */


import java.util.Comparator;

public class BubbleSort {
	
	//============= primitive type ============//
	
	
	/*==========================
	 * sorting byte type array 
	 *==========================*/
	
	public static void sort(byte[] a) {
		sort(a, a.length);
	}
	
	private static void sort(byte[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			
			for(int j = 0; j < size - i; j++) {
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(byte[] a, int i, int j) {
		byte temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	/*==========================
	 * sorting char type array 
	 *==========================*/
	
	public static void sort(char[] a) {
		sort(a, a.length);
	}
	
	private static void sort(char[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			
			for(int j = 0; j < size - i; j++) {
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(char[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	/*==========================
	 * sorting short type array 
	 *==========================*/
	
	public static void sort(short[] a) {
		sort(a, a.length);
	}
	
	private static void sort(short[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			
			for(int j = 0; j < size - i; j++) {
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(short[] a, int i, int j) {
		short temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	/*==========================
	 * sorting int type array 
	 *==========================*/
	
	public static void sort(int[] a) {
		sort(a, a.length);
	}
	
	private static void sort(int[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			
			for(int j = 0; j < size - i; j++) {
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	/*==========================
	 * sorting long type array 
	 *==========================*/
	
	public static void sort(long[] a) {
		sort(a, a.length);
	}
	
	private static void sort(long[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			
			for(int j = 0; j < size - i; j++) {
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(long[] a, int i, int j) {
		long temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	//============= Object type ============//
	
	
	/*==========================
	 * sorting Object type array 
	 *==========================*/
	
	public static void sort(Object[] a) {
		sort(a, a.length);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void sort(Object[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			
			for(int j = 0; j < size - i; j++) {
				if(((Comparable)a[j + 1]).compareTo(a[j]) < 0) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
	
	/*==========================
	 * sorting Object type array 
	 *==========================*/
	
	public static <T> void sort(T[] a, Comparator<? super T> c) {
		if(c == null) {
			sort(a, a.length);
		}
		else {
			sort(a, a.length, c);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void sort(Object[] a, int size, Comparator c) {
		
		for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			
			for(int j = 0; j < size - i; j++) {
				if(c.compare(a[j + 1], a[j]) < 0) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
}