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
		char c = 'a';
		System.out.println("char:" + c);
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

		
	}
}
