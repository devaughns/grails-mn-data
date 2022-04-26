package mn.data

import grails.gorm.transactions.Transactional

import javax.inject.Inject

@Transactional
class CompanyService {

    @Inject
    CompanyRepository companyRepository

    CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository
    }

    @javax.transaction.Transactional
    Company save(Company company) {
        companyRepository.save(company)
    }
}
