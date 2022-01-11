/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package account

import id.Id
import id.UuidId
import java.util.*

data class AccountId(
    private val uuid: UUID,
) : Id by UuidId(uuid)
