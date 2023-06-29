package lib.kg.cleanarch.domain.useCases

import lib.kg.cleanarch.data.models.ContanctEntity
import lib.kg.cleanarch.domain.repositories.ContactRepository

class AddContactUseCase(
    private val contactRepository :  ContactRepository
) {

    fun addContact(contactEntity: ContanctEntity) {
        contactRepository.addContact(contactEntity)
    }

}