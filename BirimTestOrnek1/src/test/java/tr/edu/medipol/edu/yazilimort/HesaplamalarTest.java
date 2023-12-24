package tr.edu.medipol.edu.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120, sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120, sonuc);
	}
	
	@Test
	public void testFaktoriyel() {
		for(int i=1; i<100; i++) {
		int sonuc1 = Hesaplamalar.faktoriyelLoop(i);
		int sonuc2 = Hesaplamalar.faktoriyelRec(i);
		assertEquals(sonuc1, sonuc2);
		}
	}
	
	@Test
	public void testToplama() {
		int toplam = Hesaplamalar.topla(10, 10);
		assertEquals(20, toplam);
	}
	
	@Test
	public void testCikarma() {
		int cikarma = Hesaplamalar.cikart(10, 10);
		assertEquals(0, cikarma);
	}
	
	@Test
	public void testCarpma() {
		int carpim = Hesaplamalar.carpma(10, 10);
		assertEquals(100, carpim);
	}
	
	
	
}
