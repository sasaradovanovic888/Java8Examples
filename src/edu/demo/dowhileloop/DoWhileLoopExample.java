package edu.demo.dowhileloop;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		
		int limit = 20;
		int sum = 0;
		int i = 1;
		
		ReportDoWhileLoopExample report = new ReportDoWhileLoopExample();

		int charLength = 40;
		char startChar = '[';
		char delimiterChar = '*';
		char endChar = ']';
		report.delimiterLine(charLength, startChar, delimiterChar, endChar);
		
		System.out.println("Example 1:");
		
		do {
			sum += i;
			report.showInsideLoopReport(i, sum);
			i++;
		} while (i <= limit);
		
		report.showSummaryReport(sum);
		
		report.delimiterLine(charLength, startChar, delimiterChar, endChar);
	}

}
