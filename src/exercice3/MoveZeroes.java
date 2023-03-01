/**
 *  Exercice 3 : Déplacer Tous Les Zéros
 * Instructions
 * Étant donné un tableau de nombres aléatoires, Poussez tous les zéros d'un tableau donné à la fin du tableau. Par exemple,
 * si le tableau donné est {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
 * il doit être remplacé par {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 * L'ordre de tous les autres éléments doit être le même. La complexité temporelle attendue est O(n)et l'espace supplémentaire est O(1).
 *
 * Exemple:
 *
 * JAVA
 * Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
 * Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
 *
 * Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
 * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 *
 *
 * Il peut y avoir plusieurs façons de résoudre ce problème. Voici une manière simple et intéressante de résoudre ce problème.
 * Parcourez le tableau donné 'arr' de gauche à droite. Lors de la traversée, maintenez le nombre d'éléments non nuls dans le tableau.
 * Laissez le compte être 'compte'. Pour chaque élément différent de zéro arr[i], placez l'élément à 'arr[count]' et incrémentez 'count'.
 * Après une traversée complète, tous les éléments non nuls ont déjà été déplacés vers l'avant et 'count' est défini comme index du premier 0.
 * Maintenant, tout ce que nous devons faire est d'exécuter une boucle qui rend tous les éléments nuls de 'count' jusqu'à la fin de le tableau.
 */


package exercice3;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        
        while (count < n) {
            nums[count++] = 0;
        }
    }
	
}
