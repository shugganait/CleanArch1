package lib.kg.cleanarch.domain.repositories

import lib.kg.cleanarch.data.models.ContactEntity

interface ContactRepository {
    fun addContact(contactEntity: ContactEntity)

    fun getContacts(): List<ContactEntity>

    fun updateContact(contactEntity: ContactEntity)

    fun deleteContact(contactEntity: ContactEntity)
}