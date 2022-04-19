package mn.data

class CompanyController {

    CompanyService companyService

    static scaffold = Company

    Company customSave(Company company) {
        companyService.save(company)
    }

}
