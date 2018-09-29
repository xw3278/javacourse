package day01;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("first java program!");
		//进制
		System.out.println(0B10);
		System.out.println(010);
		System.out.println(11);
		System.out.println(0xc);
		//基本数据类型
		//整型
		byte b = 127;
		short s = 22;
		int i = 33;
		long l = 123L;
		System.out.println("byte:" + b);
		System.out.println("short:" + s);
		System.out.println("int:" + i);
		System.out.println("long:" + l);
		//浮点型
		float f = 1.0F;
		double d = 1.0;
		System.out.println("float:" + f);
		System.out.println("double:" + d);
		//字符型
		char c = 'a';
		System.out.println("char:" + c);
		//布尔型
		boolean bl = false;
		System.out.println("boolean:" + bl);
		
		//数据类型转换
		//隐式
		int y = 3;
		byte bb = 127;
		y = y + bb;
		System.out.println(y);
		
		//强制
		int x = 3;
		byte bt = 127;
		bt = (byte)(x + bt);
		System.out.println(bt);

		
	}
}
