package rilesnyou.StockData.Grabbers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;



public class resultResponse {
	@JsonProperty("result")
	private List<result> opRes;

	public List<result> getOpRes() {
		return opRes;
	}

	public void setShopResults(List<result> opRes) {
		this.opRes = opRes;
	}
}
