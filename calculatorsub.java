import java.util.ArrayList;

public class calculatorsub {
	void getResult(ArrayList<Integer> list) {

		Integer subtract = list.get(0);
				
		Integer result=null;
		for(int index = 0; index < list.size()-1; index++)
		{
		result=result - list.get(index+1);
		}
		System.out.println("subtraction is:"+ result);
		}
		}

