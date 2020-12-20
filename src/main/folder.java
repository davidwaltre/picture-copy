package main;

import java.util.Scanner;

public class folder {
	
	public static String getSrcFolder(Scanner srcFolderScanner) {
		
		String srcFolder;
		String srcFolderFinal = null;
		String srcFolderIsStandard;
		
		System.out.println("Give a source folder:");
		srcFolder = srcFolderScanner.nextLine()+"/";
		System.out.println("Is "+srcFolder+" correct? 'Yes' or 'No'");
		srcFolderIsStandard = srcFolderScanner.nextLine();
		
		if (srcFolderIsStandard.equalsIgnoreCase("Yes")) {
			srcFolderFinal = srcFolder;
			System.out.println("Folder set.");
		}
		else if (srcFolderIsStandard.equalsIgnoreCase("No")) {
			System.out.println("Give a source folder:");
			while (srcFolderFinal == null) {
				srcFolder = srcFolderScanner.nextLine()+"/";
				System.out.println("Is "+srcFolder+" correct? 'Yes' or 'No'");
				srcFolderIsStandard = srcFolderScanner.nextLine();
				if (srcFolderIsStandard.equalsIgnoreCase("Yes")) {
					srcFolderFinal = srcFolder;
					System.out.println("Folder set.");
				}
				else if (srcFolderIsStandard.equalsIgnoreCase("No")) {
					srcFolderFinal = null;
				}
			}
		}
		else {
			System.out.println("[ERROR] You didn't give a valid answer.");
			getSrcFolder(srcFolderScanner);
		}
		return srcFolderFinal;
	}
	
	public static String getToFolder(Scanner toFolderScanner) {
		String toFolder;
		String toFolderFinal = null;
		String toFolderRight;
		
		System.out.println("Give the destination folder:");
		toFolder = toFolderScanner.nextLine()+"/";
		System.out.println("Is "+toFolder+" correct? 'Yes' or 'No'");
		toFolderRight = toFolderScanner.nextLine();
		if (toFolderRight.equalsIgnoreCase("Yes")) {
			System.out.println("Folder set.");
			toFolderFinal = toFolder;
		}
		else if (toFolderRight.equalsIgnoreCase("No")) {
			getToFolder(toFolderScanner);
		}
		else {
			System.out.println("[ERROR] You didn't give a valid answer.");
			getToFolder(toFolderScanner);
		}
		System.out.println(" ");
		return toFolderFinal;
	}
}
