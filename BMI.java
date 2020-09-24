import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        System.out.println(" ");
		System.out.println("欢迎使用BMI体重指数计算系统");
		
		
        System.out.println(" ");
		System.out.println(" 请输入身高(米)：");
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        System.out.println(" "); 
		System.out.println(" 请输入体重(千克)：");
        float w = sc.nextFloat();
        
        float bmi = w/(h*h);
        System.out.println(" ");
        System.out.println("您的BMI指数为 "+String.format("%.1f",bmi)); 
        if(bmi<18.5)
            System.out.println("您的体重过轻");
        else if(bmi>=18.5 && bmi<=23.9)
            System.out.println("您的体重正常");
        else if(bmi>23.9 && bmi<=27.9)
            System.out.println("您的体重偏重");
		else 
            System.out.println("您的体重超重"); 
    }
}