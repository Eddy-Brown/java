import java.util.Random;
import java.util.Scanner;

public class Poker
{
	public static String randompokersize (String[] size) 
	{
        //�������鳤�ȣ���ȡ�������
		int index = new Random().nextInt (size.length);   
		//indexΪ���������
		//ͨ����������������л�ȡ����
    	String s = size[index];  
		//������ַ���������ת���������name
		//��������㵽������
		return s;
	}

	public static String randompokersuit (String[] suit) 
	{
        //�������鳤�ȣ���ȡ�������
		int index = new Random().nextInt (suit.length);   
		//indexΪ���������
		//ͨ����������������л�ȡ����
    	String su = suit[index];  
		//������ַ���������ת���������name
		//��������㵽������
		return su;
	}

	public static void main(String[] args) 
	{
		//����һ���洢�����С�ͻ�ɫ���������� 
		
		String [] size = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String [] suit = {"Club","Diamonds","Hearts","Spades"};
        
		String rs = randompokersize (size); 
        String rsu = randompokersuit(suit);
		System.out.printf("The card you picked is %s of %s." ,rs ,rsu);

	}	

}