package day2;

//Java基础语法 ---> Java变量课后练习
//声明两个变量并初始化，实现变量值的交换
//方法二
class Demo2 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 20;
		var1 = var1 + var2; // var1 = 30
		var2 = var1 - var2; // var2 = 10
		var1 = var1 - var2;

		System.out.println("var1=" + var1);
		System.out.println("var2=" + var2);
	}
}
