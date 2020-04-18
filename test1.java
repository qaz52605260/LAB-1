import java.util.Scanner;

public class test1 {

	public static void main (String[] args) {
		int min = 0,max=99;
		double rate,count=0.0000;
		
		int bingo=(int)(Math.random()*100)+1;
		System.out.println(bingo);
		
		while(true){
			count++;
			Scanner input=new Scanner(System.in);
			System.out.printf("(%2d,%2d)?",min,max);
			int guess=input.nextInt();
			
			if(guess>max || guess<min)
				System.out.println("Out of the range,try again?");
			else if (guess==50) {
				if(bingo>50) {
					min=51;
				    max=99;
				}	    
				else {
					min=0;
				    max=49;
				}
			}
			else if(guess<bingo) {
				min=guess;
				}
			else if(guess>bingo) {
				max=guess;
			    }
			else if(guess==bingo) {
				if(max-1==guess && min+1==guess) {
					System.out.println("GG.");
					break;
				}
				else {
				    System.out.println("bingo.");
				    break;
				}
			}   	
		}
		rate=count/100.0000;
		System.out.println(rate);
		
		
	}
}
