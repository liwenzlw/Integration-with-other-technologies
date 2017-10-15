package material;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleObject {

        @Autowired
        private AccountService accountService;


        // additional methods using the accountService
        @GetMapping("/executeServerObject")
        public Account  executeServerObject() {
                System.out.println("client invoke");
                Account list = accountService.getAccounts("client").get(0);
                return list;
        }
}