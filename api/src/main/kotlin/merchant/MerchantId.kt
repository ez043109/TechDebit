/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package merchant

import id.Id
import id.UuidId
import java.util.*

data class MerchantId(
    private val uuid: UUID = UUID.randomUUID(),
) : Id by UuidId(uuid)
