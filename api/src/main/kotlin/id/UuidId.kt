/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package id

import java.nio.ByteBuffer
import java.util.*

data class UuidId(
    private val uuid: UUID = UUID.randomUUID(),
): Id {

    override fun asText(): String {
        return uuid.toString()
    }
}
