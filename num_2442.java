package print;
import java.util.*;
public class num_2442 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1;i<N+1;i++) {
			for(int j=0;j<N-i;j++) {
				System.out.print(" ");			
			}
			
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
	}

}
}