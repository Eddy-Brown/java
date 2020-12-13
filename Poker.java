import java.util.Random;
import java.util.Scanner;

public class Poker
{
	public static String randompokersize (String[] size) 
	{
        //根据数组长度，获取随机索引
		int index = new Random().nextInt (size.length);   
		//index为随机的数字
		//通过随机索引从数组中获取姓名
    	String s = size[index];  
		//随机数字放在数组里转换成随机的name
		//返回随机点到的姓名
		return s;
	}

	public static String randompokersuit (String[] suit) 
	{
        //根据数组长度，获取随机索引
		int index = new Random().nextInt (suit.length);   
		//index为随机的数字
		//通过随机索引从数组中获取姓名
    	String su = suit[index];  
		//随机数字放在数组里转换成随机的name
		//返回随机点到的姓名
		return su;
	}

	public static void main(String[] args) 
	{
		//创建一个存储牌面大小和花色的两个数组 
		
		String [] size = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String [] suit = {"Club","Diamonds","Hearts","Spades"};
        
		String rs = randompokersize (size); 
        String rsu = randompokersuit(suit);
		System.out.printf("The card you picked is %s of %s." ,rs ,rsu);

	}	

}