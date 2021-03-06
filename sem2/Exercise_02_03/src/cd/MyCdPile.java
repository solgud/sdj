package cd;

import java.util.Scanner;

import utility.collection.ArrayStack;
import cd.domain.model.*;

public class MyCdPile {

	public static void main(String[] args) {

		ArrayStack<Cd> cdPile = new ArrayStack<Cd>(); // Start with an empty stack to hold cd's
		Scanner in = new Scanner(System.in);

		int userInput = -1;
		while(userInput != 0)
		{
			// Print console menu
			System.out.println();
			System.out.println("Select an option from the following:");
			System.out.println("1: Add CD to pile");
			System.out.println("2: See title at top of pile");
			System.out.println("3: Remove title at top of pile");
			System.out.println("4: Check if pile is empty");
			System.out.println("5: Get number of CD's in pile");
			System.out.println("6: Get location of CD in pile");
			System.out.println("0: Quit");
			System.out.println("Enter option: ");

			// Respond to input
			userInput = in.nextInt();

			switch(userInput) {
			case 0:
				break;
			case 1:
				System.out.println("Selected: Add CD to pile");
				System.out.println("Enter title: ");
				String title = in.nextLine();
				System.out.println("Enter artist: ");
				String artist = in.nextLine();
				CdTrack[] tracks = {}; // Not bothering with this right now
				// TODO: Make a tracklist from user input
				cdPile.push(new Cd(title, artist, tracks));
				break;
			case 2:
				System.out.println("Selected: See title at top of pile");
				System.out.println("Title: " + cdPile.peek().getTitle());
				break;
			case 3:
				System.out.println("Selected: Remove title at top of pile");
				if(cdPile.isEmpty()) {
					System.out.println("Pile is empty.");
					break;
				}
				cdPile.pop();
				break;
			case 4:
				System.out.println("Selected: Check if pile is empty");
				System.out.println(cdPile.isEmpty() ? "Pile is empty" : "Pile is not empty");
				break;
			case 5:
				System.out.println("Selected: Get number of CD's in pile");
				System.out.println("Number of CD's in pile: " + cdPile.size());
				break;
			case 6:
				System.out.println("Selected: Get location of CD in pile");
				System.out.println("Enter title: ");
				// TODO: Figure out how to reference CD by title
				System.out.println();
				break;
			}

		}

	}

}
