public class SumX {
  public static int sumX (int x, int n) {
    // your code here
		int hasil = 0;
		
		if(x <= 1000 || x >= -1000 || n <= 1000 || n >= -1000){
			if(x == 0 ){
				hasil = 0;
			}
			else if(x < 0 && n < 0){
				n = n * -1;
				for (int i = 1; i <= n; i++){
					x = x * -1;
					if(i %  x  == 0){
					hasil += i;
					}
				}	
			}
			else if (x > 0 && n > 0){
				for(int i = 1; i <= n; i++){
					if(i % x == 0){
					hasil += i;
					}		
				}
			}
		}
		
	return hasil;
  }

  public static void main(String []args) {
    System.out.println("sumX(3, 10): " + (sumX(3, 10)));
    System.out.println("sumX(1, 10): " + (sumX(1, 10)));
    System.out.println("sumX(0, 10): " + (sumX(0, 10)));
    System.out.println("sumX(-1, 10): " + (sumX(-1, 10)));
  }
}
