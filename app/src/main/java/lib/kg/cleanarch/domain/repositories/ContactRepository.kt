package lib.kg.cleanarch.domain.repositories

import lib.kg.cleanarch.data.models.ContanctEntity

interface ContactRepository {
    fun addContact(contactEntity: ContanctEntity)

    fun getContacts(): List<ContanctEntity>

    fun updateContact(contactEntity: ContanctEntity)

    fun deleteContact(contactEntity: ContanctEntity)
}