package tr.edu.medipol.edu.yazilimort;

public class Hesaplamalar {
	
		public static int faktoriyelRec(int n) {
		  if (n == 1) return 1;
		  return n * faktoriyelRec(n - 1);
		}

		public static int faktoriyelLoop(int n) {
		  int sonuc = 1;
		  for (int i=n; i>1; i--) {
		    sonuc = sonuc * i;
		  }
		  return sonuc;
		}
		
		public static int topla(int sayi1, int sayi2) {
		    int toplam = sayi1 + sayi2;
		    return toplam;
		}
		
		public static int cikart(int sayi1, int sayi2) {
		    int cikarma = sayi1 - sayi2;
		    return cikarma;
		}
		
		public static int carpma(int sayi1, int sayi2) {
		    int carpim = sayi1 * sayi2;
		    return carpim;
		}
		
}
