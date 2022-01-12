/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package merchant

import nl.jqno.equalsverifier.EqualsVerifier
import org.junit.jupiter.api.Test

internal class MerchantIdTest {

    @Test
    fun `test equals, hashCode, and toString`() {
        EqualsVerifier.forClass(MerchantId::class.java)
            .verify()
    }
}