--¿Qué proveedores diferentes hay para adquirir los productos?
select distinct Proveedor from productos;

--Extrae la siguiente información de clientes de Madrid y que tienen indicada la línea de dirección 2.
select CodigoCliente, NombreCliente, ApellidoContacto, Telefono, Fax, LineaDireccion1, LineaDireccion2, Ciudad, Region, Pais, CodigoPostal from Clientes WHERE Ciudad = 'Madrid' and LineaDireccion2 is not null;

--¿Cuál el el producto más caro que se vende en la tienda?
select * from productos ORDER BY PrecioVenta desc limit 1;

--¿Qué empleados trabajan en una oficina de la ciudad de Madrid?
select nombre from empleados where codigooficina = 'MAD-ES';

--• ¿Cuánto es el total pagado según la forma de pago durante el año 2009? Ordena el resultado por el total descendente.
select formaPago, sum(cantidad) as total from pagos where fechaPago between '2009-01-01' and '2009-12-31' group by formaPago order by total desc;

/*Obtén el (nombre y apellidos) y el puesto que ocupa los empleados que tienen por
jefe un subdirector de ventas y ordena el resultado alfabético por el puesto
descendente.*/
select nombre, apellido1, apellido2, puesto from empleados where codigojefe in (select codigoempleado from empleados where puesto = 'Subdirector Ventas') order by puesto desc;

/*• Calcula el coste de cada pedido indicando el Código pedido, subtotal, IVA y total.
Después, con UNION, añade la suma total de todos los pedidos al final.*/
select codigoPedido, sum(precioUnidad * cantidad) as subtotal, sum(precioUnidad * cantidad * 21 / 100) as IVA, sum(precioUnidad * cantidad * 1.21) as total from detallePedidos group by codigoPedido union select null, null, null, sum(precioUnidad * cantidad * 1.21) from detallePedidos;

/*Extrae la información siguiente del cliente junto con el nombre del representante de
ventas y el total de pedidos que ha realizado cada cliente. Cuando calcules el total
de pedidos sólo se escogerán aquellos que han sido entregados y que el total sea
mayor que 3. Ordena el resultado por la cantidad descendente y en caso de
empate por el Nombre de cliente.*/