/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package id

import java.nio.ByteBuffer
import java.util.*

data class UuidId(
    private val uuid: UUID = UUID.randomUUID(),
): Id {

    override fun bytes(): List<Byte> {
        return ByteBuffer.allocate(16)
            .putLong(uuid.mostSignificantBits)
            .putLong(uuid.leastSignificantBits)
            .array()
            .toList()
    }
}
