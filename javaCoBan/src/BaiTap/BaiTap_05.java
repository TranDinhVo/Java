package BaiTap;

// Chuyen so thap phan sang he nhi phan 
import java.util.Scanner;

public class BaiTap_05 {
	public static Scanner sc;

	public static void main(String[] args) {
		int n;
		sc = new Scanner(System.in);
		do {
			System.out.println("Nhap so n: ");
			n = sc.nextInt();
		}while(n < 0);		
		/*
		 * chia lien tuc cho 2 , lay phan du gan vao chuoi
		 * dao nguoc chuoi => kq
		 */
		String nhiPhan = "";
		while(n > 0) {
			nhiPhan = (n%2) + nhiPhan;
			n /= 2;
		}
		System.out.println("So he nhi phan la: "+ nhiPhan);
	}

}
