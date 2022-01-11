/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package account

data class AccountInfo(
    val accountId: AccountId,
    val accountType: AccountType,
    val institutionName: String,
)
