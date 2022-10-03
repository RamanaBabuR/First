package practiceJava;

public class StarPrograme {
	
	public void downStar() {
		
		for(int row= 1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
					System.out.print("* ");
			}
			System.out.println("");
		}
		
	}//new 
	public void reverse() {
		
		String str= "Reverse";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}			
		
	}
	public static void main(String[] args) {
		StarPrograme S = new StarPrograme();
		S.downStar();
		S.reverse();
	}

}


// completed

