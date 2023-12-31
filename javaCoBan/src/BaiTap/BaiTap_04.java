package BaiTap;

// Tinh so ngay cua thang.
import java.util.Scanner;

public class BaiTap_04 {
	public static Scanner sc;

	public static void main(String[] args) {
		int month, year;
		sc = new Scanner(System.in);
		System.out.println("Nhap vao thang: ");
		month = sc.nextInt();
		System.out.println("Nhap vao nam: ");
		year = sc.nextInt();

		switch (month) {
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.println("Thang "+ month +" co 31 ngay!");
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.println("Thang "+ month +" co 30 ngay!");
		    	break;
		    case 2:
		    	if (year % 4 == 0 && year % 100 == 0|| year % 400 == 0)
		    		System.out.println("Thang "+ month + "/" + year +" co 29 ngay!");
		    	else 
		    		System.out.println("Thang "+ month + "/" + year +" co 28 ngay!");
		    	break;
		    default:
		    	System.out.println("Nhap sai du lieu!");
		    	break;
		}

	}

}
