package day5;
/*
	写几个语句，在每一行的前后分别写入分割线
	分割线:
		第一行 5 个 !
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
		System.out.println("一凤并一龙，相将到蜀中");
		printLine(10);
		System.out.println("才至半路里，凤死落破东");
		printLine(15);
		System.out.println("风送雨，雨随风");
		printLine(20);
		System.out.println("隆汉兴时蜀道通");
		printLine(25);
		System.out.println("蜀道通时只有龙");
		printLine(30);
	}	

	
	public static void printLine(double a){//调用者，你来指定需要打印多少个  整数类型  int  a
		for(int i = 1;i <= a;i++){
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	public static void m(int a){
		
	}
}