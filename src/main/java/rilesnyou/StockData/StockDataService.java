package rilesnyou.StockData;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import rilesnyou.StockData.Grabbers.result;
import rilesnyou.StockData.Grabbers.resultResponse;

@Service
public class StockDataService {
	private RestTemplate rt;
	
	@Value("{api-key}")
	String apiKey;
	
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "rilesnyou");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	public List<result> searchOptions(String search) {
		UriComponentsBuilder b = UriComponentsBuilder.fromHttpUrl("https://yahoo-finance-low-latency.p.rapidapi.com/v7/finance/options/");
		b.queryParam("q", search);
		b.queryParam("api_key", apiKey);
		URI url = b.build().toUri();
		resultResponse response = rt.getForObject(url, resultResponse.class);
		System.out.println(url);
		return response.getOpRes();
	}
}
