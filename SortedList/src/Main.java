import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Initializations
		SortedList sortedList = new SortedList();
		Random Random = new Random();
		int Random_num = Random.nextInt(100);
		
		//generate 10 random numbers and add them to the SortedList
		for (int i = 0; i < 10; i++) {
			Random_num = Random.nextInt(100);
			sortedList.add(Random_num);
		}
		
		//call toString method to check the result.
		System.out.println(sortedList.toString());
	}

}
