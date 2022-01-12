/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package general

import assertk.assertThat
import assertk.assertions.isEqualTo
import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import org.junit.jupiter.api.Test

internal class AddressInfoTest {

    @Test
    fun `test the constructor`() {
        val expectedStreetAddress = "1234 Evergreen Place"
        val expectedPostalCode = "62701"
        val addressInfo = AddressInfo(expectedStreetAddress, expectedPostalCode)

        assertThat(addressInfo.streetAddress).isEqualTo(expectedStreetAddress)
        assertThat(addressInfo.postalCode).isEqualTo(expectedPostalCode)
    }

    @Test
    fun `test equals, hashCode, and toString`() {
        EqualsVerifier.forClass(AddressInfo::class.java)
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()
    }
}