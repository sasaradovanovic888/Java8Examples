package forloop.edu.demo;

public class ForLoopExample {

	public static void main(String[] args) {
		
		int limitValue = 100;
		int summary1 = 0;
		int summary2 = 0;
		
		int delimiterLength = 40;
		char delimiterShowSign = '*';
		
		ReportForLoopExample rfle = new ReportForLoopExample();
		
		for (int i = 1; i <= limitValue; i++) {
			summary1 = summary1 + i;
			rfle.showNewResults(i, summary1);
		}
		
		rfle.showDelimiter(delimiterLength, delimiterShowSign);
		
		for (int i = 1; i <= limitValue; i++) {
			summary2 = summary2 + i;
			rfle.showResults(i, summary2);
		}

	}

}
