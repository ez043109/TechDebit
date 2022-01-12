/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package account

import assertk.assertThat
import assertk.assertions.isEqualTo
import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import org.junit.jupiter.api.Test

internal class AccountInfoTest {

    @Test
    fun `test the constructor`() {
        val expectedAccountId = AccountId()
        val expectedAccountType = AccountType.Checking()
        val expectedAccountNumber = "1234"
        val expectedInstitutionName = "Bank of America"
        val accountInfo = AccountInfo(expectedAccountId, expectedAccountType, expectedAccountNumber, expectedInstitutionName)

        assertThat(accountInfo.accountId).isEqualTo(expectedAccountId)
        assertThat(accountInfo.accountType).isEqualTo(expectedAccountType)
        assertThat(accountInfo.accountNumber).isEqualTo(expectedAccountNumber)
        assertThat(accountInfo.institutionName).isEqualTo(expectedInstitutionName)
    }

    @Test
    fun `test equals, hashCode, and toString`() {
        EqualsVerifier.forClass(AccountInfo::class.java)
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()
    }
}