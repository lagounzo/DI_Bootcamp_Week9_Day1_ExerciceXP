/**
 * Exercice 4 : Réorganiser Le Tableau
 * Instructions
 * Réorganiser le tableau de sorte que les positions paires soient supérieures aux impaires
 *
 * Étant donné un tableau A de n éléments, triez le tableau selon les relations suivantes :
 *
 * A[i] >= A[i-1] , if i is even, ∀ 1 <= i <= n
 * A[i] <= A[i-1] , if i is odd , ∀ 1 <= i <= n
 * Imprimez le tableau résultant.
 *
 * Exemples :
 *
 * JAVA
 * Input : A[] = {1, 2, 2, 1}
 * Output :  1 2 1 2
 * Explanation :
 * For 1st element, 1  1, i = 2 is even.
 * 3rd element, 1  1, i = 4 is even.
 *
 * Input : A[] = {1, 3, 2}
 * Output : 1 3 2
 * Explanation :
 * Here, the array is also sorted as per the conditions.
 * 1  1 and 2 < 3.
 */


package exercice4;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        rearrangeArray(A);
        System.out.println(Arrays.toString(A));
    }
    
    public static void rearrangeArray(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && A[i] < A[i - 1]) {
                // swap A[i] and A[i-1]
                int temp = A[i];
                A[i] = A[i - 1];
                A[i - 1] = temp;
            }
            else if (i % 2 != 0 && A[i] > A[i - 1]) {
                // swap A[i] and A[i-1]
                int temp = A[i];
                A[i] = A[i - 1];
                A[i - 1] = temp;
            }
        }
    }
}
