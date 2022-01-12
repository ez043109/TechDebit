/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package account

data class AccountInfo(
    val accountId: AccountId,
    val accountType: AccountType,
    var accountNumber: String?,
    var institutionName: String,
)
