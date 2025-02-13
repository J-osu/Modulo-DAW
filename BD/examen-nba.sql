--¿Qué jugadores no tienen indicada su procedencia en la base de datos?
SELECT * FROM jugadores WHERE procedencia IS NULL;

--Obtén el nombre de los jugadores que tienen en su nombre una v en la posición 3.
SELECT nombre FROM jugadores WHERE nombre LIKE '%_3%' limit 12;

--¿Cuántos puntos por partido anotó Chris Wilcox durante las temporadas 2003 a 2006?
SELECT nombre, SUM(puntos_por_partido) AS total_puntos
FROM jugadores
JOIN estadisticas ON jugadores.codigo = estadisticas.jugador
WHERE nombre = 'Chris Wilcox' AND temporada BETWEEN '2003' AND '2006'
GROUP BY nombre;

--¿Qué equipos tienen sólo 1 jugador en la posición ‘C’?
SELECT nombre_equipo FROM jugadores WHERE posicion = 'C' GROUP BY nombre_equipo HAVING COUNT(*) = 1;

--¿En qué temporada consiguió Kobe Bryant su mejor puntuación por partido?
SELECT * FROM estadisticas
JOIN jugadores ON estadisticas.jugador = jugadores.codigo
WHERE nombre = 'Kobe Bryant'
ORDER BY puntos_por_partido DESC
LIMIT 1;

--• Extrae la información de los jugadores que han tenido más rebotes que todos los jugadores españoles y ordena el resultado por el nombre del jugador ascendente.
SELECT * FROM jugadores
JOIN estadisticas ON jugadores.codigo = estadisticas.jugador
WHERE rebotes_por_partido > ALL (SELECT rebotes_por_partido FROM jugadores WHERE procedencia = 'España')
ORDER BY nombre ASC limit 34;

/*• Extrae la siguiente información del jugador/es que tiene el récord de asistencias .
Ordena este resultado por la posición ascendente y en caso de empate por nombre
de equipo descendente*/
SELECT * FROM jugadores
JOIN estadisticas ON jugadores.codigo = estadisticas.jugador
WHERE asistencias_por_partido in (SELECT MAX(asistencias_por_partido) FROM estadisticas)
ORDER BY posicion ASC, nombre_equipo DESC;