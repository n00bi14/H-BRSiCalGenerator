package student.aschm22s.hbrsiCalGenerator.veranstaltung.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect
public class VeranstaltungsIds {
    List<Integer> veranstaltungsIds;

    public List<Integer> getVeranstaltungsIds() {
        return veranstaltungsIds;
    }

    public void setVeranstaltungsIds(List<Integer> veranstaltungsIds) {
        this.veranstaltungsIds = veranstaltungsIds;
    }
}
