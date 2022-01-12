/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package general

import assertk.assertThat
import assertk.assertions.isEqualTo
import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import org.junit.jupiter.api.Test

internal class HorizontalPositionTest {

    @Test
    fun `test the constructor`() {
        val expectedLatitude = 32.5
        val expectedLongitude = -116.5
        val horizontalPosition = HorizontalPosition(expectedLatitude, expectedLongitude)

        assertThat(horizontalPosition.latitude).isEqualTo(expectedLatitude)
        assertThat(horizontalPosition.longitude).isEqualTo(expectedLongitude)
    }

    @Test
    fun `test equals, hashCode, and toString`() {
        EqualsVerifier.forClass(HorizontalPosition::class.java)
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()
    }
}