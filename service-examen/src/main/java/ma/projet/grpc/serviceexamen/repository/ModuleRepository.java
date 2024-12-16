package ma.projet.grpc.serviceexamen.repository;

import ma.projet.grpc.serviceexamen.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Long> {
}
