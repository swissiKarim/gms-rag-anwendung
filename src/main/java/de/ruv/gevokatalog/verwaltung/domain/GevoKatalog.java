package de.ruv.gevokatalog.verwaltung.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Entity
public class GevoKatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String fachbereich;

    @NotNull
    private String fachlicheBeschreibung;

    @NotNull
    private String version;

    @OneToMany(mappedBy = "gevoKatalog", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FachlichePrompts> fachlichePrompts;

    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFachbereich() { return fachbereich; }
    public void setFachbereich(String fachbereich) { this.fachbereich = fachbereich; }

    public String getFachlicheBeschreibung() { return fachlicheBeschreibung; }
    public void setFachlicheBeschreibung(String fachlicheBeschreibung) { this.fachlicheBeschreibung = fachlicheBeschreibung; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public List<FachlichePrompts> getFachlichePrompts() { return fachlichePrompts; }
    public void setFachlichePrompts(List<FachlichePrompts> fachlichePrompts) { this.fachlichePrompts = fachlichePrompts; }
}
