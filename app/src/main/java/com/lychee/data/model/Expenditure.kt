package com.lychee.data.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 *  지출내역
 */
open class Expenditure(
        @PrimaryKey
        var id: Long = 0L,
        var cardNumber : String? = null, // 4*3*
        var cardName: String? = null, // 또는 현대카드 X ( 카드 이름 )
        var date: String? = null,
        var time: String? = null,
        var shopName: String? = null,
        var price: String? = null,
        var isForeign: Boolean = false,
        var isApproved: Boolean= true,
        var isInstallment: Boolean = false,
        var monthsOfInstallment: Int = 0,
        // MAP
        var lat : Double = -1.0,
        var lng : Double = -1.0
) : RealmObject()