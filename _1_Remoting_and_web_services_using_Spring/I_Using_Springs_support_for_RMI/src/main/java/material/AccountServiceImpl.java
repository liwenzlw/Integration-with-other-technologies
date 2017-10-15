package material;

import java.util.List;

// the implementation doing nothing at the moment
public class AccountServiceImpl implements AccountService {

        public void insertAccount(Account acc) {
                // do something...
                System.out.println("server insert " + Math.random() );
        }

        public List<Account> getAccounts(String name) {
                // do something...
                System.out.println("server get " + name + Math.random());
                return null;
        }
}