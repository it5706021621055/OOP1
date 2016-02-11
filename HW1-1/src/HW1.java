import java.util.Scanner;
public class HW1 {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		int num,point;
		System.out.print("Enter Max Number : ");
		num = scan.nextInt();
		System.out.print("Enter Pointer of Number : ");
		point = scan.nextInt();
		int count=0;
		for(int i=2;i<=num;i++){
			if (i%2==0)
			{
			count++;
			if (point==count){
			System.out.print(i+" ");
			System.exit( 0 );  
		}}
		}
		for(int j=2;j<=num;j++){
			if (j%3==0&&j%2!=0)
			{
			count++;
			if (point==count){
				System.out.print(j+" ");
				System.exit( 0 );  
			}  
			}
		}
		for(int j=2;j<=num;j++){
			if (j%5==0&&j%3!=0&&j%2!=0)
			{		
			count++;
			if (point==count){
				System.out.print(j+" ");
				System.exit( 0 );  
			}  
			}
		}
		for(int j=2;j<=num;j++){
			
			if (j%7==0&&j%5!=0&&j%3!=0&&j%2!=0)
			{
			count++;
			if (point==count){
				System.out.print(j+" ");
				System.exit( 0 );  
			}  
			}
		}
		for(int j=2;j<=num;j++){
			
			if (j%11==0&&j%7!=0&&j%5!=0&&j%3!=0&&j%2!=0)
			{
			count++;
			if (point==count){
				System.out.print(j+" ");
				System.exit( 0 );  
			}  
			}
		}
		for(int j=2;j<=num;j++){
			if (j%13==0&&j%7!=0&&j%5!=0&&j%3!=0&&j%2!=0&&j%11!=0)
			{
			count++;
			if (point==count){
				System.out.print(j+" ");
				System.exit( 0 );
			}  
			}
		}
		for(int j=2;j<=num;j++){
			if (j%17==0&&j%7!=0&&j%5!=0&&j%3!=0&&j%2!=0&&j%11!=0&&j%13!=0)
			{
			count++;
			if (point==count){
				System.out.print(j+" ");
				System.exit( 0 );
			}  
			}
		}
	
	}
	
}
