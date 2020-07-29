package com.syntax.class27;

public class TrustableTest {
	
	public static void main(String[] args) {
		///object of Trustable
		Trustable t = new PNC();
		t.trust();
		//object of BANK
		Bank b = new PNC();
		b.deposit();
		b.withdraw();
		b.trust();
		System.out.println("===========");
		//object of Mortgage
		Mortgage m = new PNC();
		m.giveMortgage();
		System.out.println("===========");
		//object of PNC
		PNC p = new PNC();
		p.deposit();
		p.withdraw();
		p.trust();
		p.giveMortgage();
		p.doInvestments();
		System.out.println("===========");
		//object of Trustable
		Trustable t1 = new BOA();
		t1.trust();
		System.out.println("===========");
		//object of Bank
		Bank b1 = new BOA();
		b1.trust();
		b1.deposit();
		b1.withdraw();
		System.out.println("===========");
		//object of BOA
		BOA b2 = new BOA();
		b2.trust();
		b2.deposit();
		b2.withdraw();
		
		
	}

}
