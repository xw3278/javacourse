package day01;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("first java program!");
		//����
		System.out.println(0B10);
		System.out.println(010);
		System.out.println(11);
		System.out.println(0xc);
		//������������
		//����
		byte b = 127;
		short s = 22;
		int i = 33;
		long l = 123L;
		System.out.println("byte:" + b);
		System.out.println("short:" + s);
		System.out.println("int:" + i);
		System.out.println("long:" + l);
		//������
		float f = 1.0F;
		double d = 1.0;
		System.out.println("float:" + f);
		System.out.println("double:" + d);
		//�ַ���
		char c = 97;
		char cex = 65;
		System.out.println("char:" + c);
		System.out.println("charex:" + cex);
		//������
		boolean bl = false;
		System.out.println("boolean:" + bl);
		
		//��������ת��
		//��ʽ
		int y = 3;
		byte bb = 127;
		y = y + bb;
		System.out.println(y);
		
		//ǿ��
		int x = 3;
		byte bt = 127;
		bt = (byte)(x + bt);
		System.out.println(bt);
		
		//����Ա�ı��
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
		
		//�ַ���� & �ַ����ַ������
		char aa = 'a';
		char bbb = 'b';
		System.out.println(aa + bbb);
		System.out.println(aa + bbb + "hello");
		System.out.println("hello" + aa + bbb);

		
	}
}
