/**
 *  Exercice 1 : Archiver Des Fichiers
 * Instructions
 * Utilisez un fichier manifeste existant ' mymanifest' et archivez tous les fichiers du foo/répertoire dans ' classes.jar'
 */

package exercice1;

import java.io.IOException;

public class CreateJarFile {
	
	public static void main(String[] args) throws IOException {
        // La commande shell à exécuter pour créer l'archive JAR
        String command = "jar cfm classes.jar mymanifest -C foo/ .";
        
        // Exécuter la commande dans un processus shell
        Process process = Runtime.getRuntime().exec(command);
        
        // Utiliser la sortie du processus si nécessaire
        // ...
        
        // Attendre la fin du processus si nécessaire
        // process.waitFor();
    }

}
