package mn.data

import grails.converters.JSON

class CompanyController {

    CompanyService companyService

    Company gormSave(Company company) {
        render companyService.gormSave(company) as JSON
    }

    List<Company> gormList() {
        render companyService.gormList() as JSON
    }

    Company save(Company company) {
        Company savedCo = companyService.save(company)
        render savedCo as JSON
    }

    List<Company> list() {
        render companyService.list() as JSON
    }

    List<Company> findByName(String name) {
        render companyService.findByName(name)as JSON
    }

}
