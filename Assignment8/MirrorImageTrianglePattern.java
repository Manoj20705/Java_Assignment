package Assignment8;

public class MirrorImageTrianglePattern {
	public static void main(String[] args) {
		int k=0;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((j+k)+" ");
            }
            k++;
            System.out.println();
        }
        int m=3;
        for(int i=2;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((j+m)+" ");
            }
            m--;
            System.out.println();
        }
	}
}
