package com.uisrael.pisip.infraestructura.persistencia.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import com.uisrael.pisip.dominio.entidades.Pedido.estadoPedido;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "pedido")
public class PedidoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedidos;
	private LocalDateTime fechaRegistro;
	private BigDecimal subtotal;
	private BigDecimal totalFinal;

	@Enumerated(EnumType.STRING)
	private estadoPedido estadoPedido;

	private String metodoPago;

	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	private UsuariosEntity fkUsuarioEntity;

	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private ClienteEntity fkClienteEntity;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetallePedidoEntity> detalles;
}
