package week1day2;

public class FindDups {

	public static void main(String[] args) {
		int[] numbers= {22,39,81,19,22,0,39,37};
		int num=22;
		int count=0;
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
			if(numbers[i]==num)
					{
				count++;
					}
		}
				System.out.println("The occurence of" +num+ "is:" +count);
					}
		
}
	

