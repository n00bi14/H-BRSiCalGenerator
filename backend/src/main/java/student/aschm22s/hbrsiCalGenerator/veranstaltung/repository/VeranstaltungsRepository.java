package student.aschm22s.hbrsiCalGenerator.veranstaltung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student.aschm22s.hbrsiCalGenerator.veranstaltung.domain.Veranstaltung;

@Repository
public interface VeranstaltungsRepository extends JpaRepository<Veranstaltung, Integer> {
    Iterable<Veranstaltung> findByIdIn(Iterable<Integer> Ids);

    Veranstaltung findFirstByNameAndStudienGangSemester(String name, String studienGangSemester);

    void deleteAllByStudienGangSemester(String studienGangSemester);
}
