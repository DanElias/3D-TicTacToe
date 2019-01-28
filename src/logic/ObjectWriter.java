/* 
AUTHOR: Daniel Elias Becerra A01208905
DESCRIPTION: This class is the Object Writer. It saves objects into a file.
DATE: 20/04/2018
*/

package logic;

import java.util.*;
import java.io.*;
import tictactoe.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectWriter{

	private FileOutputStream file; //Output stream to open file
	private ObjectOutputStream out; // to save object to file
	private String filename="";

	public void writer(Game game, String filename) { // receives filename given by the user.
 		//Scanner input= new Scanner(System.in);
 		//System.out.println("What is the file name?:");
 		//filename="src/logic/"+input.nextLine();// saves text files in source

		//Saves objects into a file
		try {
			file = new FileOutputStream(new File(filename));//Tries opening the file and creates one if there no one with that name
			out = new ObjectOutputStream(file); // sets the Object output stream to be saved in a file

			// Write objects to file
			out.writeObject(game); //writeObject saves a given object into a file

			out.close(); //Close output streams
			file.close();
		} 

		catch (FileNotFoundException e) {
			System.out.println("File not found");
		} 

		catch (IOException i) {
                    i.printStackTrace();
                }
	}
}