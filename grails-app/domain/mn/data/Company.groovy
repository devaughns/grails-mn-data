package mn.data

class Company {

    Long id
    String name
    List<Employee> employees

    static hasMany = [
        employees: Employee
    ]

    static constraints = {
    }
}
