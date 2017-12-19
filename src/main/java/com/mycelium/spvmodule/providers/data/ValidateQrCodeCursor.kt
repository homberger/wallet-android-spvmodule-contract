package com.mycelium.spvmodule.providers.data

import android.database.MatrixCursor

import com.mycelium.spvmodule.providers.TransactionContract

/**
 * The custom cursor that defines data returned by [TransactionContract.ValidateQrCode.TABLE_NAME]
 */
class ValidateQrCodeCursor : MatrixCursor(arrayOf(
        TransactionContract.ValidateQrCode.QR_CODE,
        TransactionContract.ValidateQrCode.IS_VALID), 1)
