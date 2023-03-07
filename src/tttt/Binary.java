package tttt;

public class Binary {
public static int SX() {
	int arr[] = {1,2,4,5,6,7};
	int dau = 1;
	int cuoi = arr.length;
	while(dau<=cuoi) {
	int mid = (dau +cuoi)/2;
	int k=3;
	if(mid == k) {
		return mid;
	} else if(mid<k) {
		dau=mid ++;
	} else {
		cuoi=mid--;
	}
	
}
	return -1;
}
public static void main(String[] args) {
	System.out.println(+SX());
	}
}
