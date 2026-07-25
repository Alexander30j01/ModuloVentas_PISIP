package com.uisrael.pisip.dominio.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int idPedidos;
	private LocalDateTime fechaRegistro;
	private BigDecimal subtotal;
	private BigDecimal totalFinal;
	private estadoPedido estado;
	private String metodoPago;

	private Cliente cliente;
	private Usuarios vendedor;
	private List<DetallePedido> detalles;

	public enum estadoPedido {
		PENDIENTE, APROBADO, RECHAZADO, ENTREGADO, CANCELADO
	}

	public Pedido() {
		super();
		this.detalles = new ArrayList<>();
	}

	public Pedido(Cliente cliente, Usuarios vendedor, String metodoPago) {
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.metodoPago = metodoPago;
		this.fechaRegistro = LocalDateTime.now();
		this.estado = estadoPedido.PENDIENTE;
		this.subtotal = BigDecimal.ZERO;
		this.totalFinal = BigDecimal.ZERO;
		this.detalles = new ArrayList<>();
	}

	public Pedido(int idPedidos, LocalDateTime fechaRegistro, BigDecimal subtotal, BigDecimal totalFinal,
			estadoPedido estado, String metodoPago, Cliente cliente, Usuarios vendedor, List<DetallePedido> detalles) {
		super();
		this.idPedidos = idPedidos;
		this.fechaRegistro = fechaRegistro;
		this.subtotal = subtotal;
		this.totalFinal = totalFinal;
		this.estado = estado;
		this.metodoPago = metodoPago;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.detalles = detalles;
	}

	public int getIdPedidos() {
		return idPedidos;
	}

	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getTotalFinal() {
		return totalFinal;
	}

	public void setTotalFinal(BigDecimal totalFinal) {
		this.totalFinal = totalFinal;
	}

	public estadoPedido getEstado() {
		return estado;
	}

	public void setEstado(estadoPedido estado) {
		this.estado = estado;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuarios getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuarios vendedor) {
		this.vendedor = vendedor;
	}

	public List<DetallePedido> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetallePedido> detalles) {
		this.detalles = detalles;
	}

}