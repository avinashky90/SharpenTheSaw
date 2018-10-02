package c.ch.readModifyWrite;

import java.util.concurrent.atomic.AtomicInteger;

import org.omg.CORBA.portable.ValueBase;

//Prone to race conditions..
//What if this generates enetity identifiers that wil be used in persistence.
public class UnsafeSequenceGenerator {
	private static int value = 0;
//	private static AtomicInteger value = new AtomicInteger(0);
	// Would Volatile help here  .. ?
	
	public static int getNext(){
		return value++;
//		return value.getAndIncrement();
	}
}
