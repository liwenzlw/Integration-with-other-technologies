package material.client;

import material.server.AccountService;

public class SimpleObject {

        private AccountService accountService;

        public void setAccountService(AccountService accountService) {
                this.accountService = accountService;
        }

        // additional methods using the accountService
        public void executeServerObject() {
                System.out.println("client invoke");
                accountService.insertAccount(null);
                accountService.getAccounts("client");
        }
}