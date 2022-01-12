/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package general

data class AddressInfo(
    var streetAddress: String?,
    var postalCode: String?,
    var country: String = "United States",
)
