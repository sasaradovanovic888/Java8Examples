package edu.demo.forloop;

public class ReportForLoopExample {
	
	public void showResults(int inputValue, int summaryValue) {
		System.out.printf("limit[%3s] = temp_sum[%4s]\n", inputValue, summaryValue);
	}
	
	public void showNewResults(int inputValue, int summaryValue) {
		int inputValueLength = String.valueOf(inputValue).length();
		int summaryValueLength = String.valueOf(summaryValue).length();
		String partOne = "limit[%" + inputValueLength + "s] = temp_sum[%" + summaryValueLength + "s]\n";
		System.out.printf(partOne, inputValue, summaryValue);
	}
	
	public void showDelimiter(int length, char delimiterSign) {
		for (int i = 0; i < length; i++) {
			System.out.print(delimiterSign);
		}
		System.out.print("\n");
	}

}
