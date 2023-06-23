package loops;

public class tables2to10 {
public static void main(String[] args) {
	int n=10;
	for(int i=1; i<=n;i++) {
		for(int j=1; j<=n;j++) {
			System.out.printf(" %2d ",i*j);
		}
		System.out.println(" ");
	}
	System.out.println("----------------------------");
	m1();
}
public static void m1() {
	for(int i=1; i<=10;i++) //2
	{
		for(int j=1; j<=10; j++) //3
		{
		
			System.out.print("  "+(i*j));
		}
		System.out.println("");
	}
}
}
