package lib.kg.cleanarch.data.repositories

import lib.kg.cleanarch.data.local.ContactDao
import lib.kg.cleanarch.data.models.ContanctEntity
import lib.kg.cleanarch.domain.repositories.ContactRepository

class ContactRepositoryImpl(
    private val contactDao: ContactDao
): ContactRepository {
    override fun addContact(contactEntity: ContanctEntity) {
        contactDao.addContact(contactEntity)
    }

    override fun getContacts(): List<ContanctEntity> {
        return contactDao.getContacts()
    }

    override fun updateContact(contactEntity: ContanctEntity) {
        contactDao.updateContact(contactEntity)
    }

    override fun deleteContact(contactEntity: ContanctEntity) {
        contactDao.deleteContact(contactEntity)
    }
}