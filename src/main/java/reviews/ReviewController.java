package reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("/reviews")
	public String reviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}
	/*
	 * @RequestMapping("reviews") public String getAReview(@RequestParam Long id,
	 * Model model) { model.addAttribute("reviews", reviewRepo.findOne(id)); return
	 * "reviews"; }
	 */
}
