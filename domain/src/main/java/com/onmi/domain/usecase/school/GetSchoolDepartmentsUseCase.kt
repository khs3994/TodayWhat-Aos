package com.onmi.domain.usecase.school

import com.onmi.domain.repository.SchoolRepository
import javax.inject.Inject

class GetSchoolDepartmentsUseCase @Inject constructor(
    private val repository: SchoolRepository,
) {
    suspend operator fun invoke(
        educationCode: String,
        schoolCode: String,
    ) =
        kotlin.runCatching {
            repository.getSchoolDepartmentsInfo(
                educationCode = educationCode,
                schoolCode = schoolCode,
            )
        }
}