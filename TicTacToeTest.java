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
				i = input.nextInt()-1;
				j = input.nextInt()-1;turn++;
				//System.out.println("turn id "+turn);
			}
			else{
				//System.out.println("Now is the pc's turn.Hope it gives a correct input");
				i = rand.nextInt(3);
				j = rand.nextInt(3);
			}
			
			
			turp=object.setData(i, j);
			
			
			//if(turp==1&&turn==1){
				//turn=2;
			
			//else if(turp==2&&turn==2){turn=3;}
			//else turn=turp;
			//System.out.println("Turp -function return- is "+turp);
			///System.out.println("Turn is "+turn);
			
			//if(temp!=turn){object.display();}
			
			
			if(TicTacToe.status==true){
				player = !player;
				object.display();
				System.out.println();
			}
			
			//object.display();
			//
			myBool = object.checkResult();
			//System.out.println(myBool);
			//first=turn;
			if(turp==9)myBool=false;
			}
			System.out.println("The game finished");
			
		}
		
	}

