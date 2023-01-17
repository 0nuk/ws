package ejercicio04;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;


public class Test {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String contrasenya, compu, s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "";
		int d1 = 1, d2 = 1, d3 = 1, d4 = 1, d5 = 1, d6 = 1, d7 = 1, d8 = 1;
		
		System.out.println("Ingrese contraseña");
		
		contrasenya = sc.next();
		
		compu = s1+s2+s3+s4+s5+s6+s7+s8;
		Instant start = Instant.now();
		
		while (contrasenya.equals(compu) == false) {
			while (d1 <=27 && contrasenya.equals(compu) == false) {
					s1 = letra(d1);
					compu = s1+s2+s3+s4+s5+s6+s7+s8;
					System.out.println(contrasenya + " = " + compu);
					d1++;
					
					while (d2 <=27 && contrasenya.equals(compu) == false) {
						s2 = letra(d2);
						compu = s1+s2+s3+s4+s5+s6+s7+s8;
						System.out.println(contrasenya + " = " + compu);
						d2++;
						
						while (d3 <=27 && contrasenya.equals(compu) == false) {
							s3 = letra(d3);
							compu = s1+s2+s3+s4+s5+s6+s7+s8;
							System.out.println(contrasenya + " = " + compu);
							d3++;
								
							while (d4 <=27 && contrasenya.equals(compu) == false) {
								s4 = letra(d4);
								compu = s1+s2+s3+s4+s5+s6+s7+s8;
								System.out.println(contrasenya + " = " + compu);
								d4++;
								
								while (d5 <=27 && contrasenya.equals(compu) == false) {
									s5 = letra(d5);
									compu = s1+s2+s3+s4+s5+s6+s7+s8;
									System.out.println(contrasenya + " = " + compu);
									d5++;	
									
									while (d6 <=27 && contrasenya.equals(compu) == false) {
										s6 = letra(d6);
										compu = s1+s2+s3+s4+s5+s6+s7+s8;
										System.out.println(contrasenya + " = " + compu);
										d6++;
										
										while (d7 <=27 && contrasenya.equals(compu) == false) {
											s7 = letra(d7);
											compu = s1+s2+s3+s4+s5+s6+s7+s8;
											System.out.println(contrasenya + " = " + compu);
											d7++;
											
											while (d8 <=27 && contrasenya.equals(compu) == false) {
												s8 = letra(d8);
												compu = s1+s2+s3+s4+s5+s6+s7+s8;
												System.out.println(contrasenya + " = " + compu);
												d8++;
											}
											d8 = 1;
										}
										d7 = 1;
									}
									d6 = 1;
								}
								d5 = 1;
							}
							d4 = 1;
						}
						d3 = 1;
					}
					d2 = 1;
				}
				d1 = 1;
		}
		Instant end = Instant.now();
		
		Duration duration = Duration.between(start, end);
		long time =  duration.getSeconds();
		long seg, min, h;
		seg = time;
		h = (seg - (seg%3600)) / 3600;
		min = ((seg%3600)-(seg%3600%60)) / 60;
		seg = seg%3600%60;
		System.out.println(compu + " tiempo: " + h + ":" + min + ":" + seg);
		
		

	}
	public static String letra(int d) {
		String s;
		if (d == 1 ) {
			s = "";
		} else if (d == 2) {
			s = "a";
		} else if (d == 3) {
			s = "b";
		} else if (d == 4) {
			s = "c";
		} else if (d == 5) {
			s = "d";
		} else if (d == 6) {
			s = "e";
		} else if (d == 7) {
			s = "f";
		} else if (d == 8) {
			s = "g";
		} else if (d == 9) {
			s = "h";
		} else if (d == 10) {
			s = "i";
		} else if (d == 11) {
			s = "j";
		} else if (d == 12) {
			s = "k";
		} else if (d == 13) {
			s = "l";
		} else if (d == 14) {
			s = "m";
		} else if (d == 15) {
			s = "n";
		} else if (d == 16) {
			s = "o";
		} else if (d == 17) {
			s = "p";
		} else if (d == 18) {
			s = "q";
		} else if (d == 19) {
			s = "r";
		} else if (d == 20) {
			s = "s";
		} else if (d == 21) {
			s = "t";
		} else if (d == 22) {
			s = "u";
		} else if (d == 23) {
			s = "v";
		} else if (d == 24) {
			s = "w";
		} else if (d == 25) {
			s = "x";
		} else if (d == 26) {
			s = "y";
		} else if (d == 27) {
			s = "z";
		} else {
			s = "ñ";
		}
		return s;
	}
}
