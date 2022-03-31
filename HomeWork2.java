/**
*Java1.HomeWork2.
*
*@author Alena Chabrova
*@version 30.03.2022
*/
class HomeWork2 {
    public static void main(String[] args)	{
		System.out.println(task1(7, 7));
		task2(3);
		task3(-3);
		task4("Yes",7);
	}
	
	
	static boolean task1(int a,int b) {
		
	    int s = a + b;
		
	    return (s >= 10 && s <= 20);
	}  
	
	static void task2(int a) {
		
	    System.out.println(a >= 0? "Positive" : "Negative");
	}

    static boolean task3( int a) {
		return a < 0 ;
	}

    static void task4(String text, int a) {
		
		for (int b = 0; b < a ; b++) {
			System.out.println(text);
		}
	}
}