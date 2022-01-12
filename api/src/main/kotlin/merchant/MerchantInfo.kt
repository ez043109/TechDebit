/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package merchant

import general.AddressInfo
import general.HorizontalPosition

data class MerchantInfo(
    val merchantId: MerchantId,
    var merchantName: String?,
    var merchantAddress: AddressInfo?,
    var location: HorizontalPosition? = null,
)
