/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package id

import nl.jqno.equalsverifier.EqualsVerifier
import org.junit.jupiter.api.Test

internal class UuidIdTest {

    @Test
    fun `test equals, hashCode, and toString`() {
        EqualsVerifier.forClass(UuidId::class.java)
            .verify()
    }
}