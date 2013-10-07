import java.util.Scanner;
import java.util.Random;
public class TicTacToeTest {
	public static Scanner input = new Scanner(System.in);
	public static Random rand = new Random();
	public static void main(String args[]){
		TicTacToe object = new TicTacToe();
		object.display();
		
		boolean myBool = true,player;
		int i,j;
		int turn=0,turp=0;
	
		
		System.out.println("Do you want to go first?");
		System.out.println("Type 'true'  for yes  else type 'false' for no ");
		player = input.nextBoolean();
		while(myBool){
			
			if(player){
				if(turn>=1){
				if(TicTacToe.status==false)System.out.println("Wrong entry..Your turn will be EXTERMINATTED 'Doctor Who refernce -smiley-'");
				}
				System.out.println("Now is your turn.Input a cell number. Note-Array starts with one index");
				System.out.println("Type 1 1 if you want first row,first column");
				i = input.nextInt()-1;
				j = input.nextInt()-1;turn++;
		
			}
			else{
				
				i = rand.nextInt(3);
				j = rand.nextInt(3);
			}
			
			
			turp=object.setData(i, j);
			
			
			
			
			
			if(TicTacToe.status==true){
				player = !player;
				object.display();
				System.out.println();
			}
			
			
			myBool = object.checkResult();
			
			if(turp==9)myBool=false;
			}
			System.out.println("The game finished");
			
		}
		
	}

