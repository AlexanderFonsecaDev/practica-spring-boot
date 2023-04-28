package co.com.practica.spring.boot.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
@NoArgsConstructor
@Getter
@Setter
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra",insertable = false,updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_produto",insertable = false,updatable = false)
    private Producto producto;

}
