package edu.demo.dowhileloop;

public class ReportDoWhileLoopExample {
	
	public void showSummaryReport(int summary) {
		System.out.println("summary = " + summary);
	}
	
	public void showInsideLoopReport(int counter, int tempSummary) {
		System.out.println("value = " + counter + " sum = " + tempSummary);
	}
	
	public void showInsideLoopReportTwo(int counter, int tempSummary) {
		String valueText = "value";
		char leftSign = '[';
		char rightSign = ']';
		String sumText = "sum =";
		String space = " ";
		String output = valueText + leftSign + counter + rightSign + space + sumText + space + tempSummary;
		System.out.println(output);
	}
	
	public void delimiterLine(int charLength, char startChar, char delimiterChar, char endChar) {
		
		System.out.print(startChar);
		
		for (int i = 0; i < charLength; i++) {
			System.out.print(delimiterChar);
		}
		
		System.out.println(endChar);
	}
	
}
