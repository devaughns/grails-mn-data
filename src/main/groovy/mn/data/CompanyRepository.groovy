package mn.data

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface CompanyRepository extends JpaRepository<Company, Long> {

    List<Company> findAllByNameLike(String name)

}
