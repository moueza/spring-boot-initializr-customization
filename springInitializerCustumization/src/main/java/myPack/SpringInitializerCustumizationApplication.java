package myPack;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class SpringInitializerCustumizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitializerCustumizationApplication.class, args);
	}

	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Hello";
	}

	/**
	 * http://www.baeldung.com/spring-mvc-model-model-map-model-view
	 * 
	 * @Controller from
	 *             https://github.com/eugenp/tutorials/search?utf8=%E2%9C%93&q=RequestMapping&type=
	 *             spring-security-mvc-boot/src/main/java/org/baeldung/multiplelogin/UsersController.java
	 */
	@GetMapping("/showViewPage")
	public String passParametersWithModel(Model model) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("spring", "mvc");
		model.addAttribute("message", "Baeldung");
		model.mergeAttributes(map);
		return "viewPage8978";
	}

	/** Solution 2of3 ModelMap param */
	@GetMapping("/printViewPage")
	public String passParametersWithModelMap(ModelMap map) {
		map.addAttribute("welcomeMessage", "welcome");
		map.addAttribute("message", "Baeldung");
		return "viewPage Ballack";
	}

	/**
	 * Solution 3of3 ModelMap param <BR>
	 * Solution 2of2 ModelMap param
	 */
	@GetMapping("/goToViewPage")
	public ModelAndView passParametersWithModelAndView() {
		ModelAndView modelAndView = new ModelAndView("viewPage");
		modelAndView.addObject("message", "Baeldung");
		/**
		 * bean <br>
		 * https://stackoverflow.com/questions/5055358/what-is-model-in-modelandview-from-spring-mvc
		 */
		return modelAndView;
	}

	/** +++++++++++++++++++++++++++++++++++4.1 */
	@GetMapping("/get")
	public @ResponseBody ResponseEntity<String> get() {
		return new ResponseEntity<String>("GET Response", HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<String> getById(@PathVariable String id) {
		return new ResponseEntity<String>("GET Response : " + id, HttpStatus.OK);
	}

	String message = "Ceci est mon message";

	/**+++++++++++++++++++++++++++++++
	 * <BR> https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-jsp/ */
	@RequestMapping("wel")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome les loulous";
	}
	
	
/**++++++++++++++++++++++++++++++++++++++++++++++
 * @return Obj donc ce n est pas une JSP ?
 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html*/
    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
		return null;
        
    }
}
