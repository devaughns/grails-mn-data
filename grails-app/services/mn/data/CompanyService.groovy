package mn.data

import grails.gorm.transactions.Transactional
import org.springframework.transaction.TransactionStatus

@Transactional
class CompanyService {

    CompanyRepository companyRepository

    CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository
    }

    Company gormSave(Company company) {
        company.save(flush: true)
    }

    List<Company> gormList() {
        Company.findAll()
    }

    Company save(Company company) {
        Company.withTransaction {TransactionStatus status ->
            company = companyRepository.save(company)
            status.setRollbackOnly()
            status.flush()
        }
        company
    }

    List<Company> list() {
        List<Company> companies = []
        Company.withTransaction { TransactionStatus status ->
            companies = companyRepository.findAll()
            status.setRollbackOnly()
            status.flush()
        }
        companies
    }

    List<Company> findByName(String name) {
        List<Company> companies = []
        Company.withTransaction {TransactionStatus status ->
            companies = companyRepository.findAllByNameLike("%name%")
            status.setRollbackOnly()
            status.flush()
        }
        companies
    }

}
