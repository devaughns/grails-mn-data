package mn.data

import io.micronaut.data.repository.PageableRepository
import io.micronaut.data.jdbc.annotation.JdbcRepository

@JdbcRepository
interface CompanyRepository extends PageableRepository<Company, Long> {

}
