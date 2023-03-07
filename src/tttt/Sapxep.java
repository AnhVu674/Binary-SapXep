package tttt;

public class Sapxep {
	public static void main(String[] args) {
		Sx();
		}
	public static int Sx() {
		
		int arr[] = { 2, 3, 4, 5, 6 };
		int i = 0;
		int k = 4;
		while (arr[i] != k) {
			i = i+1;
		}
		if (i < arr.length) {
			return i;
		} else {
			return -1;
		}
	}
}
