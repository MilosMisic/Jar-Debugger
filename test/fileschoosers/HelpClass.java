/*
 * Copyrights EuroICC. All rights reserved.
 */
package fileschoosers;

import java.io.File;
import java.io.IOException;

/*
 * HelpClass.java
 *
 * Created on Oct 7, 2016, 9:33:28 AM
 *
 * @author Milos Misic
 */
public class HelpClass {

	public void switchFiles() {

		if (!oldFileDirectory.equals("") && !newFileDirectory.equals("")) {
			if (oldFileDirectory.startsWith("\"") && oldFileDirectory.endsWith("\"")) {
				oldFileDirectory = oldFileDirectory.substring(1, oldFileDirectory.length() - 1);
			}

			File[] oldFolder = new File(oldFileDirectory).listFiles();
			for (File f : oldFolder) {
				if (f.getName().equalsIgnoreCase(newFileName)) {
					f.delete();
					System.out.println("Deleted: " + f.getName());

				}
			}
			if (libsCheckBox.isSelected()) {
				File lib = new File(oldFileDirectory + "\\lib");

				if (!lib.exists()) {
					lib.mkdir();
					if (lib.exists())
						System.out.println("Created lib folder.");
				} else {
					if (oldFileDirectory.contains(" ")) {
						oldFileDirectory = '"' + oldFileDirectory + '"';
					}
					String deleteCommand = " & rmdir /s /q lib";
					ProcessBuilder deleteLibs = new ProcessBuilder("cmd.exe", "/c", "cd " + oldFileDirectory + deleteCommand);
					deleteLibs.redirectErrorStream(true);
					try {
						deleteLibs.start();
						System.out.println("Deleted lib folder.");
					} catch (IOException ex) {
						System.out.println("Process failed.");
					}
					if (!lib.exists()) {
						lib.mkdir();
					}
					if (oldFileDirectory.startsWith("\"") && oldFileDirectory.endsWith("\"")) {
						oldFileDirectory = oldFileDirectory.substring(1, oldFileDirectory.length() - 1);
					}
				}

				if (newFileName.contains(" ")) {
					newFileName = '"' + newFileName + '"';
				}
				if (oldFileDirectory.contains(" ")) {
					oldFileDirectory = '"' + oldFileDirectory + '"';
				}

				String command = " & copy " + newFileName + " " + oldFileDirectory;
				ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd " + newFileDirectory + command);
				builder.redirectErrorStream(true);
				try {
					builder.start();
				} catch (IOException ex) {
					System.out.println("Process failed.");
				}

				if (libsCheckBox.isSelected()) {
					if (oldFileDirectory.endsWith("\"")) {
						oldFileDirectory = oldFileDirectory.substring(0, oldFileDirectory.length() - 1) + "\\lib\"";
					}
					String libCommand = " & copy " + newFileDirectory + "\\lib" + " " + oldFileDirectory;
					ProcessBuilder libProcBuider = new ProcessBuilder("cmd.exe", "/c", "cd " + newFileDirectory + libCommand);
					libProcBuider.redirectErrorStream(true);
					try {
						libProcBuider.start();
					} catch (IOException ex) {
						System.out.println("Process failed.");
					}
					oldFileDirectory = oldFileDirectory.substring(0, oldFileDirectory.length() - 5) + "\"";
					System.out.println("Moving lib folder.");
				}
				System.out.println("Switching completed.");
			}
		} else {
			System.out.println("Select directories first!");
		}
	}

}
