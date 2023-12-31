package BaiTap;

// Giai Phuong Trinh Bac Hai.

import java.util.Scanner;

public class BaiTap_03 {
	
	public static Scanner sc;
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = sc.nextDouble();
		System.out.println("Nhap b = ");
		b = sc.nextDouble();
		System.out.println("Nhap c = ");
		c = sc.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("Phuong trinh vo so nghiem!");
				else
					System.out.println("Phuong trinh vo nghiem!");
			}
			else 
				System.out.printf("Phuong trinh co 1 nghiem x = "+ -c/b);
		}
		else {
			delta = Math.pow(b,2)-4*a*c;
			if (delta < 0)
				System.out.println("Phuong trinh vo nghiem!");
			else if (delta == 0)
				System.out.println("Phuong trinh co 1 nghiem kep x1 = x2 = "+ -b/(2*a));
			else {
				x1 =Math.round( (-b - Math.sqrt(delta))/(2*a)*100.0 )/100.0;
				x2 =Math.round( (-b + Math.sqrt(delta))/(2*a)*100.0 )/100.0;
				System.out.println("Phuong trinh co 2 nghiem ");
				System.out.println("x1 = "+ x1);
				System.out.println("x2 = "+ x2);
			}
			
		}
	}

}
