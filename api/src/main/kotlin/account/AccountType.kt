/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package account

sealed class AccountType {
    class Checking: AccountType()
    class Saving: AccountType()
    class Brokerage: AccountType()
    class IRA: AccountType()
    class CreditCard: AccountType()
    class Mortgage: AccountType()
}

