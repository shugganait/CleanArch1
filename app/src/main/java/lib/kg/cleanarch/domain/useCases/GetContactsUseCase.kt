package lib.kg.cleanarch.domain.useCases

import lib.kg.cleanarch.domain.repositories.ContactRepository
import lib.kg.cleanarch.data.models.ContanctEntity

class GetContactsUseCase(
    private val contactRepository : ContactRepository
) {
    fun getContacts(): List<ContanctEntity> {
        return contactRepository.getContacts()
    }
}