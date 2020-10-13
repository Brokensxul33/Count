/* Title: Count
 * Date: 10/13/2020
 * Author: Luis Flores Cardoza 
 */

package lab11;

public class Count {

	public static void main(String[] args) {
		
		
		int[] counts = new int[10];
		
		for(int i = 1; i <= 100; i++) {
			int value = (int)(Math.random() * 10);
			counts[value]++;
			
		}
		
		System.out.println("Count for each number between 0 and 9: ");
		for(int i = 0; i < counts.length; i++) {
			System.out.println(i + "s: " + counts[i]);
		}
		

	}

}
