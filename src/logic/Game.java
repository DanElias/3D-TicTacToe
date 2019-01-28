/*Author: Daniel Elias Becerra A01208905
Description: This class is the logic behind the game. It creates the 3d array of positions of the 3d tictactoe
It also receives the objects of Player that are created in the Play_Frame GUI. 
This Game class is the ones that is going to be serialized.
Date: 17/04/18 - 22/04/18
*/

package logic;

import java.util.*;
import java.io.*;

public class Game implements Serializable{ // to be serialized.

	private Player player1;
	private Player player2;
        private int[][][] grid=new int[3][3][3]; // to know which player has introduced a symbol in which location of the cube.
        private int turn=0;
        
	public Game(Player player1, Player player2, int[][][] grid, int turn ){// Constructor
		this.player1=player1;
		this.player2=player2;
                this.grid=grid; 
                this.turn=turn;
	}

	public void setPlayer1(Player player1){ //Sstters and Getters
		this.player1=player1;
	}

	public void setPlayer2(Player player2){
		this.player2=player2;
	}

	public Player getPlayer1(){
		return this.player1;
	}

	public Player getPlayer2(){
		return this.player2;
	}
 
        public void setGrid(int[][][] grid){
		this.grid= grid; 
	}
        
        public int[][][] getGrid(){
		return this.grid; 
	}
        
        public void setTurn(int turn){
            this.turn=turn;
        }
        
        public int getTurn(){
            return this.turn;
        }

	public String checkWin(){
            int i=0;// LAYERS
            int j=0;//ROWS
            int k=0;//COLUMNS
            int acumX=0;//acum to see if it completes 3 in a row, acum = 3 if ti does complete 3 in a row.
            int acum0=0;
            int finalacum=0;
            String result="";
            
            //---------CHECKING HORIZONTALS FOR EACH LEVEL-----------//9 CASES
            
            for(i=0;i<3;i++){ //MOVING ON Z AXIS OR THE LAYERS
                for(j=0;j<3;j++){//MOVING ON THE Y AXIS OR THE ROWS
                    for(k=0; k<3; k++){//MOVING ON THE X AXIS OR THE COLUMNS
                        
                        
                            if(grid[i][j][k]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                            }
                           
                            if(grid[i][j][k]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&k==2){ // K=2 means when the last column or the end of a row is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&k==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                    }
                acum0=0;// If you pass to the next row you cannot carry the acum of the previous row with you it needs to reestart
                acumX=0;
                }	
            }
            
            //---------END CHECKING HORIZONTALS FOR EACH LAYER-----------//
            
            //---------CHECKING VERTICALS FOR EACH LAYER-----------//9 CASES
            
            for(i=0;i<3;i++){ //MOVING ON Z AXIS OR THE LAYERS
                for(k=0;k<3;k++){//MOVING ON THE X AXIS OR THE COLUMNS
                    
                    for(j=0; j<3; j++){//MOVING ON THE Y AXIS FOR THE ROWS
                        
                        
                            if(grid[i][j][k]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                            }
                           
                            if(grid[i][j][k]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&j==2){ // j=2 means when the last row or the end of a column is being checked
                                // you need to know if the column's acum=3 to know if the player made 3 in a row.
                                System.out.println("YOU WON PLAYER 1");
                                result="PLAYER 1 WON";
                            }
                            
                            if(acumX==3&j==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                    }
                acum0=0;// If you pass to the next column you cannot carry the acum of the previous column with you it needs to reestart
                acumX=0;
                }	
            }
            
            //---------END CHECKING VERTICALS FOR EACH LEVEL-----------//
            //---------CHECKING 2D DIAGONALS TOP LEFT TO BOTTOM RIGHT FOR EACH LEVEL-----------//3 CASES
            
            for(i=0;i<3;i++){ //MOVING ON Z AXIS OR THE LAYERS
                for(j=0;j<3;j++){//MOVING ON THE X AXIS OR THE COLUMNS
                    //IN THIS DIAGONALS THE J=K, ROW NUMBER=COLUMN NUMBER
                        
                        
                            if(grid[i][j][j]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                            }
                           
                            if(grid[i][j][j]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&j==2){ // j=2 means when the last column is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&j==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                }
            acum0=0;// If you pass to the next layer you cannot carry the acum of the previous layer with you it needs to reestart
            acumX=0;
            }
            
            //---------END CHECKING 2D DIAGONALS TOP LEFT TO BOTTOM RIGHT FOR EACH LAYER-----------//
            
             //---------CHECKING 2D DIAGONAL TOP RIGHT TO BOTTOM LEFT FOR EACH LAYER-----------//3 CASES
            
            for(i=0;i<3;i++){ //MOVING ON Z AXIS OR THE LAYERS
                for(j=0;j<3;j++){//MOVING ON THE X AXIS OR THE COLUMNS
                    
                    
                        
                        
                            if(grid[i][j][2-j]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                // My k or row is 2-j because k+j is always = 2 in this inverse diagonal
                            }
                           
                            if(grid[i][j][2-j]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&j==2){ // j=2 means when the last column is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&j==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                    }
                acum0=0;// If you pass to the next layer you cannot carry the acum of the previous layer with you it needs to reestart
                acumX=0;	
            }
            
            //---------END CHECKING 2D DIAGONAL TOP RIGHT TO BOTTOM LEFT FOR EACH LAYER-----------//
            
            // NOW WE BEGIN 3D CHECKING //
            
            //---------CHECKING 3D HORIZONTALS FOR EACH LAYER-----------//9 CASES
            
            for(j=0;j<3;j++){ //MOVING ON y AXIS 
                for(k=0;k<3;k++){//MOVING ON THE x AXIS OR THE COLUMNS
                    
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                        
                            if(grid[i][j][k]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                            }
                           
                            if(grid[i][j][k]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                    }
                acum0=0;// If you pass to the next column you cannot carry the acum of the previous column with you it needs to reestart
                acumX=0;
                }	
            }
            
            //---------END CHECKING 3D HORIZONTALS FOR EACH LAYER-----------//
            
            //---------CHECKING 3D DIAGONALS ON SAME COLUMN DOWN TO UP-----------//3 CASES
            
            for(k=0;k<3;k++){ //MOVING ON X AXIS OR THE COLUMNS
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                        
                            if(grid[i][2-i][k]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                //j+k=2 thats why the j [] is = 2-i
                            }
                           
                            if(grid[i][2-i][k]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                }
                acum0=0;// If you pass to the next column you cannot carry the acum of the previous column with you it needs to reestart
                acumX=0;
            }
            
            //---------END CHECKING 3D DIAGONALS ON SAME COLUMN DOWN TO UP-----------//
            //---------CHECKING 3D DIAGONALS ON SAME COLUMN UP TO DOWN-----------//3 CASES
            for(k=0;k<3;k++){ //MOVING ON X AXIS OR THE COLUMNS
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                        
                            if(grid[i][i][k]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                            }
                           
                            if(grid[i][i][k]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                }
                acum0=0;// If you pass to the next column you cannot carry the acum of the previous column with you it needs to reestart
                acumX=0;
            }
            
            //---------END CHECKING 3D DIAGONALS ON SAME COLUMN UP TO DOWN-----------//
            
            //---------CHECKING 3D DIAGONALS ON SAME ROW LEFT TO RIGHT-----------//3 CASES
            for(j=0;j<3;j++){ //MOVING ON Y AXIS OR THE ROWS
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                        
                            if(grid[i][j][i]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                //My i = k based on the coordinates of the cube
                            }
                           
                            if(grid[i][j][i]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                }
                acum0=0;// If you pass to the next row you cannot carry the acum of the previous row with you it needs to reestart
                acumX=0;
            }
            
            //---------END CHECKING 3D DIAGONALS ON SAME ROW LEFT TO RIGHT-----------//
            
            //---------CHECKING 3D DIAGONALS ON SAME ROW RIGHT TO LEFT-----------//3 CASES
            for(j=0;j<3;j++){ //MOVING ON Y AXIS OR THE ROWS
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                        
                            if(grid[i][j][2-i]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                //My i+k=2
                            }
                           
                            if(grid[i][j][2-i]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                }
                acum0=0;// If you pass to the next row you cannot carry the acum of the previous row with you it needs to reestart
                acumX=0;
            }
            
            //---------END CHECKING 3D DIAGONALS ON SAME ROW RIGHT TO LEFT-----------//
            
            
            //---------CHECKING 3D DIAGONALS 1ST ACROSS TR-BL-----------//1 CASE
           
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                            if(grid[i][i][2-i]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                //My i=j and i+k=2
                            }
                           
                            if(grid[i][i][2-i]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                                
                            if(i==2){
                                acum0=0;// If you pass checking the 3 layers without winning then acums should be reestarted
                                acumX=0;
                            }
                       }
                
            //---------END CHECKING 3D DIAGONALS 1ST ACROSS TR-BL-----------//
            
            //---------CHECKING 3D DIAGONALS 2nd ACROSS BL-TR-----------//1 CASE
           
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                            if(grid[i][2-i][i]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                //My i=k and i+j=2
                            }
                           
                            if(grid[i][2-i][i]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                            
                            if(i==2){
                                acum0=0;//// If you pass checking the 3 layers without winning then acums should be reestarted
                                acumX=0;
                            }
                }
            //---------END CHECKING 3D DIAGONALS 2nd ACROSS BL-TR-----------//
            
            //---------CHECKING 3D DIAGONALS 3rd ACROSS TL-BR-----------//1 CASE
           
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                            if(grid[i][i][i]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                //My i=j=k
                            }
                           
                            if(grid[i][i][i]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                            
                            if(i==2){
                                acum0=0;//// If you pass checking the 3 layers without winning then acums should be reestarted
                                acumX=0;
                            }
                }
            //---------END CHECKING 3D DIAGONALS 3rd ACROSS TL-BR-----------//
            
            //---------CHECKING 3D DIAGONALS 4th ACROSS BR-TL-----------//1 CASE
           
                    for(i=0; i<3; i++){//MOVING ON THE Z AXIS OR THE LAYERS
                        
                            if(grid[i][2-i][2-i]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                acum0=acum0+1; //CHECK ++
                                //My j=k but j+i=2 and k+i=2 
                            }
                           
                            if(grid[i][2-i][2-i]==1){
                                acumX=acumX+1;
                            }
                            
                            if(acum0==3&&i==2){ // i=2 means when the last layer is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("YOU WON PLAYER 1");
                                    result="PLAYER 1 WON";
                                    }
                            
                            if(acumX==3&i==2){
                                System.out.println("YOU WON PLAYER 2");
                                result="PLAYER 2 WON";
                            }
                            
                            if(i==2){
                                acum0=0;//// If you pass checking the 3 layers without winning then acums should be reestarted
                                acumX=0;
                            }
                }
            //---------END CHECKING 3D DIAGONALS 4th ACROSS BR-TL-----------//
            
            
           /////***********END OF CHECKING THE 49 POSSIBILITIES OF WINNING*******************//////
           
           //---------CHECKING IF NO ONE WINS-----------//
            
            for(i=0;i<3;i++){ //MOVING ON Z AXIS OR THE LAYERS
                for(j=0;j<3;j++){//MOVING ON THE Y AXIS OR THE ROWS
                    for(k=0; k<3; k++){//MOVING ON THE X AXIS OR THE COLUMNS
                        
                        
                            if(grid[i][j][k]==2){ //Gives point to each player to sum and know if they have completed 3 in a row.
                                finalacum=finalacum+1; //CHECK ++
                            }
                            
                            if(grid[i][j][k]==1){
                                finalacum=finalacum+1;
                            }
                            
                            if(finalacum==27&&k==2){ // K=2 means when the last column or the end of a row is being checked
                                // you need to know if the row acum=3 to know if the player made 3 in a row.
                                    System.out.println("NO ONE WON");
                                    result="NO ONE WON";
                            }
                            
                    }
                }	
            }
            
            //---------END CHECKING HORIZONTALS FOR EACH LAYER-----------//
     return result;
    } // returns if someone wins
}