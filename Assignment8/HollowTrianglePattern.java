package Assignment8;

public class HollowTrianglePattern {
	public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            	System.out.print((i==1||j==1||j==i||i==5)?"* ":"  ");
            }
            System.out.println();
        }
	}
}
