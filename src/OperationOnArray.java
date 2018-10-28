import java.util.*; 
/**
 * This is a simple program of array merging
 * Two array sizes are given
 * You are asked to fill up the array between 0 and 50
 * Sort the arrays with built in functions
 * Then merge the two sorted arrays in such a way that 
 * every elements are sorted and you can not use the built in 
 * function
 * @author Asif
 *
 */
public class OperationOnArray 
{ 
	public static void main (String[] args) 
	{ 
		int n=5;
		int m=8;
		int[] array1 = new int[n]; 
		//filling the array
		for(int i=0;i<array1.length;i++) {
			array1[i]=getRandomNumber(50);
		}
		Arrays.sort(array1);// sorting the array using built in function
		int length1=array1.length; 
	
		int[] array2=new int[m]; 
		for(int i=0;i<array2.length;i++) {
			array2[i]=getRandomNumber(50);
		}
		Arrays.sort(array2);
		int length2=array2.length; 
	
		int[] array3 = new int[n+m]; 
		System.out.print("Array1 is: ");
		for(int i=0;i<array1.length;i++) {
		System.out.print(array1[i]+" ");
		}
		System.out.println();
		System.out.print("Array2 is: ");
		for(int i=0;i<array2.length;i++) {
		System.out.print(array2[i]+" ");
		}
		System.out.println(); 
		mergeTwoSortedArrays(array1,array2,array3,length1,length2);
	
		System.out.println("Array after merging After merging: "); 
		for (int i=0; i < array3.length; i++) 
			System.out.print(array3[i] + " "); 
	}
	/**
	 * Merging of two sorted arrays is done here
	 * @param array1
	 * @param array2
	 * @param array3
	 * @param length1
	 * @param length2
	 */
	private static void mergeTwoSortedArrays(int[] array1, int[] array2, int[] array3, 
			int length1, int length2) {
		int x = 0, y = 0, z = 0; 
	      
        // Traverse each of the array 
        while (x<length1 && y <length2) 
        { 
            if (array1[x] < array2[y]) {
                array3[z] = array1[x];
                z++;
                x++;
            }
            else {
                array3[z] = array2[y];
                z++;
                y++;
                } 
        } 
      
        // Store rest of the elements from the first array 
        while (x < length1) {
            array3[z] = array1[x];
            z++;
            x++;
        }
        // Store rest of the elements from the second array
        while (y < length2) {
            array3[z] = array2[y];
            z++;
            y++;
	}
        }

	/**
	 * Random number generation part is here
	 * @param i
	 * @return
	 */
	private static int getRandomNumber(int i) {
		Random rn=new Random();
		int x=rn.nextInt((i-0)+1)+0;
		return x;
	} 
} 

