package method;

public class Method4 {
	
	// Q5
	public static int[] generateRandomNumbers(int count) {
	    int[] randomNumbers = new int[count];
	    for (int i = 0; i < count; i++) {
	        randomNumbers[i] = (int) (Math.random() * 100) + 1;
	    }
	    return randomNumbers;
	}

	// Q6
	public static double calculateAverage(int count) {
	    int[] randomNumbers = generateRandomNumbers(count);
	    int sum = 0;
	    for (int randomNumber : randomNumbers) {
	        sum += randomNumber;
	    }
	    return (double) sum / count;
	}
}
