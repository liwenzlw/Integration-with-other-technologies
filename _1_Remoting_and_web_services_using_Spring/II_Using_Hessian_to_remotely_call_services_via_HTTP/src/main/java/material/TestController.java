package material;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // additional methods using the accountService
    @GetMapping("/validCanAccess")
    public String  validCanAccess() {
        System.out.println("validCanAccess");
        return "Can";
    }
}
