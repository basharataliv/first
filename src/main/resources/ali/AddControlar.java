package ali;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddControlar 
{
@RequestMapping("/add")
	public string add()
	{
		return "display.jsp";
	}
	
}
