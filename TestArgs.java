package day5;
/*
	д������䣬��ÿһ�е�ǰ��ֱ�д��ָ���
	�ָ���:
		��һ�� 5 �� !
			   10   @
			   15   #
			   20	$
			   25	%
			   35	^
			   
			   www.  .com
*/
public class TestArgs{
	public static void main(String[] args){
		int a = 5;
		printLine(a);
		System.out.println("һ�ﲢһ�����ཫ������");
		printLine(10);
		System.out.println("������·��������ƶ�");
		printLine(15);
		System.out.println("�����꣬�����");
		printLine(20);
		System.out.println("¡����ʱ���ͨ");
		printLine(25);
		System.out.println("���ͨʱֻ����");
		printLine(30);
	}	

	
	public static void printLine(double a){//�����ߣ�����ָ����Ҫ��ӡ���ٸ�  ��������  int  a
		for(int i = 1;i <= a;i++){
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	public static void m(int a){
		
	}
}