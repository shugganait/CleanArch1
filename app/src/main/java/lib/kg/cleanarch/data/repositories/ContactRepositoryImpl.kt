package lib.kg.cleanarch.data.repositories

import lib.kg.cleanarch.data.local.ContactDao
import lib.kg.cleanarch.data.models.ContactEntity
import lib.kg.cleanarch.domain.repositories.ContactRepository

class ContactRepositoryImpl(
    private val contactDao: ContactDao
): ContactRepository {
    override fun addContact(contactEntity: ContactEntity) {
        contactDao.addContact(contactEntity)
    }

    override fun getContacts(): List<ContactEntity> {
        return contactDao.getContacts()
    }

    override fun updateContact(contactEntity: ContactEntity) {
        contactDao.updateContact(contactEntity)
    }

    override fun deleteContact(contactEntity: ContactEntity) {
        contactDao.deleteContact(contactEntity)
    }
}