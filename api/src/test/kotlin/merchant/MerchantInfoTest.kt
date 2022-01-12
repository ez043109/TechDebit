/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package merchant

import assertk.assertThat
import assertk.assertions.isEqualTo
import general.AddressInfo
import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import org.junit.jupiter.api.Test

internal class MerchantInfoTest {

    @Test
    fun `test the constructor`() {
        val expectedMerchantId = MerchantId()
        val expectedMerchantName = "Microcenter"
        val expectedMerchantAddress = AddressInfo("1100 E Edinger Ave", "92780")
        val merchantInfo = MerchantInfo(expectedMerchantId, expectedMerchantName, expectedMerchantAddress)

        assertThat(merchantInfo.merchantId).isEqualTo(expectedMerchantId)
        assertThat(merchantInfo.merchantName).isEqualTo(expectedMerchantName)
        assertThat(merchantInfo.merchantAddress).isEqualTo(expectedMerchantAddress)
    }

    @Test
    fun `test equals, hashCode, and toString`() {
        EqualsVerifier.forClass(MerchantInfo::class.java)
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()
    }
}