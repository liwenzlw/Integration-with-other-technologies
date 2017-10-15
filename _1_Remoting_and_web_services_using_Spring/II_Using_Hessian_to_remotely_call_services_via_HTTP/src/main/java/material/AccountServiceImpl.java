package material;

import java.util.ArrayList;
import java.util.List;

// the implementation doing nothing at the moment
public class AccountServiceImpl implements AccountService {

        private String exportAPIType;

        public String getExportAPIType() {
                return exportAPIType;
        }

        public void setExportAPIType(String exportAPIType) {
                this.exportAPIType = exportAPIType;
        }

        public List<Account> getAccounts(String name) {
                // do something...
                System.out.println("server get " + name + Math.random());
                Account account = new Account();
                account.setName(exportAPIType + "   " + name);
                List<Account> list = new ArrayList<Account>();
                list.add(account);
                return list;
        }
}