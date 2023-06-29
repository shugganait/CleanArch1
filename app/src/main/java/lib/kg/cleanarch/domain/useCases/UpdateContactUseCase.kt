package lib.kg.cleanarch.domain.useCases

import lib.kg.cleanarch.data.models.ContanctEntity
import lib.kg.cleanarch.domain.repositories.ContactRepository

class UpdateContactUseCase(
    private val contactRepository: ContactRepository
) {
    fun updateContact(contactEntity: ContanctEntity) {
        contactRepository.updateContact(contactEntity)
    }
}