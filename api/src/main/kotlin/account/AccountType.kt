/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package account

sealed class AccountType( val type: String) {
    class Checking: AccountType("checking")
    class Saving: AccountType("saving")
    class Brokerage: AccountType("brokerage")
    class Retirement: AccountType("retirement")
    class CreditCard: AccountType("credit-card")
    class Mortgage: AccountType("mortgage")
    class Loan: AccountType("loan")
}
