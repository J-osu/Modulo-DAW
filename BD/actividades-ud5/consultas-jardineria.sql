--1) Cambia la región de Madrid a MAD en Clientes.
SELECT * FROM Clientes WHERE Region = 'Madrid';
UPDATE Clientes SET Region = 'MAD' WHERE Region = 'Madrid';
--2) Coloca en región lo mismo que en Ciudad en los registros no indicados.
select * from clientes where region = '' or region is null;
UPDATE Clientes SET Region = Ciudad WHERE Region = '';
/*3) Incrementa el precio de venta en un 20% el precio de los productos que
no tengan pedidos.*/
UPDATE Productos SET PrecioVenta = PrecioVenta * 1.2 WHERE CodigoProducto NOT IN (SELECT DISTINCT CodigoProducto FROM DetallePedidos);
/*4) Modifica la tabla DetallePedido para incorporar un campo numérico
llamado TotalLinea, y actualiza todos sus registros para calcular su valor
con la fórmula TotalLinea=PrecioUnidad*Cantidad*IVA/100*/
--ALTER TABLE DetallePedidos ADD COLUMN TotalLinea NUMERIC(15, 2);
UPDATE DetallePedidos SET TotalLinea = PrecioUnidad * Cantidad * 21 / 100;
/*5) Establece a 0 el límite de crédito del cliente que menos unidades pedidas
tenga del producto 'OR-179'. */
-- UPDATE Clientes SET LimiteCredito = 0 WHERE CodigoCliente = (SELECT CodigoCliente FROM Pedidos JOIN DetallePedidos ON Pedidos.CodigoPedido = DetallePedidos.CodigoPedido WHERE CodigoProducto = 'OR-179' GROUP BY CodigoCliente ORDER BY SUM(Cantidad) ASC LIMIT 1);

-- 1) Borra los clientes que no tengan pedidos.
DELETE FROM Clientes WHERE CodigoCliente NOT IN (SELECT DISTINCT CodigoCliente FROM Pedidos);
-- 2) Borra los pagos del cliente con menor límite de crédito.
-- DELETE FROM Pagos WHERE CodigoCliente = (SELECT CodigoCliente FROM Clientes ORDER BY LimiteCredito ASC LIMIT 1);
-- 3) Borra los pagos por cheque.
DELETE FROM Pagos WHERE FormaPago = 'Cheque';
-- 4) Borra los pedidos y su detalle del cliente “Tendo Garden”.
DELETE FROM DetallePedidos WHERE CodigoPedido IN (SELECT CodigoPedido FROM Pedidos WHERE CodigoCliente = (SELECT CodigoCliente FROM Clientes WHERE NombreCliente = 'Tendo Garden'));
DELETE FROM Pedidos WHERE CodigoCliente = (SELECT CodigoCliente FROM Clientes WHERE NombreCliente = 'Tendo Garden');