package training.mentoringapp.employees.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import training.mentoringapp.employees.internal.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select distinct e from Employee e left join fetch e.addresses")
    List<Employee> findAllWithAddresses();

    @Query("select distinct e from Employee e left join fetch e.addresses where e.id = :id")
    Optional<Employee> findByIdWithAddresses(@Param("id") Long id);
}
