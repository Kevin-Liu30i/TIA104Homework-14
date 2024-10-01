package hw1;

public class hw_1 {

	public static void main(String[] args) {

		System.out.println("==========1==========");
		int i1 = 12;
		int i2 = 6;
		int sum = i1 + i2;
		int pdt = i1 * i2;
		System.out.println(i1 + "+" + i2 + "=" + sum);
		System.out.println(i1 + "*" + i2 + "=" + pdt);

		System.out.println("==========2==========");

		int egg = 200;
		int doz = egg / 12;

		int modEgg = egg % 12;
		System.out.println("200顆蛋總共" + doz + "打" + modEgg + "顆");

		System.out.println("==========3==========");

		int day = 256559 / 86400;
		int hour = (256559 % 86400) / 3600;
		int min = ((256559 % 86400) % 3600) / 60;
		int sec = ((256559 % 86400) % 3600) % 60;

		System.out.println(day + "天" + hour + "時" + min + "分" + sec + "秒");

		System.out.println("==========4==========");

		final double pi = 3.1415; // 常數圓周率
		double radius = 5; // 半徑

		// 圓的面積
		double area = pi * radius * radius;

		// 圓的周長
		double circumference = 2 * pi * radius;

		System.out.println("半徑為 " + radius + " 的圓面積為: " + area);
		System.out.println("半徑為 " + radius + " 的圓周長為: " + circumference);

		System.out.println("==========5==========");
		
		double principal = 1500000; // 本金
        double Rate = 0.02; // 2%
        int years = 10; // 存款年數

        
        double totalAmount = principal * Math.pow(1 +Rate, years);
        System.out.printf("10年後，本金加利息共有: %.2f 元%n", totalAmount);
        
        System.out.println("==========6==========");
        
        System.out.println(5 + 5); // 純數字加法

       
        System.out.println(5 + '5');  // '5' 的ASCII 值為 53， 5 + 53 = 58

        
        System.out.println(5 + "5"); // "5" 是一個字串 ，字串相加結果是 "55"
		
	}

}
