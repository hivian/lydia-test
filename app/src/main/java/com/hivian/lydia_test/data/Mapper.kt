package com.hivian.lydia_test.data

import com.hivian.lydia_test.data.model.domain.RandomUserDomain
import com.hivian.lydia_test.data.model.dto.RandomUserDTO

object Mapper {
    fun mapDTOToDomain(randomUsersDTO: List<RandomUserDTO>) : List<RandomUserDomain> = randomUsersDTO.map {
        RandomUserDomain(
            id = it.localId,
            gender = it.gender,
            firstName = it.name.first,
            lastName = it.name.last,
            email = it.email,
            phone = it.phone,
            cell = it.cell,
            picture = it.picture.large)
    }
}