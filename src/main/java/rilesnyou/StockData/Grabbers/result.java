package rilesnyou.StockData.Grabbers;

public class result {

		private double bid;
		private double ask;
		private double regularMarketPrice;
		public double getBid() {
			return bid;
		}
		public void setBid(double bid) {
			this.bid = bid;
		}
		public double getAsk() {
			return ask;
		}
		public void setAsk(double ask) {
			this.ask = ask;
		}
		public double getRegularMarketPrice() {
			return regularMarketPrice;
		}
		public void setRegularMarketPrice(double regularMarketPrice) {
			this.regularMarketPrice = regularMarketPrice;
		}
		@Override
		public String toString() {
			return "result [bid=" + bid + ", ask=" + ask + ", regularMarketPrice=" + regularMarketPrice + "]";
		}
		
		
}
