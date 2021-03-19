package com.alexanderpodkopaev.domain.usecases.countries

import com.alexanderpodkopaev.domain.usecases.UseCase

class FetchCountries : UseCase<Unit, List<CountryModel>> {
    override suspend fun execute(
        request: Unit?,
        onSuccess: (List<CountryModel>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        onSuccess.invoke(
            listOf(
                CountryModel(title = "Austria"),
                CountryModel(title = "Australia")
            )
        )
    }

}
