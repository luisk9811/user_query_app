# Actividad 2

## Consulta de Usuario por ID

Implementación de un formulario web que permite consultar un usuario en base de datos a partir de su ID, utilizando **consultas parametrizadas** para evitar inyecciones SQL. Esta actividad sigue las recomendaciones de seguridad de la [OWASP SQL Injection Prevention Cheat Sheet](https://cheatsheetseries.owasp.org/cheatsheets/SQL_Injection_Prevention_Cheat_Sheet.html).

## Solución

### EndPoint de consulta

```http
GET http://localhost:8080/find-user-by-id/
```

### Estructura de la Base de Datos
```sql
CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);
```

### Datos de prueba
```sql
INSERT INTO users (id, first_name, last_name) VALUES
(1, 'Luis Carlos', 'Rodriguez'),
(2, 'Maria Lucia', 'Santos'),
(3, 'Juan Carlos', 'Diaz'),
(4, 'Luz', 'Rodriguez'),
(5, 'Pedro Antonio', 'Lopez');
```