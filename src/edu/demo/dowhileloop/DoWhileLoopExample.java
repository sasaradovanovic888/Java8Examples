package edu.demo.dowhileloop;

import edu.demo.forloop.ReportForLoopExample;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		
		int limit = 20;
		int sum = 0;
		int i = 1;
		
		ReportDoWhileLoopExample report = new ReportDoWhileLoopExample();
		
		ReportForLoopExample reportInside = new ReportForLoopExample();

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
		
		System.out.println("Example 2:");
		
		int limitA = 100;
		int sumA = 0;
		int j = 1;
		
		do {
			sumA += j;
			report.showInsideLoopReportTwo(j, sumA);
			j++;
		} while (j <= limitA);
		
		report.showSummaryReport(sumA);
		report.delimiterLine(charLength, startChar, delimiterChar, endChar);
		
		System.out.println("Example 3:");
		
		int limitB = 100;
		int sumB = 0;
		int n = 1;
		
		do {
			sumB += n;
			reportInside.showNewResults(n, sumB);
			n++;
		} while (n <= limitB);
		
		report.showSummaryReport(sumB);
		report.delimiterLine(charLength, startChar, delimiterChar, endChar);
		
	}

}
