

	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Random;
	public class testRandom {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Random ru = new Random(System.currentTimeMillis()); // 日期为种子
	String str =""+Math.abs(ru.nextInt());
	if (str.length()<8){
	str =""+Math.abs(ru.nextInt());
	}
	str = str.substring(0, 8);
	System.out.println(str);
	SimpleDateFormat formater=new SimpleDateFormat("yyyyMMdd");
	Date d=new Date();
	String date=formater.format(d);
	System.out.println(date);
	//System.out.println(ru.nextInt());
	//System.out.println(Math.abs(ru.nextInt()%32+1));;
	//System.out.println((ru.nextDouble()+1)*100000000);
	//System.out.println(ru.nextFloat());

}
}