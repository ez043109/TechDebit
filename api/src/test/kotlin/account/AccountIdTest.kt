/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package account

import nl.jqno.equalsverifier.EqualsVerifier
import org.junit.jupiter.api.Test

internal class AccountIdTest {

    @Test
    fun `test equals, hashCode, and toString`() {
        EqualsVerifier.forClass(AccountId::class.java)
            .verify()
    }
}