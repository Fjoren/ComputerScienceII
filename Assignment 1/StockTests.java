class StockTests {
	public static void main(String[] args) {
		Stock test = new Stock("ORCL", "Oracle Corporation");
		test.previousClosingPrice = 34.5;
		test.currentPrice = 34.35;
		System.out.println(test.getChangePercent());
	}
}