class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public Stock() {
	}

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPreviousClosingPrice(double price) {
		this.previousClosingPrice = price;
	}

	public void setCurrentPrice(double price) {
		this.currentPrice = price;
	}

	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}
}
