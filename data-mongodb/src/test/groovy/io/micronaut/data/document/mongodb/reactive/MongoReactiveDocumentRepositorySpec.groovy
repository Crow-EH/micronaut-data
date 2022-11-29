package io.micronaut.data.document.mongodb.reactive

import io.micronaut.data.document.mongodb.MongoDocumentRepositorySpec

class MongoReactiveDocumentRepositorySpec extends MongoDocumentRepositorySpec implements MongoSelectReactiveDriver {

    void "test save and load one"() {
        given:
        savePersons(["User1"])
        when:
        def person = personRepository.findByName("User1")
        then:
        person
        person.name == "User1"
    }
}
