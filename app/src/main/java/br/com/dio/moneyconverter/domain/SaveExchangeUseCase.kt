package br.com.dio.moneyconverter.domain

import br.com.dio.moneyconverter.core.UseCase
import br.com.dio.moneyconverter.data.model.ExchangeResponseValue
import br.com.dio.moneyconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}