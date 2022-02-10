package br.com.dio.moneyconverter.domain

import br.com.dio.moneyconverter.core.UseCase
import br.com.dio.moneyconverter.data.model.ExchangeResponseValue
import br.com.dio.moneyconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}