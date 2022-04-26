package mn.data

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface CompanyRepository extends CrudRepository<Company, Long> {
}
