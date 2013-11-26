package com.maomaogong.primitivetest;

public class PrimitiveTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		//Primitive data type performance is much more better than Wrapper data type
		
		byte lBy = 8; //1 byte memory
		short lSh = 50; //2 byte memory
		int lIn = 4000; //4 byte memory
		long lLo = 600000000L; //8 byte memory
		char lCh1 = 'x'; //2 byte memory
		char lCh2 = '\u304B'; //2 byte memory
		System.out.println(lCh2);

		float lFl = 2.56F; //4 byte memory
		double lDb = 3.14159D; //8 byte memory
		boolean lBo = true; //1 byte memory
		

		//Wrapper Data Type
		Byte lwBy = new Byte(lBy);
		System.out.println(lwBy.MAX_VALUE);
		System.out.println(lwBy.MIN_VALUE);
		
		Integer lwIn = new Integer(lIn);
		System.out.println(lwIn.MAX_VALUE);
		System.out.println(lwIn.MIN_VALUE);

		float lFlx1 = lwIn.floatValue();
		System.out.println(lFlx1);
	} //public static void main(String[] args) {

} //public class PrimitiveTest {