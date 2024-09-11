# Application de Gestion de Tâches et de Projets

## Description

Créer une application de console Java pour la gestion des tâches et des projets. Cette application permet aux utilisateurs de créer, modifier et supprimer des projets, d'ajouter des tâches avec des échéances et des priorités, et de suivre l'avancement des tâches. Elle intègre également la génération de rapports d'activités. L'application utilise une base de données pour stocker les informations relatives aux projets et aux tâches, et applique des concepts avancés de Java pour offrir une expérience utilisateur améliorée, notamment le multithreading pour les tâches en arrière-plan.

## Fonctionnalités Clés

- **Gestion des projets :**
    - Créer, modifier et supprimer des projets.

- **Gestion des tâches :**
    - Ajouter des tâches à un projet avec des échéances et des priorités.
    - Modifier et supprimer des tâches.

- **Rapport d'activité :**
    - Générer des rapports d'avancement des projets et des tâches associées.
    - Utilisation des dernières nouveautés de Java pour le traitement des données et la mise en forme des rapports.

- **Multithreading :**
    - Exécution des tâches en arrière-plan, comme l'envoi de rappels et la génération de rapports.

- **Persistance des données :**
    - Utilisation de **JDBC** pour la connexion à une base de données relationnelle (MySQL, H2, etc.) afin de stocker et récupérer les informations sur les projets et les tâches.

## Design Patterns

L'application utilise plusieurs design patterns pour structurer et optimiser son architecture :

- **Singleton :** Pour la gestion de la connexion à la base de données.
- **Factory :** Pour créer des objets rapport en fonction des besoins.
- **Strategy :** Pour appliquer différentes stratégies de génération de rapports.

## Technologies

- **Langage :** Java
- **Base de données :** JDBC pour la connexion à une base de données relationnelle.
- **Multithreading :** Gestion des tâches en arrière-plan.
- **Design Patterns :** Singleton, Factory, Strategy.
- **Gestion des dépendances :** Maven/Gradle

## Prérequis

- **Java 11+** (ou version plus récente)
- **Maven/Gradle** pour la gestion des dépendances
- **Base de données relationnelle** (MySQL, H2, ou autre)
- **Driver JDBC** correspondant à votre base de données (ex. MySQL Connector)

## Installation

1. **Cloner le dépôt :**
   ```bash
   git clone https://github.com/votre-utilisateur/gestion-taches-projet-console.git
   cd gestion-taches-projet-console
