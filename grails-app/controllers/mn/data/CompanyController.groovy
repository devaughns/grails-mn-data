package mn.data

class CompanyController {

    CompanyService companyService

    Company save(Company company) {
        companyService.save(company)
    }

}
