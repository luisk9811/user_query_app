# Actividad 2

## Consulta de usuario por ID

Crear un formulario web que haga una consulta a base de datos haciendo uso de consulta parametrizada, el formulario debe recibir un ID de usuario y mostrar el nombre y apellido de dicho usuario en la base de datos. Tener presente OWASP SQL Injection Prevention Cheat Sheet

### Solución
```curl
http://localhost:8080/find-user-by-id/
```

```sql
CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

INSERT INTO users (id, first_name, last_name) VALUES
(1, 'Luis Carlos', 'Rodriguez'),
(2, 'Maria Lucia', 'Santos'),
(3, 'Juan Carlos', 'Diaz'),
(4, 'Luz', 'Rodriguez'),
(5, 'Pedro Antonio', 'Lopez');
```