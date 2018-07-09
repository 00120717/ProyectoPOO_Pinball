Create Table videojuego
use videojuego

CREATE TABLE Jugador(
idJugador int Auto_Increment primary key,
nombre varchar(200),
puntos int
);
Create Table Juego(
idJuego int Auto_Increment primary key,
fecha date,
puntaje int
);
Create Table JugXJueg(
idJugador int,
idJuego int
);



