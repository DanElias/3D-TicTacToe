/* 
AUTHOR: Daniel Elias Becerra A01208905
DESCRIPTION: This class reads the objects from a file.
DATE: 20/04/2018
*/

package logic;

import java.util.*;
import java.io.*;

public class ObjectReader{// Deserializes objects stored in a file

	private FileInputStream file_in; 
	private ObjectInputStream in;

	public Game read(String filename){
            Game game=null;
            int j;
		try {
			file_in = new FileInputStream(new File("src/logic/"+filename)); //create file input stream.
			in = new ObjectInputStream(file_in); // create object input stream
                        
                        game=(Game)in.readObject();
                                 
			in.close(); // close input streams
			file_in.close();
		} 
		catch (IOException i){
                    i.printStackTrace();
                } 

                catch (ClassNotFoundException c){
                    System.out.println("Game class not found");
                    c.printStackTrace();
                }
        return game;
	}

    /*public void printObjects(Game game){ /// prints objects stored in the file
    int j;
      for(j=0; j<3; j++){
        System.out.println("\n\n~~Deserialized Student~~");
        System.out.println(game.getPlayer1());
        System.out.println(game.getPlayer2());
      }
	 }*/
}