package lib.kg.cleanarch.domain.useCases

import lib.kg.cleanarch.domain.repositories.ContactRepository
import lib.kg.cleanarch.data.models.ContactEntity

class GetContactsUseCase(
    private val contactRepository : ContactRepository
) {
    fun getContacts(): List<ContactEntity> {
        return contactRepository.getContacts()
    }
}