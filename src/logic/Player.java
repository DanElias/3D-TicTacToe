/*Author: Daniel Elias Becerra A01208905
Description: This class is the one that models the Players whose attributes are only their names and turn assigned.
Date: 17/04/18
*/

package logic;

import java.util.*;
import java.io.*;


public class Player implements Serializable{ // it also implements serializable as the Game class uses objects of Player and it is serialized.

	private String name;
	private int player_number;

	public Player(String name, int player_number){// Constructor
		this.name=name;
		this.player_number=player_number;
	}

	public void setName(String name){ // setters and getters.
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	public void setPlayerNumber(int player_number){
		this.player_number=player_number;
	}

	public int getPlayerNumber(){
		return this.player_number;
	}
}