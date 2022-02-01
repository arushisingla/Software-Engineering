package moviepackage;
import java.lang.Math;
import java.util.Scanner;

public class movies {
	static int predict(int a, int c) {
		
		int[][] train= {{100,0,0},{0,100,1},{90,17,0},{21,80,1}};//0 for action and 1 for comedy
		double dist[]=new double[4];
		for(int i=0; i<4; i++) {
			dist[i]=Math.sqrt(Math.pow(train[i][0]-a,2)+ Math.pow(train[i][1]-c, 2));
			
		}
		double min=dist[0];
		int loc=0;
		for(int i=0; i<4; i++) {
			if(min>dist[i]) {
				loc=i;
				min=dist[i];
			}
				
		}
		return train[loc][2];
	}
	public static void main(String args[]){
		int a,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of action scenes: ");
		a=s.nextInt();
		System.out.println("Enter number of comedy scenes: ");
		c=s.nextInt();
		System.out.print("The movie is ");
		int ans=predict(a,c);
		if(ans==1)
			System.out.print("Comedy");
		else
			System.out.print("Action");
	}

}
