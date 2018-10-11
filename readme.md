# hack-cacf

Notre objectif est de conteneuriser et d'API-ser l’application containerbank afin de pouvoir la déployer sur le CaaS AWS. L'application monolithique sera composée d'un front et de quatre services avec leurs propres données, respectant ainsi l'architecture micro-services.

:construction: . .. ...projet en cours... .. .  :construction:

### Overview (target)
<img src="https://raw.githubusercontent.com/cacf-team/hack-cacf/master/readme_applications-overview.png"
     alt="Applications overview" />

### Application Architecture (Kubernetes)
<img src="https://raw.githubusercontent.com/cacf-team/hack-cacf/master/readme_containers-architecture.png"
     alt="Architecture applicative (Kubernetes)" />

### Good practices
**General**
- [ ] Sécurité
- [ ] Intégrité des données

**Architecture**
- [ ] Architecture micro-services
- [X] Architecture de données distribuées ou « sharding »
- [X] Architecture distribuée (pods Kubernetes)

**Services**
- [ ] API Manager
- [ ] Service Discovery
- [ ] MOM Service
- [ ] Monitoring & Alerting
- [ ] Logging & Diagnostics

**Application**
- [ ] Le code applicatif est versionné et unique pour tous les environnements
- [ ] L’application est conçue « sans état » technique
- [ ] Tolérance aux pannes (design for failure)
- [ ] Ajout d’un identifiant de corrélation aux logs
- [ ] Production de logs enrichies sur l’ensemble des couches
- [ ] Mise en place des tests de santé (Health Check)

**Container**
- [ ] Les instances d’application sont jetables
- [ ] Middlewares adaptés aux conteneurs
- [ ] Base de données Container Ready (mongoDB)
- [ ] Conteneur exécutant qu’un seul processus
- [ ] Conteneur écrivant que sur la sortie « stdout »
- [ ] Conteneur mis à jour par Rolling updates
- [ ] Conteneur consommant peu de ressources
- [ ] Des limites sur la consommation en ressources des conteneurs sont configurées
- [ ] Logs externalisées et centralisées
- [ ] Gestion centralisée des configurations du socle technique (ConfigMap)
- [ ] Toutes les données sensibles de connexion/authentification sont sécurisées (Secret)
- [ ] Tous les accès d’un conteneur vers un autre conteneur sont explicitement déclarés
- [ ] Le Dockerfile est considéré comme un fichier source
- [ ] Le descripteur d’application est considéré comme un fichier source
- [ ] Le package de l’application contient une/des image(s) ainsi qu’un descripteur

## Use cases

- [X] `ViewAdvisors` : voir une liste de conseillers et leurs spécialités (none, savings, credits ou insurance)<br/>
- [X] `ViewCustomer` : voir les informations relatives à un client<br/>
- [X] `EditCustomer` : mettre à jour les informations relatives à un client<br/>
- [X] `AddCustomer` : ajouter un nouveau client au système<br/>
- [X] `ViewCard` : voir les informations relatives à une carte bleue<br/>
- [X] `EditCard` : mettre à jour les informations relatives à une carte bleue<br/>
- [X] `AddCard` : ajouter une nouvelle carte bleue au système<br/>
- [X] `ViewPayment` : voir des informations relatives à l'historique de paiement d’une carte bleue<br/>
- [X] `AddPayment` : ajouter des informations relatives à un paiement (nature du paiement)<br/>
- [X] `Monitoring` : monitorer chaque appels et leur durée<br/>
- [X] `Logging` : centraliser les logs de l'application

## Resources

**Function Advisor**
```
    GET /advisors
    GET /specialties
```

**Function Customer**
```
    GET  /customers&lastName={lastName}
    GET  /customers/{customerId}
    POST /customers
    PUT  /customers/{customerId}
```

**Function Card**
```
    GET  /cards&customerId={customerId}
    GET  /cardTypes
    GET  /cards/{cardId}
    POST /cards
    PUT  /cards/{cardId}
```

**Function Payment**
```
    GET  /payments&cardId={cardId}
    POST /payments/
```



## Models

### Overview 
<img src="https://raw.githubusercontent.com/cacf-team/hack-cacf/master/readme_models-overview.png"
     alt="Models overview" />

### Description

**advisor**
```
{
  id              integer($int4)
  firstName       string
  lastName        string
  specialties     [
                    specialtyId    string
                  ]
}
```

**specialty**
```
{
  id      integer($int4)
  name    string
}
```

**customer**
```
{
  id              integer($int4)
  firstName       string
  lastName        string
  address         string
  city            string
  telephone       string
}
```

**card**
```
{
  id              integer($int4)
  name            string
  birthDate       string
  cardTypeId      integer($int4)
  customerId      integer($int4)
}
```

**cardType**
```
{
  id              integer($int4)
  name            string
}
```

**payment**
```
{
  id              integer($int4)
  paymentDate     string
  description     string
  cardId          integer($int4)
}
```


## Team 

- Jordan
- (Elyes)
- Manel
- Mahfoudh
