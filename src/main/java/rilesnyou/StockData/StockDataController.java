package rilesnyou.StockData;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import rilesnyou.StockData.Grabbers.result;

@Controller
public class StockDataController {
	StockDataService os;
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/search-ticker")
	public String searchTicker(String search, Model model) {
		List<result> ticker = os.searchOptions(search);
		model.addAttribute("result", ticker);
		model.addAttribute("search", search);
		System.out.println(ticker);
		System.out.println(search);
		return "home";
	}
}
