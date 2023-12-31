package BaiTap;
// Tinh chu vi, dien tich hinh tron voi ban kinh nhap tu ban phim.

import java.util.Scanner;

public class BaiTap_01 {


	private static Scanner sc;

	public static void main(String[] args) {
		double r, dienTich, chuVi;
		sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh R: "); 
		r = sc.nextDouble();
		// Tinh Chu Vi
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);
		
		// Tinh Dien Tich
		dienTich = Math.PI*Math.pow(r,2);
		System.out.println("Dien tich = "+ Math.round(dienTich*100.0)/100.0);
		
		
	}

}
