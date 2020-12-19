package main;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class picturecopy {
	
	public static byte getDoCode(Scanner doCodeScanner) {
		byte doCode = 0;
		try {
			System.out.println("What do you want to do? Copy = '1'; Change folders = '2'; One-time different file name = '3'; End = '4'");
			doCode = doCodeScanner.nextByte();
		}
		catch (InputMismatchException e) {
			System.out.println("Please give a valid number.");
			getDoCode(doCodeScanner);
		}
		if (doCode > 3 || doCode < 1) {
			getDoCode(doCodeScanner);
		}
		return doCode;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String srcFolder;
		String toFolder;
		String picturePrefix;
		//String pictureEnding;
		byte doCode = 0;
		String pictureName;
		
		//Informations
		System.out.println("[Info] Welcome to picture-copy.");
		System.out.println("[Info] This program is - as for now - case sensitive.");
		
		//folder get
		srcFolder = folder.getSrcFolder(scanner);
		toFolder = folder.getToFolder(scanner);
		
		//get picture Prefix (e.g. IMG_)
		picturePrefix = picture.getPicturePrefix(scanner);
		//get picture data format (ending)
		//pictureEnding = picture.getPictureEnding(scanner);
		
		while (doCode != 4) {
			doCode = getDoCode(scanner);
			if (doCode == 1) {
				System.out.println("Copying: write 'Stop!' to stop.");
				pictureName = "";
				scanner.nextLine();
				while (!pictureName.equals("Stop!")) {
					System.out.println("Give a picture (no prefix and no format):");
					pictureName = scanner.nextLine();
					if (!pictureName.equals("Stop!")) {
						try {
							picture.copy(srcFolder+picturePrefix+pictureName, toFolder+picturePrefix+pictureName);
						}
						catch (FileAlreadyExistsException e) {
							System.out.println("[ERROR] This file already exists.");
						}
					}
				}
			}
			else if (doCode == 2) {
				//folder get
				srcFolder = folder.getSrcFolder(scanner);
				toFolder = folder.getToFolder(scanner);
				
				//get picture Prefix (e.g. IMG_)
				picturePrefix = picture.getPicturePrefix(scanner);
				//get picture data format (ending)
				//pictureEnding = picture.getPictureEnding(scanner);
			}
			else if (doCode == 3) {
				scanner.nextLine();
				System.out.println("Give the full file name:");
				String tempName = scanner.nextLine();
				try {
					picture.copy(srcFolder+tempName, toFolder+tempName);
				}
				catch (FileAlreadyExistsException e) {
					System.out.println("[ERROR] This file already exist.");
				}
			}
			else if (doCode > 4 || doCode < 0) {
				System.out.println("An error occured.");
			}
			
		}
		
		
		
		System.exit(0);
		scanner.close();
	}

}
