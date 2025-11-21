package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
class CoinsResponseDto(
    val data : List<CoinDto>
)