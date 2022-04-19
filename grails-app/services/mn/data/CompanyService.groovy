package mn.data

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired

@Transactional
class CompanyService {

    @Autowired
    CompanyRepository companyRepository

    Company save(Company company) {
        companyRepository.save(company)
    }
}
