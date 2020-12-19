package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class picture {
	
	public static String getPicturePrefix(Scanner picturePrefixScanner) {
		String prefix;
		String prefixRight;
		String prefixFinal = null;
		
		System.out.println("Please give a name prefix (e.g. IMG_):");
		prefix = picturePrefixScanner.nextLine();
		System.out.println("Is "+prefix+" correct? 'Yes' or 'No'!");
		prefixRight = picturePrefixScanner.nextLine();
		if (prefixRight.equalsIgnoreCase("Yes")) {
			prefixFinal = prefix;
			System.out.println("Folder set.");
		}
		else if (prefixRight.equalsIgnoreCase("No")) {
			getPicturePrefix(picturePrefixScanner);
		}
		else {
			System.out.println("[ERROR] You didn't give a valid answer.");
			getPicturePrefix(picturePrefixScanner);
		}
		return prefixFinal;
	}
	
	//UNUSED, MAY BE FOR USE IN FUTURE
	public static String getPictureEnding(Scanner pictureEndingScanner) {
		String ending;
		String endingRight;
		String endingFinal = null;
		
		System.out.println("Please give the format (e.g. .jpg):");
		ending = pictureEndingScanner.nextLine();
		System.out.println("Is "+ending+" correct? 'Yes' or 'No'!");
		endingRight = pictureEndingScanner.nextLine();
		if (endingRight.equalsIgnoreCase("Yes")) {
			endingFinal = ending;
			System.out.println("Folder set.");
		}
		else if (endingRight.equalsIgnoreCase("No")) {
			getPicturePrefix(pictureEndingScanner);
		}
		else {
			System.out.println("[ERROR] You didn't give a valid answer.");
			getPictureEnding(pictureEndingScanner);
		}
		return endingFinal;
	}
	
	public static void copy(String fromstr, String tostr) throws IOException {
		try {
			File from = new File(fromstr+".jpg");
			File to = new File(tostr+".jpg");
			Files.copy(from.toPath(), to.toPath());
			System.out.println("copied.");
		}
		catch (NoSuchFileException ejpg) {
			try {
				File from = new File(fromstr+".JPG");
				File to = new File(tostr+".JPG");
				Files.copy(from.toPath(), to.toPath());
				System.out.println("copied.");
			}
			catch (NoSuchFileException eJpg) {
				try {
					File from = new File(fromstr+".png");
					File to = new File(tostr+".png");
					Files.copy(from.toPath(), to.toPath());
					System.out.println("copied.");
				}
				catch (NoSuchFileException epng) {
					try {
						File from = new File(fromstr+".PNG");
						File to = new File(tostr+".PNG");
						Files.copy(from.toPath(), to.toPath());
						System.out.println("copied.");
					}
					catch (NoSuchFileException ePng) {
						try {
							File from = new File(fromstr+".jpeg");
							File to = new File(tostr+".jpeg");
							Files.copy(from.toPath(), to.toPath());
							System.out.println("copied.");
						}
						catch (NoSuchFileException ejpeg) {
							try {
								File from = new File(fromstr+".JPEG");
								File to = new File(tostr+".JPEG");
								Files.copy(from.toPath(), to.toPath());
								System.out.println("copied.");
							}
							catch (NoSuchFileException eJpeg) {
								try {
									File from = new File(fromstr+".mp4");
									File to = new File(tostr+".mp4");
									Files.copy(from.toPath(), to.toPath());
									System.out.println("copied.");
								}
								catch (NoSuchFileException emp4) {
									try {
										File from = new File(fromstr+".MP4");
										File to = new File(tostr+".MP4");
										Files.copy(from.toPath(), to.toPath());
										System.out.println("copied.");
									}
									catch (NoSuchFileException eMp4) {
										System.out.println("[ERROR] Found no JPG, PNG, JPEG or MP4 file - please check name ( "+fromstr+" )!");
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
}
