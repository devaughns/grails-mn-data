package mn.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Company {

    @Id
    @GeneratedValue
    Long id
    String name
    @OneToMany
    List<Employee> employees

    static hasMany = [
        employees: Employee
    ]

    static constraints = {
    }
}
