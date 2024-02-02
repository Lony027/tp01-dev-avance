# Utiliser l'image officielle de PostgreSQL
FROM postgres:latest

# Copier le script SQL dans le dossier docker-entrypoint-initdb.d qui est exécuté lors de la création du conteneur
COPY scripts/insert.sql /docker-entrypoint-initdb.d/

# Exposer le port 5432 pour permettre les connexions à la base de données
EXPOSE 5432

# Définir les variables d'environnement pour PostgreSQL
ENV POSTGRES_DB=MasterAnnonce
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres