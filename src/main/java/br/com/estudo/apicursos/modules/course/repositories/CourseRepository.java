package br.com.estudo.apicursos.modules.course.repositories;

import br.com.estudo.apicursos.modules.course.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<CourseEntity, UUID> {
}
