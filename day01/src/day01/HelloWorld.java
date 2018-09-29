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
		char c = 97;
		char cex = 65;
		System.out.println("char:" + c);
		System.out.println("charex:" + cex);
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
		
		//程序员的表白
		char c1 = 73;
		char c2 = 76;
		char c3 = 111;
		char c4 = 118;
		char c5 = 101;
		char c6 = 89;
		char c7 = 111;
		char c8 = 117;
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.print(c4);
		System.out.print(c5);
		System.out.print(c6);
		System.out.print(c7);
		System.out.println(c8);
		
		//字符相加 & 字符与字符串相加
		char aa = 'a';
		char bbb = 'b';
		System.out.println(aa + bbb);
		System.out.println(aa + bbb + "hello");
		System.out.println("hello" + aa + bbb);

		
	}
}
