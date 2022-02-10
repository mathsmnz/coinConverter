package br.com.dio.moneyconverter.domain

import br.com.dio.moneyconverter.core.UseCase
import br.com.dio.moneyconverter.data.model.ExchangeResponseValue
import br.com.dio.moneyconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}