package Entities;
import javax.persistence.*;
@Entity
@Table(name = "documento")
public class Documentos {

    @Id
    @GeneratedValue
    private Long id;

    @Column (name="tipo_documento")
    private String tipoDocumento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
