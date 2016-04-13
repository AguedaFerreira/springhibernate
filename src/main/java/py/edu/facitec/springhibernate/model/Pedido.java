package py.edu.facitec.springhibernate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity //indica crear tabla se tiene que poner si o si
public class Pedido {
	@Id// si o si se hace
	@GeneratedValue
private Long id;
private Date fechaToma;
private Date fechaEntrega;
private double total;
@ManyToOne
private Cliente cliente;


public Pedido() {
	cliente = new Cliente();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getFechaToma() {
	return fechaToma;
}
public void setFechaToma(Date fechaToma) {
	this.fechaToma = fechaToma;
}
public Date getFechaEntrega() {
	return fechaEntrega;
}
public void setFechaEntrega(Date fechaEntrega) {
	this.fechaEntrega = fechaEntrega;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
@Override
public String toString() {
	return "Pedido [id=" + id + ", fechaToma=" + fechaToma + ", fechaEntrega=" + fechaEntrega + ", total=" + total
			+ ", cliente=" + cliente + "]";
}


}
