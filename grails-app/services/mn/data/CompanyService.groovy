package mn.data

import grails.gorm.transactions.Transactional

@Transactional
class CompanyService {

    CompanyRepository companyRepository

    CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository
    }

    Company save(Company company) {
        companyRepository.save(company)
    }
}
