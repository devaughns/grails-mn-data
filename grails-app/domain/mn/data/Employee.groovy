package mn.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Employee {

    @Id
    @GeneratedValue
    Long id
    String firstName
    String lastName
    @ManyToOne
    Company company

    static constraints = {
    }
}
