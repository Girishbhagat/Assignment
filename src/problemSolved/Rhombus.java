//Program to find the Left Side and Right Side Rhombus
/*  ******     Right side Rhombus
 *    ******
 *      ******
 *        ******
 *        
 *         ******   Left side Rhombus 
 *        ******
 *      ******
 *    ******    
 * 
 */
package problemSolved;

public class Rhombus {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < 7; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for (int i = 1; i < 5; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < 7; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
