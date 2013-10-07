

class TicTacToe {
	public static boolean status;
	private int turn;
	public enum Value{
		X,O,EMPTY;
	}
	
	private Value[][] array = new Value[3][3];
	public TicTacToe(){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j] = Value.EMPTY;
			}
		}
	}
	
	public void display(){
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"\t");
			
			}
			System.out.println();
		}
		
	}
	
	public int setData(int row,int column){
		if(array[row][column]==Value.EMPTY){
			status=true;
			turn++;
			if(turn%2==0){
				array[row][column] = Value.O;
				}
			else
				array[row][column] = Value.X;
		}
		else{
			status = false;
			//System.out.println("Wrong entry...Give a other go)");
			}
		return turn;
	}
	
	
	public boolean checkResult(){
		/*System.out.println(checkRow()+" hello");
		System.out.println(checkColumn());
		System.out.println(rtcheckCross());
		System.out.println(ltcheckCross()+"  end");*/
		
		if(checkRow()||checkColumn()||rtcheckCross()||ltcheckCross())return false;
		else 
			return true;
		
		
		
	}
	
	public boolean checkRow(){
	//	System.out.println("in check row");
		
		for(int i = 0; i<array.length;i++){
			//System.out.println("now i is "+i);
			int count=0;
			Value temp = array[i][0];
			
			for(int j=0;j<array.length;j++){
				//System.out.println("now j is: "+j);
				if(array[i][j]!=Value.EMPTY){
				if(temp==array[i][j])count++;}
				
			}
			if(count==3)return true;
		}
		//System.out.println("row last");
		return false;
	}
	
	public boolean checkColumn(){
		//System.out.println("in column");
		for(int j = 0;j<array.length;j++){
			int count = 0;
			Value temp = array[0][j];
			for(int i = 0;i<array.length;i++){
				if(array[i][j]!=Value.EMPTY){
				if(temp==array[i][j])count++;}
			}
			if(count==3)return true;
		}
		//System.out.println("column last");
		return false;
	}
	
	public boolean rtcheckCross(){
		//System.out.println("rt first ");
		Value temp = array[0][0];
		int count = 0;
		for(int i = 0;i<=2;i++){
			if(array[i][i]!=Value.EMPTY){
			if(temp==array[i][i])count++;}
		}
		//System.out.println("rt last");
		if(count==3)return true;
		else return false;
	}
	
	public boolean ltcheckCross(){
		//System.out.println("lt first");
		Value temp = array[0][2];
		int count = 0;
		for(int i = 0;i <=2;i++){
			if(array[i][2-i]!=Value.EMPTY){
			if(temp==array[i][2-i])count++;}
		}
		//System.out.println("lt last");
		if(count==3)return true;
		else return false;
	}
	
	
	
	
}




